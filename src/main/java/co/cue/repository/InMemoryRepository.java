package co.cue.repository;

import co.cue.entities.Producto;

import java.util.logging.Logger;

// Implementación concreta en memoria (Volátil) para pruebas o desarrollo local
public class InMemoryRepository implements InventarioRepository {

    private static final Logger logger = Logger.getLogger(InMemoryRepository.class.getName());

    @Override
    // Simula el guardado del producto (Persistencia simulada sin base de datos real)
    public void guardar(Producto p) {
        logger.info(() -> "Guardando producto en memoria: " + p.getNombre());
    }
}
