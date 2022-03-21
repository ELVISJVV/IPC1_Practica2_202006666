/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Elvis
 */
public class SeleccionDescendente extends Thread{
    JPanel panel;
    JLabel grafica_personas;
    public SeleccionDescendente(JPanel panel) {
        this.panel = panel;

        grafica_barras(panel);
    }
  @Override
    public void run() {
        try {
            //aqui empieza el metodo burbuja
            Grafica aux;
            int indiceMinimo,auxiliar;

            for (int i = 0; i < Static.contadorElementos; i++) {
                indiceMinimo = i;
                for (int j = i + 1; j < Static.contadorElementos; j++) {
                    if (Static.elementos[j].getCantidad() > Static.elementos[indiceMinimo].getCantidad()) {
                        indiceMinimo = j;
                        Pasos.y++;//contador pasos, no se utiliza en el ordenamiento
                        Thread.sleep(500);
                    }
                    aux = Static.elementos[i];
                    Static.elementos[i] = Static.elementos[indiceMinimo];
                    Static.elementos[indiceMinimo] = aux;
                    grafica_barras(panel);
                   
                    
                }

            }
            for (int i = 0; i < Static.contadorElementos; i++) {
                System.out.println(Static.elementos[i].getCantidad()+ Static.elementos[i].getNombre());
            }
            VentanaPrincipal.iniciaHilo = false; //finaliza hilo cronometro
            VentanaPrincipal.iniciaPasos = false; // finaliza hilo pasos

        } catch (InterruptedException e) {
            System.out.println("Error al Ordenar");
        }
    }

    //public void grafica_barras(JPanel panel,JLabel grafica_personas ) {
    public void grafica_barras(JPanel panel) {
        try {
            DefaultCategoryDataset datos = new DefaultCategoryDataset();  // guardaremos la informacion para la grafica
            for (int i = 0; i < Static.contadorElementos; i++) {
                datos.setValue(Static.elementos[i].getCantidad(), Static.elementos[i].getNombre(), "");
            }
            JFreeChart barras = ChartFactory.createBarChart(VentanaPrincipal.titulos //titulo de grafica
                    ,
                     MetodosSueltos.nombrebarras // nombre de eje x
                    ,
                     MetodosSueltos.nombrenumeracion, // nombre eje y
                    datos, // informacion que usará
                    PlotOrientation.VERTICAL,// orientacion de la grafica 
                    true,// lengenda de barras individuales por color  
                    true,// herramientas
                    false);// url de grafico

            ChartPanel panel_grafica = new ChartPanel(barras);
            panel.setPreferredSize(new Dimension(500, 540));

            panel.setLayout(new BorderLayout());
            panel.add(panel_grafica, BorderLayout.CENTER);
            panel.validate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
