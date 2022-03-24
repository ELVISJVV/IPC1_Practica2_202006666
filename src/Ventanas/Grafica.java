
package Ventanas;


public class Grafica {
    private String nombre;
    private int cantidad;


    
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
