package co.cue.entities;
import co.cue.interfaces.Descargable;

// Capa intermedia: Centraliza el estado común de los productos intangibles
public abstract class ProductoDigital extends Producto implements Descargable {

    protected double tamanoMB;

    protected ProductoDigital(String nombre, double precio, double tamanoMB) {
        super(nombre, precio);
        this.tamanoMB = tamanoMB;
    }

    @Override
    public double getTamanoMB() {
        return tamanoMB;
    }

}
