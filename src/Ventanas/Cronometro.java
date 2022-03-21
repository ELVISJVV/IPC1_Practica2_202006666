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
public class Cronometro extends Thread {

    JLabel eti;
    static int x = 0;

    Cronometro(JLabel cronometro) {
        VentanaPrincipal.hora = 0;
        VentanaPrincipal.segundo = 0;
        VentanaPrincipal.minuto = 0;
        this.eti = cronometro;

    }

    public void run() {
        try {
            x = 0;

            while (VentanaPrincipal.iniciaHilo) {
                Thread.sleep(10);
                //System.out.println(x);
                ejecutarHiloCronometro(x);
                x++;
            }

        } catch (Exception e) {
            System.out.println("Error hilo" + e.getMessage());
        }
    }

    private synchronized void ejecutarHiloCronometro(int x) {

        // System.out.println(x+ " - " + Thread.currentThread().getName());
        VentanaPrincipal.segundo++;
        if (VentanaPrincipal.segundo > 59) {
            VentanaPrincipal.segundo = 0;
            VentanaPrincipal.minuto++;

        }
        if (VentanaPrincipal.minuto > 59) {
            VentanaPrincipal.minuto = 0;
            VentanaPrincipal.hora++;

        }
        String textoSeg = "", textMin = "", textHora = "";

        if (VentanaPrincipal.segundo < 10) {
            textoSeg = "0" + VentanaPrincipal.segundo;
        } else {
            textoSeg = "" + VentanaPrincipal.segundo;
        }

        if (VentanaPrincipal.minuto < 10) {
            textMin = "0" + VentanaPrincipal.minuto;
        } else {
            textMin = "" + VentanaPrincipal.minuto;
        }

        if (VentanaPrincipal.hora < 10) {
            textHora = "0" + VentanaPrincipal.hora;
        } else {
            textHora = "" + VentanaPrincipal.hora;
        }

        //textoSeg+=VentanaPrincipal.segundo;
        //textMin+=VentanaPrincipal.minuto;
        String reloj = textHora + ":" + textMin + ":" + textoSeg;
        eti.setText(reloj);

    }
}
