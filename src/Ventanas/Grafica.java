/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author Elvis
 */
public class Grafica {
    private String nombre;
    private int cantidad;

    //public Grafica(String nombre, int cantidad) {
     //   this.nombre = nombre;
    //    this.cantidad = cantidad;
   // }
    
        public Grafica(String nombre, String cantidad) {
        this.nombre = nombre;
        this.cantidad = Integer.parseInt(cantidad);
    }
    
    


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
