package co.cue.entities;

// Entidad de dominio concreta: Representa un libro digital
public class Ebook extends ProductoDigital {

    // Configuración de infraestructura (Simulada) para la generación de enlaces
    private static final String BASE_URL = "https://api.bookstore.com/download/";

    // Constructor que expone el estado variable (Tamaño)
    public Ebook(String nombre, double precio, double tamanoMB) {
        super(nombre, precio, tamanoMB);
    }

    @Override
    // Implementa la lógica específica de descarga para libros
    public String generarLink() {
        return BASE_URL + this.nombre.replace(" ", "%20");
    }
}