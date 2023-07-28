package main;

import gestion.Administrador;
import gestion.AdministradorImpl;
import interfazusuario.ConsolaImpl;

public class Aplicacion {

    public static void main(String args[])
            throws InterruptedException {
        ConsolaImpl consola = new ConsolaImpl();
        Administrador administrador = new AdministradorImpl();
        int opcion = consola.mostrarmenu();

        while (opcion != 6) {
            if (opcion == 1) {
                String tarea = consola.leerTexto();
                administrador.agregarTarea(tarea);
            } else if (opcion == 2) {
                consola.mostrarTareas(administrador.obtenerTareas());
            } else if (opcion == 3) {
                int numero = consola.leerEntero();
                administrador.removerTarea(numero);
            }

            opcion = consola.mostrarmenu();
        }
    }
}
