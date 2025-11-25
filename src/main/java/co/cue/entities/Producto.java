package co.cue.entities;

public abstract class Producto {
    protected String nombre;
    protected double precio;

    protected Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

}
