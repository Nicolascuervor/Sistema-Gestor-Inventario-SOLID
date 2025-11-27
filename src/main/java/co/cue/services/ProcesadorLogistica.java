package co.cue.services;

import co.cue.entities.Producto;
import co.cue.interfaces.Enviable;

import java.util.logging.Logger;

// Estrategia concreta para gestionar la logística de productos físicos
public class ProcesadorLogistica implements ProductoProcesador {

    private static final Logger logger = Logger.getLogger(ProcesadorLogistica.class.getName());

    // Válida si el producto cumple con la capacidad de ser enviado (Interfaz Enviable)
    @Override
    public boolean puedeProcesar(Producto p) {
        return p instanceof Enviable;
    }

    // Ejecuta la simulación de envío (Solo si es Enviable)
    @Override
    public void procesar(Producto p) {
        // Pattern Matching: Verifica el tipo y asigna la variable 'item' en un paso
        if (p instanceof Enviable item) {
            logger.info(() -> String.format("[Logística] Generando guía de envío: %s", item.getMetodoEnvio()));
        }
    }
}