package co.cue.entities;

public class Monitor extends ProductoFisico {
    public Monitor(String nombre, double precio) {
        super(nombre, precio, 5.5);
    }

    @Override
    public String getMetodoEnvio() {
        return "Transporte de Carga Frágil";
    }
}
