package co.cue.entities;

import co.cue.interfaces.Enviable;

public abstract class ProductoFisico extends Producto implements Enviable {
    protected double peso;

    public ProductoFisico(String nombre, double precio, double peso) {
        super(nombre, precio);
        this.peso = peso;
    }

    @Override
    public double getPeso() {
        return peso;
    }
}
