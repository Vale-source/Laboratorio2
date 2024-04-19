
package Ejercicio6;

public class Especie {
    private String nombreCientifico, nombreVulgar;
    private int numeroIndividuos;

    public Especie(String nombreCientifico, int numeroIndividuos, String nombreVulgar) {
        this.nombreCientifico = nombreCientifico;
        this.numeroIndividuos = numeroIndividuos;
        this.nombreVulgar = nombreVulgar;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreVulgar() {
        return nombreVulgar;
    }

    public void setNombreVulgar(String nombreVulgar) {
        this.nombreVulgar = nombreVulgar;
    }

    public int getNumeroIndividuos() {
        return numeroIndividuos;
    }

    public void setNumeroIndividuos(int numeroIndividuos) {
        this.numeroIndividuos = numeroIndividuos;
    }
}
