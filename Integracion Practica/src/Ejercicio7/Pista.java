
package Ejercicio7;

public class Pista {
    private int codigoEstacion, numCorrelativo;
    private String dificultad;
    private float kilometros;

    public Pista(int codigoEstacion, int numCorrelativo, String dificultad, float kilometros) {
        this.codigoEstacion = codigoEstacion;
        this.numCorrelativo = numCorrelativo;
        this.dificultad = dificultad;
        this.kilometros = kilometros;
    }

    public int getCodigoEstacion() {
        return codigoEstacion;
    }

    public void setCodigoEstacion(int codigoEstacion) {
        this.codigoEstacion = codigoEstacion;
    }

    public int getNumCorrelativo() {
        return numCorrelativo;
    }

    public void setNumCorrelativo(int numCorrelativo) {
        this.numCorrelativo = numCorrelativo;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public float getKilometros() {
        return kilometros;
    }

    public void setKilometros(float kilometros) {
        this.kilometros = kilometros;
    }
}
