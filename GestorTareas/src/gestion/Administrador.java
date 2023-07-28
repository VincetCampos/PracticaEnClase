package gestion;

import java.util.List;

public interface Administrador {
    public void agregarTarea(String s);
    public List<String> obtenerTareas();

    public void removerTarea(int posicion);
}
