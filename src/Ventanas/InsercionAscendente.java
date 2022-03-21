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
public class InsercionAscendente extends Thread {

    JPanel panel;
    JLabel grafica_personas;
    boolean ordenado = false;

    public InsercionAscendente(JPanel panel) {
        this.panel = panel;

    }

    @Override
    public void run() {
        try {

            int j;
            Grafica aux;
            

            for (int i = 0; i < Static.contadorElementos; i++) { 

                j = i;           
                aux = Static.elementos[j];          
                while ((j >0 ) && ( Static.elementos[j-1].getCantidad()) > aux.getCantidad() ) {
                    Static.elementos[j] = Static.elementos[j-1];      
                    j--;
                    grafica_barras(panel);
                  

                }
                Static.elementos[j] = aux;      
                Thread.sleep(1000);
                Pasos.y++;
            }

            VentanaPrincipal.iniciaHilo = false;
            VentanaPrincipal.iniciaPasos = false;

        } catch (InterruptedException e) {
            System.out.println("Error al Ordenar");
        }
    }

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
