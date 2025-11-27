package co.cue.entities;

import co.cue.interfaces.Enviable;

// Capa intermedia: Centraliza el estado común de los productos tangibles
public abstract class ProductoFisico extends Producto implements Enviable {

    protected double peso;

    protected ProductoFisico(String nombre, double precio, double peso) {
        super(nombre, precio);
        this.peso = peso;
    }

    @Override
    public double getPeso() {
        return peso;
    }

}
