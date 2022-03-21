/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
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
public class MetodoBurbuja extends Thread {

    JPanel panel;
    JLabel grafica_personas;
    boolean ordenado = false;

    public MetodoBurbuja(JPanel panel) {
        this.panel = panel;
        // grafica_personas = new JLabel();
        // grafica_personas.setBounds(20, 20, 620, 300);
        //grafica_personas.setOpaque(true);
        // grafica_personas.setVisible(true);
        //grafica_personas.setBackground(Color.WHITE);
        //panel.add(grafica_personas);
        //grafica_barras(panel, grafica_personas);
        grafica_barras(panel);
    }

    @Override
    public void run() {
        try {
            //aqui empieza el metodo burbuja
            Grafica aux;
            int bandera =1;
            /*
                  for (int i = 0; i < Static.contadorElementos-1 && bandera==1; i++) {
           bandera=0;
                   
           for (int j = 0; j < Static.contadorElementos - 1; j++) {

                    if (Static.elementos[j].getCantidad() >Static.elementos[j+1].getCantidad()) {
                        bandera=1;
                        aux = Static.elementos[j];
                        Static.elementos[j] = Static.elementos[j+1];
                        Static.elementos[j+1] = aux;
                        // grafica_barras(panel,grafica_personas);
                        grafica_barras(panel);

                        Pasos.y++;
                       
                       
                    }

                    Thread.sleep(1000);
                    // VentanaPrincipal.steps++;
                     
                   
                }

            }
            */
      
            
            
            for (int i = 0; i < Static.contadorElementos - 1; i++) {
           
                for (int j = 0; j < Static.contadorElementos - i - 1; j++) {

                    if (Static.elementos[j + 1].getCantidad() < Static.elementos[j].getCantidad()) {
                        aux = Static.elementos[j + 1];
                        Static.elementos[j + 1] = Static.elementos[j];
                        Static.elementos[j] = aux;
                        // grafica_barras(panel,grafica_personas);
                        grafica_barras(panel);

                        Pasos.y++;
                       
                       
                    }

                    Thread.sleep(1000);
                    // VentanaPrincipal.steps++;
                     
                   
                }

            }
            
            

           VentanaPrincipal.iniciaHilo = false;
           VentanaPrincipal.iniciaPasos = false;

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
            //  panel_grafica.setMouseWheelEnabled(true);
            // panel.setLayout(new BorderLayout());
            // grafica_personas.setLayout(new java.awt.BorderLayout());
            //   grafica_personas.add(panel_grafica, BorderLayout.CENTER);
            //   grafica_personas.validate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
