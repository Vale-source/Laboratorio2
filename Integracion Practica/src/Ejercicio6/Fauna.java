
package Ejercicio6;

import java.util.ArrayList;

public class Fauna extends Especie {
    private String alimentacion;
    private ArrayList<Fauna> listaAlimento = new ArrayList<>();
    private int periodoCelo;

    public Fauna(String nombreCientifico, int numeroIndividuos, String nombreVulgar, String alimentacion, int periodoCelo) {
        super(nombreCientifico, numeroIndividuos, nombreVulgar);
        this.alimentacion = alimentacion;
        this.periodoCelo = periodoCelo;
    }

    public void addAlimento(Fauna f){
        listaAlimento.add(f);
    }

    public ArrayList<Fauna> getListaAlimento() {
        return listaAlimento;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public int getPeriodoCelo() {
        return periodoCelo;
    }

    public void setPeriodoCelo(int periodoCelo) {
        this.periodoCelo = periodoCelo;
    }
}
