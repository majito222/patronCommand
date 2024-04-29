import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

interface Tarea {
    String getDescripcion();
    void setEstado(EstadoTarea estado);
    EstadoTarea getEstado();
    void setFechaCreacion(long fechaCreacion);
    long getFechaCreacion();
}