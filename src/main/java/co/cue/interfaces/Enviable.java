package co.cue.interfaces;

// Capacidad para productos que requieren logística y transporte físico (ISP)
public interface Enviable {

    // Obtiene el peso físico para cálculos de flete
    double getPeso();

    // Define la estrategia de transporte requerida (ej. Estándar, Frágil)
    String getMetodoEnvio();
}
