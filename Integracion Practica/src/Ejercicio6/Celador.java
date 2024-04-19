package Ejercicio6;

public class Celador extends Personal{
    private Entradas entradas;

    public Celador(int dni, String nombre, String profesion, String direccion, int numCelular, float sueldo) {
        super(dni, nombre, profesion, direccion, numCelular, sueldo);
    }

    public Entradas getEntradas() {
        return entradas;
    }

    public void addEntradas(Entradas entradas) {
        this.entradas = entradas;
    }

    public void registrarVisitante(){

    }
}
