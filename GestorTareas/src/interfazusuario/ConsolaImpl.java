package interfazusuario;

import java.util.List;
import java.util.Scanner;

public class ConsolaImpl implements Consola {
    @Override
    public int mostrarmenu(){
        System.out.println("1. Agregar tarea");
        System.out.println("2. Mostrar tareas");
        System.out.println("3. Borrar tareas");
        System.out.println("6. Salir");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    };

    @Override
    public String leerTexto(){
        System.out.println("Ingrese texto de la tarea");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    @Override
    public void mostrarTareas(List<String> strings) {
        System.out.println("Listado de tareas");
        for(String s: strings){
            System.out.println(s);
        }
    }

    @Override
    public int leerEntero() {
        System.out.println("Ingrese la posicion");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
