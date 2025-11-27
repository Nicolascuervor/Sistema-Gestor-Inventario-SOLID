package co.cue.repository;

import co.cue.entities.Producto;

// Contrato abstracto para la persistencia de datos (Desacopla la infraestructura)
public interface InventarioRepository {

    // Persiste el producto en el almacenamiento configurado (BD, Memoria, etc.)
    void guardar(Producto p);
}
