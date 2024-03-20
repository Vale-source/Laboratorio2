package Ejercicio_1;

public class Vuelo {
    private String destino, origen;
    private int horario;

    public Vuelo(){

    }

    public Vuelo(String destino, String origen, int horario) {
        this.destino = destino;
        this.origen = origen;
        this.horario = horario;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }
}
