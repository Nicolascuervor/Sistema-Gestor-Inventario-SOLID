package co.cue.entities;

public class Ebook extends ProductoDigital {
    public Ebook(String nombre, double precio) {
        super(nombre, precio, 15.0); // 15MB
    }

    @Override
    public String generarLink() {
        return "https://api.bookstore.com/download/" + this.nombre;
    }
}
