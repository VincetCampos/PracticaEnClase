package interfazusuario;

import java.util.List;

public interface Consola {
    int mostrarmenu();

    String leerTexto();

    void mostrarTareas(List<String> strings);

    int leerEntero();
}
