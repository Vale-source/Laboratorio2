package Ejercicio_1;

public class Piloto extends Persona implements Volador{
    private int matricula_piloto;

    public Piloto(){

    }

    public Piloto(int DNI, int edad, String nacionalidad, String nombre, String apellido, int matricula_piloto) {
        super(DNI, edad, nacionalidad, nombre, apellido);
        this.matricula_piloto = matricula_piloto;
    }

    public int getMatricula_piloto() {
        return matricula_piloto;
    }

    public void setMatricula_piloto(int matricula_piloto) {
        this.matricula_piloto = matricula_piloto;
    }

    @Override
    public void volador() {
        System.out.println("Esta persona puede pilotar un avion");
    }
}
