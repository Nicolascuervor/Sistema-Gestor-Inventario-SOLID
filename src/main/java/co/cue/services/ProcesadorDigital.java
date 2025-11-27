package co.cue.services;

import co.cue.entities.Producto;
import co.cue.interfaces.Descargable;

import java.util.logging.Logger;

// Estrategia concreta para gestionar la entrega de productos digitales (descargas)
public class ProcesadorDigital implements ProductoProcesador {

    private static final Logger logger = Logger.getLogger(ProcesadorDigital.class.getName());

    // Válida si el producto cumple con la capacidad de ser descargado (Interfaz Descargable)
    @Override
    public boolean puedeProcesar(Producto p) {
        return p instanceof Descargable;
    }

    // Ejecuta la simulación de entrega digital (Solo si es Descargable)
    @Override
    public void procesar(Producto p) {
        // Pattern Matching: Verifica el tipo y asigna la variable 'item'
        if (p instanceof Descargable item) {
            logger.info(() -> String.format("[Digital] Enviando email con link. Tamaño: %.2f MB", item.getTamanoMB()));
        }
    }
}