package co.cue.entities;


// Entidad de dominio concreta: Dispositivo de visualización (Requiere cuidado especial)
public class Monitor extends ProductoFisico {

    public Monitor(String nombre, double precio, double peso) {
        super(nombre, precio, peso);
    }

    @Override
    // Define la política de envío obligatoria para monitores (Regla de Negocio)
    public String getMetodoEnvio() {
        return "Transporte de Carga Frágil";
    }
}
