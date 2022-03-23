/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Elvis
 */
public class AbrirArchivo {
    
     public AbrirArchivo (String archivo) {

        try {

            File objetofile = new File(archivo);
            Desktop.getDesktop().open(objetofile);

        } catch (IOException ex) {

            System.out.println(ex);

        }

    }
}
