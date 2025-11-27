package co.cue;
import co.cue.entities.Producto;
import co.cue.repository.InventarioRepository;
import co.cue.services.ProductoProcesador;
import java.util.List;
import java.util.logging.Logger;

public class GestorInventario {
    private static final Logger logger = Logger.getLogger(GestorInventario.class.getName());

    private final InventarioRepository repositorio;
    // El gestor tiene una lista de estrategias/procesadores
    private final List<ProductoProcesador> procesadores;

    // Inyección por Constructor:
    // Le pasamos el repositorio Y la lista de reglas de negocio activas.
    public GestorInventario(InventarioRepository repositorio, List<ProductoProcesador> procesadores) {
        this.repositorio = repositorio;
        this.procesadores = procesadores;
    }

    public void registrarProducto(Producto p) {
        repositorio.guardar(p);
        logger.info("Producto persistido correctamente. Iniciando procesadores...");
        for (ProductoProcesador proc : procesadores) {
            if (proc.puedeProcesar(p)) {
                proc.procesar(p);
            }
        }
    }
}