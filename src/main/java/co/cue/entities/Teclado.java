package co.cue.entities;

// Entidad de dominio concreta: Periférico de entrada estándar
public class Teclado extends ProductoFisico {
    public Teclado(String nombre, double precio, double peso) {
        super(nombre, precio, peso);
    }
    @Override
    // Define la política de envío estándar para periféricos resistentes
    public String getMetodoEnvio() {
        return "Paquetería Estándar";
    }
}