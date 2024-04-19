
package Ejercicio6;
public class Reservas {
    private int fechaInicio, fechFin;
    private Persona persona;

    public Reservas(int fechaInicio, int fechFin) {
        this.fechaInicio = fechaInicio;
        this.fechFin = fechFin;
    }

    public int getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(int fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getFechFin() {
        return fechFin;
    }

    public void setFechFin(int fechFin) {
        this.fechFin = fechFin;
    }

    public Persona getPersona() {
        return persona;
    }

    public void addPersona(Persona persona) {
        this.persona = persona;
    }
}
