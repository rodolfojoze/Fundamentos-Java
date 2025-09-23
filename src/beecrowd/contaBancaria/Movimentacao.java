package beecrowd.contaBancaria;

import java.time.LocalDateTime;

public class Movimentacao{

    private String tipo;
    private double valor;
    private LocalDateTime dataHora;

    public static void main(String[] args) {

        Conta c1 = new Conta("José Rodolfo", 13);
        Conta c2 = new Conta("Crystal", 20);

        c1.depositar(20000);
        c1.transferir(2000, c2);

        System.out.println(c1.getSaldo());

        c1.sacar(1500);

        System.out.println(c1.toString());

    }

}
