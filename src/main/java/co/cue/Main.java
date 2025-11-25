package co.cue;


import co.cue.entities.Antivirus;
import co.cue.entities.Producto;
import co.cue.entities.TecladoMecanico;
import co.cue.repository.InMemoryRepository;
import co.cue.repository.InventarioRepository;

public class Main {
    public static void main(String[] args) {
        // 1. Crear dependencias concretas
        InventarioRepository repo = new InMemoryRepository();

        // 2. Inyectar dependencias (Constructor Injection)
        GestorInventario gestor = new GestorInventario(repo);

        // 3. Ejecución con diferentes tipos (LSP en acción)
        Producto teclado = new TecladoMecanico("Keychron K2", 100.0, 1.5);
        Producto kaspersky = new Antivirus("Kaspersky Total", 50.0, "http://k.com/dl");

        System.out.println("--- Procesando Físico ---");
        gestor.registrarProducto(teclado);

        System.out.println("\n--- Procesando Digital ---");
        gestor.registrarProducto(kaspersky);
    }
}