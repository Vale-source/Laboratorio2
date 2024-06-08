package EJ1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {
    private static Usuario usuario;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        usuario = new Usuario("Juan", 25);
        System.out.println("Inicio de las pruebas unitarias");
    }

    @AfterAll
    static void tearDownAfterClass() {
        System.out.println("Fin de las pruebas unitarias");
    }

    @Test
    void testObtenerNombre() {
        assertEquals("Juan", usuario.obtenerNombre());
    }

    @Test
    void testEstablecerNombre() {
        usuario.establecerNombre("Pedro");
        assertEquals("Pedro", usuario.obtenerNombre());
    }

    @Test
    void testObtenerEdad() {
        assertEquals(25, usuario.obtenerEdad());
    }

    @Test
    void testEstablecerEdad() throws Exception {
        usuario.establecerEdad(30);
        assertEquals(30, usuario.obtenerEdad());
    }

    @Test
    void testEstablecerEdadNegativa() {
        Exception exception = assertThrows(Exception.class, () -> {
            usuario.establecerEdad(-5);
        });
        assertEquals("Edad invalida", exception.getMessage());
    }
}