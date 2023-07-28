package almacenamiento;

import java.util.List;

public interface Bodeguero {

    void guardarTarea(String s);

    List<String> obtenerTareas();

    void removerTarea(int posicion);
}
