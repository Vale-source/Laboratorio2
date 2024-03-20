package Clases;

public class Piloto extends Persona {
    private String experiencia;
    private int id;

    public Piloto(){

    }

    public Piloto(int dni, int edad, String nacionalidad, String nombre_apellido, String experiencia, int id) {
        super(dni, edad, nacionalidad, nombre_apellido);
        this.experiencia = experiencia;
        this.id = id;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "{" +
                " Experiencia='" + experiencia + '\'' +
                ", Id=" + id +
                ", Dni=" + dni +
                ", Edad=" + edad +
                ", Nacionalidad='" + nacionalidad + '\'' +
                ", Nombre y apellido='" + nombre_apellido + '\'' +
                '}';
    }
}
