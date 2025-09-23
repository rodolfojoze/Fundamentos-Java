package beecrowd.contaBancaria;

public class Conta {

    private String titular;
    private int numeroConta;
    private double saldo;

    public Conta (String titular, int numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public boolean depositar(double valor){
        if (valor > 0 ){
            saldo += valor;
            return true;
        } else {
            return false;
        }
    }
    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor){
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir (double valor, Conta destino){
        if (valor > 0 && saldo >= valor){
            saldo -= valor;
            destino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        return "A conta " + numeroConta + " de " + titular + " tem o saldo de: " + saldo;
    }

}
