package segunda_aula.methods;

public class Conta {

    private int numero;
    private double saldo;
    private double juros;

    public Conta(int numero, double saldo, double juros) {
        this.numero = numero;
        this.saldo = saldo;
        this.juros = juros;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
}
