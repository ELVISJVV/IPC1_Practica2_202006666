/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import javax.swing.JLabel;

/**
 *
 * @author Elvis
 */
public class Pasos extends Thread {

    JLabel eti;
    static int y=0;
    Pasos(JLabel pasos) {
        VentanaPrincipal.steps=0;
        this.eti = pasos;
        
    }
    public void run(){
        
         try{
             int x=0;
            
            while (VentanaPrincipal.iniciaPasos) {
                //Thread.sleep(10);
                //System.out.println(x);
                //ejecutarHiloCronometro(x);
                ejecutarPasos(x);
                System.out.println(y);
                //y++;
            }
                    
        }catch(Exception e){
            System.out.println("Error hilo"+ e.getMessage());
        }
        
    }
    private synchronized void ejecutarPasos(int x){
        
        VentanaPrincipal.steps++;
        String text="";
                text+=y;
        eti.setText(text);
    }

}
