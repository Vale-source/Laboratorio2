package Ejercicio_1;

public class Pasajero extends Persona{
    private boolean pasaporte;

    public Pasajero(){

    }

    public Pasajero(int DNI, int edad, String nacionalidad, String nombre, String apellido, boolean pasaporte) {
        super(DNI, edad, nacionalidad, nombre, apellido);
        this.pasaporte = pasaporte;
    }

    public boolean isPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(boolean pasaporte) {
        this.pasaporte = pasaporte;
    }
}
