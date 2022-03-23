/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import static Ventanas.MetodosSueltos.nombrebarras;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
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
    int velocidad;

    public MetodoBurbuja(JPanel panel, int velocidad) {
        this.panel = panel;
        this.velocidad = velocidad;
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
            int bandera = 1;
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
            }        */
            for (int i = 0; i < Static.contadorElementos - 1; i++) {

                for (int j = 0; j < Static.contadorElementos - i - 1; j++) {

                    if (Static.elementos[j + 1].getCantidad() < Static.elementos[j].getCantidad()) {
                        aux = Static.elementos[j + 1];
                        Static.elementos[j + 1] = Static.elementos[j];
                        Static.elementos[j] = aux;
                        // grafica_barras(panel,grafica_personas);
                        grafica_barras(panel);

                        Pasos.y++;

                        Thread.sleep(velocidad);
                    }

                }

            }

            VentanaPrincipal.iniciaHilo = false;
            VentanaPrincipal.iniciaPasos = false;
            grafica_barras(panel);

            String a = "";

            a = "<div style=\"text-align:center;\">\n"
                    + "	<table border=\"1\" style=\"margin: 0 auto;\">";
            a += "\n";
            a += "	<TR><TH>" + MetodosSueltos.nombrebarras + "</TH>\n";
            for (int i = 0; i < Static.contadorElementos; i++) {
                a
                        += "		<TD>" + Static.elementos[i].getNombre() + "</TD> \n";

            }
            a += "	<TR><TH>" + MetodosSueltos.nombrenumeracion + "</TH>\n";
            for (int i = 0; i < Static.contadorElementos; i++) {
                a += "		<TD>" + Static.elementos[i].getCantidad() + "</TD> \n";
            }
            a += "</TABLE>";
            MetodosSueltos.tablaOrdenada = a;
            System.out.println(MetodosSueltos.tablaOrdenada);
            Reporte report = new Reporte(VentanaPrincipal.velocidadReporte, VentanaPrincipal.tipoReporte, VentanaPrincipal.ordenamientoReporte, Pasos.y, Cronometro.timer);

           AbrirArchivo openFile = new AbrirArchivo("A:\\Programas Java\\Practica2_Graficas\\IPC1_Practica2_202006666\\reporte.html");

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
            //panel.validate();

            if (VentanaPrincipal.iniciaHilo == false && VentanaPrincipal.iniciaPasos == false) {
                final File file = new File("A:\\Programas Java\\Practica2_Graficas\\IPC1_Practica2_202006666\\ordenada.png"); //Definición del archivo con nombre y extensión
                ChartUtilities.saveChartAsPNG(file, barras, 800, 500); //Generar gráfica en formato PNG
                System.out.println("imagengenerada");

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
}
