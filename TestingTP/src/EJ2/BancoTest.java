package EJ2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BancoTest {
    private static Banco banco;

    @BeforeAll
    static void setUpBeforeClass() {
        banco = new Banco();
        System.out.println("Inicio de las pruebas unitarias");
    }

    @AfterAll
    static void tearDownAfterClass() {
        System.out.println("Fin de las pruebas unitarias");
    }

    @BeforeEach
    void setUp() {
        banco.agregarCuenta("12345", 1000.0);
    }

    @Test
    void testAgregarCuenta() throws Exception {
        banco.agregarCuenta("67890", 500.0);
        assertEquals(500.0, banco.consultarSaldo("67890"));
    }

    @Test
    void testConsultarSaldo() throws Exception {
        assertEquals(1000.0, banco.consultarSaldo("12345"));
    }

    @Test
    void testConsultarSaldoCuentaNoExiste() {
        Exception exception = assertThrows(Exception.class, () -> {
            banco.consultarSaldo("99999");
        });
        assertEquals("La cuenta no existe", exception.getMessage());
    }

    @Test
    void testDepositar() throws Exception {
        banco.depositar("12345", 500.0);
        assertEquals(1500.0, banco.consultarSaldo("12345"));
    }

    @Test
    void testDepositarCuentaNoExiste() {
        Exception exception = assertThrows(Exception.class, () -> {
            banco.depositar("99999", 500.0);
        });
        assertEquals("La cuenta no existe", exception.getMessage());
    }

    @Test
    void testDepositarMontoNegativo() {
        Exception exception = assertThrows(Exception.class, () -> {
            banco.depositar("12345", -500.0);
        });
        assertEquals("El monto no puede ser negativo", exception.getMessage());
    }

    @Test
    void testRetirar() throws Exception {
        banco.retirar("12345", 500.0);
        assertEquals(500.0, banco.consultarSaldo("12345"));
    }

    @Test
    void testRetirarCuentaNoExiste() {
        Exception exception = assertThrows(Exception.class, () -> {
            banco.retirar("99999", 500.0);
        });
        assertEquals("La cuenta no existe", exception.getMessage());
    }

    @Test
    void testRetirarMontoNegativo() {
        Exception exception = assertThrows(Exception.class, () -> {
            banco.retirar("12345", -500.0);
        });
        assertEquals("El monto no puede ser negativo", exception.getMessage());
    }

    @Test
    void testRetirarSaldoInsuficiente() {
        Exception exception = assertThrows(Exception.class, () -> {
            banco.retirar("12345", 1500.0);
        });
        assertEquals("Saldo insuficiente", exception.getMessage());
    }
}
