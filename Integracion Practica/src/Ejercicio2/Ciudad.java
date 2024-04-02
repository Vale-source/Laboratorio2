package Ejercicio2;

public class Ciudad {
    private boolean capital;
    private String nombre;

    public Ciudad(boolean capital, String nombre) {
        this.capital = capital;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCapital() {
        return capital;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
