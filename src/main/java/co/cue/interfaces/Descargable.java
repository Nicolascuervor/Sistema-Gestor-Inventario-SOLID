package co.cue.interfaces;

// Capacidad para productos intangibles que se distribuyen vía red (ISP)
public interface Descargable {
    // Metadata técnico del archivo
    double getTamanoMB();

    // Genera el acceso al recurso digital (URL, Token, etc.)
    String generarLink();
}
