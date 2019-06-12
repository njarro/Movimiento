/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga;

/**
 *
 * @author Estudiante
 */
public class Carro extends Objeto{
   

    public Carro(int x, int y) {
        super(x, y);
        Chasis chasis=new Chasis(10,10);
        Llanta[] llanta=new Llanta[2];
        Llanta llanta1=new Llanta(20,20);
        Llanta llanta2=new Llanta(20,20);
        llanta1=llanta[0];
        llanta2=llanta[1];
        
        
    }

    @Override
    public void mover() {
        this.x+=10;
        if(x==300){
            x=0;
        }
    }
    
    
}
