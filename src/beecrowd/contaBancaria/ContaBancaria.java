package beecrowd.contaBancaria;

public interface ContaBancaria {
    boolean depositar(double valor);
    boolean sacar(double valor);
    boolean transferir (double valor, ContaBancaria destino);
    double getSaldo();
}
