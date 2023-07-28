package gestion;

import almacenamiento.Bodeguero;

class AccionRemoverTarea implements Runnable {
    Bodeguero bodeguero;
    int posicion;
    public AccionRemoverTarea(Bodeguero bodeguero, int posicion) {
        this.bodeguero = bodeguero;
        this.posicion = posicion;
    }

    @Override
    public void run() {
        bodeguero.removerTarea(posicion);
    }
}
