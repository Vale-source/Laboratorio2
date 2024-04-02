package Ejercicio1;

public class Lado {
    private Puntos [] lista_puntos = new Puntos[2];

    public Lado(Puntos[] lista_puntos, int x, int y, int x1, int y1) {
        this.lista_puntos[0] = new Puntos(x,y);
        this.lista_puntos[1] = new Puntos(x1,y1);
    }

    public Puntos[] getLista_puntos() {
        return lista_puntos;
    }

    public void setLista_puntos(Puntos[] lista_puntos) {
        this.lista_puntos = lista_puntos;
    }
}
