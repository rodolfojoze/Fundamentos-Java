package beecrowd.contaBancaria;

import java.time.LocalDateTime;

public class Movimentacao{

    private String tipo;
    private double valor;
    private LocalDateTime dataHora;

    public static void main(String[] args) {

        ContaBancaria c1 = new Conta("José Rodolfo", 13);
        ContaBancaria c2 = new Conta("Crystal", 20);

        c1.depositar(20000);
        c1.sacar(1500);
        System.out.println(c1.toString());

        c1.transferir(2000.00, c2);
        c2.depositar(1000);
        assert c2.getSaldo() == 3000.00 : "Erro: saldo deveria ser 3000 após o depósito";

        System.out.println(c2.toString());


    }

}
