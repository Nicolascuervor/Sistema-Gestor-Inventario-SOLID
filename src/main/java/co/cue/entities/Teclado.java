package co.cue.entities;

public class Teclado extends ProductoFisico {
    public Teclado(String nombre, double precio) {
        super(nombre, precio, 1.2);
    }

    @Override
    public String getMetodoEnvio() {
        return "Paquetería Estándar";
    }
}