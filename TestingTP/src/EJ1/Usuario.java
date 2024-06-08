package EJ1;

public class Usuario {
    private String nombre;
    private int edad;

    public Usuario(String nombre, int edad) throws Exception {
        this.nombre = nombre;
        this.establecerEdad(edad);
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public int obtenerEdad() {
        return edad;
    }

    public void establecerEdad(int edad) throws Exception {
        if (edad < 0) {
            throw new Exception("Edad invalida");
        }
        this.edad = edad;
    }
}