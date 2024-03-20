package Ejercicio_1;

public class Reserva {
    private int nro_asientos,nro_ticket;

    private Vuelo vuelo;

    private Pasajero pasajero;

    public Reserva(){

    }

    public Reserva(int nro_asientos, int nro_ticket, Pasajero pasajero, int DNI, int edad, String nacionalidad, String nombre, String apellido, boolean pasaporte) {
        this.nro_asientos = nro_asientos;
        this.nro_ticket = nro_ticket;
        this.pasajero = new Pasajero(DNI,edad,nacionalidad,nombre,apellido,pasaporte);
    }

    public int getNro_asientos() {
        return nro_asientos;
    }

    public void setNro_asientos(int nro_asientos) {
        this.nro_asientos = nro_asientos;
    }

    public int getNro_ticket() {
        return nro_ticket;
    }

    public void setNro_ticket(int nro_ticket) {
        this.nro_ticket = nro_ticket;
    }

    public void AgregarVuelo(Vuelo vuelo){
        this.vuelo = vuelo;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }
}
