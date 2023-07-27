public class MainClass{
    static ImInterfaz interfaz = new InterfazInicio();
    public static void Main(string[] args){
        Thread hilo1 = new Thread(crearComentario);
        Thread hilo2 = new Thread(mostrarComentario);

        hilo1.Start();
        hilo2.Start();

        hilo1.Join();
        hilo2.Join();

        
    }

    static void crearComentario(){
        string crearComentario = interfaz.crear();
        Console.WriteLine(crearComentario);
    }

    static void mostrarComentario(){
        string mostrarComentario = interfaz.mostrar();
        Console.WriteLine(mostrarComentario);
    }
}