package almacenamiento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BodegueroImpl implements Bodeguero{
    List<String> listaTareas = Collections.synchronizedList(new ArrayList());

    @Override
    public void guardarTarea(String s) {
        listaTareas.add(s);
    }

    @Override
    public List<String> obtenerTareas() {
        return listaTareas;
    }

    @Override
    public void removerTarea(int posicion) {
        listaTareas.remove(posicion);
    }
}
