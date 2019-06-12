/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author Estudiante
 */
public class Animacion extends AnimationTimer {
       private Carro carro;
        private GraphicsContext lapiz;

    public Animacion(GraphicsContext lapiz) {
        this.carro = new Carro(0,100);
        this.lapiz = lapiz;
    }
        
    @Override
    public void handle(long l) {
        lapiz.clearRect(0, 0, 300, 300);
        lapiz.fillRect(this.carro.getX(),this.carro.getY(), 30, 30);
        
        this.carro.mover();
        
        
    }
    
}
