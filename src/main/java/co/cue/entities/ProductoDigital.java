package co.cue.entities;


import co.cue.interfaces.Descargable;

public abstract class ProductoDigital extends Producto implements Descargable {
    protected double tamanoMB;

    public ProductoDigital(String nombre, double precio, double tamanoMB) {
        super(nombre, precio);
        this.tamanoMB = tamanoMB;
    }

    @Override
    public double getTamanoMB() {
        return tamanoMB;
    }
}
