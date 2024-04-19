
package Ejercicio7;

public class Codigo {
    private int dorsal;
    private String nombrePrueba;

    public Codigo(int dorsal, String nombrePrueba) {
        this.dorsal = dorsal;
        this.nombrePrueba = nombrePrueba;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombrePrueba() {
        return nombrePrueba;
    }

    public void setNombrePrueba(String nombrePrueba) {
        this.nombrePrueba = nombrePrueba;
    }
}
