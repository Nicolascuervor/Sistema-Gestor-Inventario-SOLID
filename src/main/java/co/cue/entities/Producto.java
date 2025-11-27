package co.cue.entities;

// Abstracción base que define la identidad común de cualquier ítem (No instanciable)
public abstract class Producto {

    // Estado compartido accesible por las subclases (Herencia)
    protected String nombre;
    protected double precio;

    // Constructor protegido: Solo puede ser invocado por las clases hijas (super)
    protected Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }
}
