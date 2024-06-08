package EJ2;
import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<String, Double> cuentas;

    public Banco() {
        cuentas = new HashMap<>();
    }

    public void agregarCuenta(String numeroCuenta, double saldoInicial) {
        cuentas.put(numeroCuenta, saldoInicial);
    }

    public double consultarSaldo(String numeroCuenta) throws Exception {
        if (!cuentas.containsKey(numeroCuenta)) {
            throw new Exception("La cuenta no existe");
        }
        return cuentas.get(numeroCuenta);
    }

    public void depositar(String numeroCuenta, double monto) throws Exception {
        if (!cuentas.containsKey(numeroCuenta)) {
            throw new Exception("La cuenta no existe");
        }
        if (monto < 0) {
            throw new Exception("El monto no puede ser negativo");
        }
        double nuevoSaldo = cuentas.get(numeroCuenta) + monto;
        cuentas.put(numeroCuenta, nuevoSaldo);
    }

    public void retirar(String numeroCuenta, double monto) throws Exception {
        if (!cuentas.containsKey(numeroCuenta)) {
            throw new Exception("La cuenta no existe");
        }
        if (monto < 0) {
            throw new Exception("El monto no puede ser negativo");
        }
        double saldoActual = cuentas.get(numeroCuenta);
        if (saldoActual < monto) {
            throw new Exception("Saldo insuficiente");
        }
        double nuevoSaldo = saldoActual - monto;
        cuentas.put(numeroCuenta, nuevoSaldo);
    }
}

