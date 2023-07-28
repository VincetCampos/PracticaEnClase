package gestion;

import almacenamiento.Bodeguero;

class AccionNuevaTarea implements Runnable {
    Bodeguero bodeguero;
    String textoTarea;
    public AccionNuevaTarea(Bodeguero bodeguero, String s) {
        this.bodeguero = bodeguero;
        this.textoTarea = s;
    }

    @Override
    public void run() {
        bodeguero.guardarTarea(textoTarea);
    }
}
