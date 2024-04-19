
package Ejercicio6;
public class Flora extends Especie{
    private boolean floracion;
    private int periodoFloracion;

    public Flora(String nombreCientifico, int numeroIndividuos, String nombreVulgar, boolean floracion, int periodoFloracion) {
        super(nombreCientifico, numeroIndividuos, nombreVulgar);
        this.floracion = floracion;
        this.periodoFloracion = periodoFloracion;
    }

    public boolean isFloracion() {
        return floracion;
    }

    public void setFloracion(boolean floracion) {
        this.floracion = floracion;
    }

    public int getPeriodoFloracion() {
        return periodoFloracion;
    }

    public void setPeriodoFloracion(int periodoFloracion) {
        this.periodoFloracion = periodoFloracion;
    }
}
