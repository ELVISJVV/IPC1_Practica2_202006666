/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
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
public class MetodosSueltos {
      // static Grafica[] elementos;
      // static  int contadorElementos=0;
        static String nombrebarras = "";
       static String nombrenumeracion = "";
    public String obtenerTexto(String ruta) {
        
        String texto = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta)); 
            String linea; 
            while((linea = br.readLine()) != null) { //leer
                //área de lectura línea por línea, estructura: categoria,valor  [Salto de linea]  pollo,10
                String columnas[] = linea.split(",");
               // texto += "Categoria: " + columnas[0] + "   |    Valor:" + columnas[1]+"\n";
                texto +=   columnas[0]  + columnas[1]+"\n";
            } 
            br.close(); //cerrar el flujo y liberar recursos
        } catch(IOException e) {
           //en caso de error 
        }
        
        return texto; //retornar lectura de las lineas concatenadas del archivo 
    }
    public MetodosSueltos(String ruta, JPanel panel, String titulo){
        Static.elementos  = new Grafica[700];     
        Static.contadorElementos=0;
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        String texto = "";
     
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            String linea;
            while ((linea = br.readLine()) != null) { //leer
                //área de lectura línea por línea, estructura: categoria,valor  [Salto de linea]  pollo,10
                String columnas[] = linea.split(",");
                // texto += "Categoria: " + columnas[0] + "   |    Valor:" + columnas[1]+"\n"; 
                //texto += columnas[0] + columnas[1] + "\n";

                if (MetodosSueltos.validaNumeroEntero_Exp(columnas[1])) {
                    int numEntero = Integer.parseInt(columnas[1]);
                    data.setValue(numEntero, columnas[0], " ");
                    Grafica a = new Grafica(columnas [0],columnas[1]);
                    Static.elementos[Static.contadorElementos]=a;
                    Static.contadorElementos++;
                } else if (!MetodosSueltos.validaNumeroEntero_Exp(columnas[1])) {
                    nombrebarras = columnas[0];
                    nombrenumeracion = columnas[1];

                }
               
            }

            br.close(); //cerrar el flujo y liberar recursos
        } catch (IOException e) {
            //en caso de error 
        }
   
                    for (int i = 0; i < Static.contadorElementos; i++) {
                System.out.println(Static.elementos[i]+"   ");
            }

        JFreeChart barras = ChartFactory.createBarChart(titulo, nombrebarras, nombrenumeracion, data, PlotOrientation.VERTICAL, true, true, false);
        ChartPanel panel1 = new ChartPanel(barras);
       //panel1.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(500, 540));

        panel.setLayout(new BorderLayout());
        panel.add(panel1, BorderLayout.CENTER);
         panel.validate();
        //pack();
        //panel.repaint();

        
        
    }
    
    
    public String leerTxt(String dirreccion){
        String texto = "";
        
        return texto;
    }
     public static boolean validaNumeroEntero_Exp(String texto) {
        return texto.matches("^-?[0-9]+$");
    }
}
