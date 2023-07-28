package gestion;

import almacenamiento.Bodeguero;
import almacenamiento.BodegueroImpl;

import java.util.List;

public class AdministradorImpl implements Administrador{
    Bodeguero bodeguero = new BodegueroImpl();
    @Override
    public void agregarTarea(String s) {
        Thread hilo = new Thread(new AccionNuevaTarea(bodeguero, s));

        hilo.start();

    }

    @Override
    public List<String> obtenerTareas() {
        return bodeguero.obtenerTareas();
    }

    @Override
    public void removerTarea(int posicion) {
        Thread hilo2 = new Thread(new AccionRemoverTarea(bodeguero, posicion));

        hilo2.start();
    }


}
