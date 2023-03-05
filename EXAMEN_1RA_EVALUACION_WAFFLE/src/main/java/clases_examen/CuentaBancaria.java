package clases_examen;

/**
 *
 * @author KarimAP
 */
public class CuentaBancaria {

    private int Numero_de_Cuenta;
    private String Nombre_del_cliente;
    private double Saldo;

    public CuentaBancaria() {
        Numero_de_Cuenta = 0;
        Nombre_del_cliente = "";
        Saldo = 0.0;
    }

    public CuentaBancaria(int Num, String Nom, double Sald) {
        Numero_de_Cuenta = Num;
        Nombre_del_cliente = Nom;
        Saldo = Sald;
    }

    public int getNum() {
        return Numero_de_Cuenta;
    }

    public void setNum(int valor) {
        Numero_de_Cuenta = valor;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setNum(double valor) {
        Saldo = valor;
    }

    public double DepositarEnCuenta(double val) {        
        Saldo = val + Saldo;
        return Saldo;
    }

    public double RetirarDeCuenta(double val) {
        double saldoAc;
        Saldo = Saldo - val;
        saldoAc = Saldo;
        if (saldoAc > 0) {
            System.out.println("Saldo actual: "+Saldo);
            return Saldo;
            
        }else {
            System.out.println("Saldo insuficiente");
        }
        return Saldo;
    }

    public void ImprimirDatos() {
        System.out.println("El nombre de usuario es: " + Nombre_del_cliente);
        System.out.println("Su numero de cuenta es: " + Numero_de_Cuenta);
        System.out.println("Su saldo es: " + Saldo);

    }
}
