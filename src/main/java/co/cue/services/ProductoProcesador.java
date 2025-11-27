package co.cue.services;

import co.cue.entities.Producto;

// Contrato para definir acciones desacopladas sobre los productos (Patrón Strategy)
public interface ProductoProcesador {
    // Determina si esta estrategia aplica para el producto actual
    boolean puedeProcesar(Producto p);

    // Ejecuta la lógica de negocio específica
    void procesar(Producto p);
}
