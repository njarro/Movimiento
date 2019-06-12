/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class Ga extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane panel = new Pane(); 
        Canvas tablero=new Canvas(300,300);
        panel.getChildren().add(tablero);
        Scene escena =new Scene(panel,300,300,Color.WHITE);
        GraphicsContext lapiz=tablero.getGraphicsContext2D();
        
        Animacion animacion=new Animacion(lapiz);
        animacion.start();
        primaryStage.setScene(escena);
        primaryStage.setTitle("Escenario Inte");
        primaryStage.show();   
    }
    
}
