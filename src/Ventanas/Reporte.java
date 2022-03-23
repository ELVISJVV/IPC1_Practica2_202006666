/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import static java.awt.PageAttributes.MediaType.A;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import javax.swing.JPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;

/**
 *
 * @author Elvis
 */
public class Reporte {

    //   private Dato[] datos;
    private JPanel panel;
    private JFreeChart barras;
    private Random rand;
    private String a = "";

    public Reporte(String velocidad, String tipo, String ordenamiento, int pasos, String timer) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("A:\\Programas Java\\Practica2_Graficas\\IPC1_Practica2_202006666\\reporte.html"))) {

            String primeraParte = "<head>\n"
                    + "    <title> Reporte </title>\n"
                    +"<meta http-equiv=\"Content-Type\" content=\"text/html\" charset=\"UTF-8\" />"
                    + "    <meta charset=\"UTF-8\">\n"
                    + "    <meta name=\"viewport\" content=\"widht>\n"
                    + "</head>\n"
                    + "<body>\n"
                    + "    <p style=\"text-align: center;\">&nbsp;</p>\n"
                    + "<h1 style=\"text-align: center; color: #3f7320;\">Elvis Joseph V&aacute;squez Villatoro</h1>\n"
                    + "<h1 style=\"text-align: center; color: #3f7320;\">202006666</h1>\n"
                    + "<hr /><!-- Este comentario es visible solo en el editor fuente -->\n"
                    + "<h2 style=\"text-align: center;\"><strong>Detalle de Ordenamiento&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</strong><strong>Detalle de Ejecuci&oacute;n</strong></h2>\n"
                    + "<p style=\"text-align: center;\">&nbsp;</p>\n"
                    + "<p style=\"text-align: center;\"><strong>Algoritmo:&nbsp;</strong>" + ordenamiento + "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<strong>Tiempo:&nbsp; &nbsp; &nbsp; &nbsp; </strong>" + timer + "</p>\n"
                    + "<p style=\"text-align: center;\"><strong>Tipo:&nbsp;</strong>" + tipo + "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<strong>Pasos:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</strong>" + pasos + "</p>\n"
                    + "<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp;<strong>Velocidad: </strong>&nbsp; " + velocidad + "&nbsp;</p>\n"
                    + "<p style=\"text-align: center;\">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <strong>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</strong></p>\n"
                    + "<hr />\n"
                    + "<h2 style=\"text-align: center;\"><strong>Estado Inicial</strong></h2>\n"
                    + "<br>\n"
                    + "<br>\n"
                    + MetodosSueltos.tablaNormal + "\n";

            String segundaParte
                    = "<p><img class=\"imageCenter\" style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"name.png\"  width=\"600\" height=\"450\" /></p>\n"
                    + "<hr />\n"
                    + "<h2 style=\"text-align: center;\"><strong>Estado Final</strong></h2>\n"
                    +MetodosSueltos.tablaOrdenada
                    + "<p><img class=\"imageCenter\" style=\"display: block; margin-left: auto; margin-right: auto;\" src=\"ordenada.png\" alt=\"\" width=\"600\" height=\"450\" /></p>\n"
                    + "    </body>\n"
                    + "\n"
                    + "</html>";

            bw.write(primeraParte + segundaParte);

        } catch (IOException ex) {

        }
    }

}
