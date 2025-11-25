package co.cue.repository;

import co.cue.entities.Producto;

public class InMemoryRepository implements InventarioRepository {
    @Override
    public void guardar(Producto p) {
        System.out.println("Guardando '" + p.getNombre() + "' en Array en memoria.");
    }
}
