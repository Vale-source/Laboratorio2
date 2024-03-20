package Clases;

public class Pasajero extends Persona {
    private boolean legal;
    private String pasaporte;

    public Pasajero() {

    }

    public Pasajero(int dni, int edad, String nacionalidad, String nombre_apellido, boolean legal, String pasaporte) {
        super(dni, edad, nacionalidad, nombre_apellido);
        this.legal = legal;
        this.pasaporte = pasaporte;
    }

    public boolean isLegal() {
        return legal;
    }

    public void setLegal(boolean legal) {
        this.legal = legal;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    @Override
    public String toString() {
        return "{" +
                " Legal =" + legal +
                ", Pasaporte ='" + pasaporte + '\'' +
                ", Dni =" + dni +
                ", Edad =" + edad +
                ", Nacionalidad ='" + nacionalidad + '\'' +
                ", Nombre y apellido ='" + nombre_apellido + '\'' +
                '}';
    }
}