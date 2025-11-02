package manipulacaoString;

import java.util.Scanner;

public class Equals {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro nome");
        String nome1 = scanner.nextLine();
        System.out.println("Digite o segundo nome");
        String nome2 = scanner.nextLine();

        if (nome1.equals(nome2)){
            System.out.println("Nomes iguais");
        } else {
            System.out.println("Nomes diferentes");
        }

    }

}
