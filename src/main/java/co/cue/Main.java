package co.cue;

import co.cue.entities.Ebook;
import co.cue.entities.Monitor;
import co.cue.entities.Producto;
import co.cue.entities.Teclado;
import co.cue.repository.InMemoryRepository;
import co.cue.repository.InventarioRepository;
import co.cue.services.ProcesadorDigital;
import co.cue.services.ProcesadorLogistica;
import co.cue.services.ProductoProcesador;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Configuración de dependencias
        InventarioRepository repo = new InMemoryRepository();
        List<ProductoProcesador> reglas = new ArrayList<>();
        reglas.add(new ProcesadorLogistica());
        reglas.add(new ProcesadorDigital());

        GestorInventario gestor = new GestorInventario(repo, reglas);

        // Un teclado mecánico pesado
        Producto tecladoGamer = new Teclado("Corsair K95", 200.0, 1.8);

        // Monitores
        Producto monitorHP = new Monitor("Monitor HP", 300.0, 5.5);
        Producto monitorASUS = new Monitor("Monitor ZEN ASUS", 3000.0, 50.5);

        // Un teclado de oficina ligero
        Producto tecladoOficina = new Teclado("Genius Slim", 15.0, 0.4);

        // Ebook ligero
        Producto libroPeque = new Ebook("El Principito", 10.0, 2.5);

        // Ebook pesado (con imágenes)
        Producto libroArte = new Ebook("Arte de Java", 50.0, 120.0);

        gestor.registrarProducto(tecladoGamer);
        gestor.registrarProducto(tecladoOficina);
        gestor.registrarProducto(monitorHP);
        gestor.registrarProducto(monitorASUS);
        gestor.registrarProducto(libroArte);
        gestor.registrarProducto(libroPeque);

    }
}