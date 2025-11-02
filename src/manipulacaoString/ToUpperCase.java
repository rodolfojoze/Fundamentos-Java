package manipulacaoString;

import java.util.Scanner;
public class ToUpperCase {

    public static void main(String[] args) {

        String nome0 = "josé";
        Scanner scanner = new Scanner(System.in);
        System.out.println(String.format("Digite o primeiro %s nome", nome0));
        String nome1 = scanner.nextLine();
        System.out.println("Digite o segundo nome");
        String nome2 = scanner.nextLine();
        nome1 = nome1.toUpperCase();
        nome2 = nome2.toUpperCase();

        if (nome1.equals(nome2)){
            System.out.println("Nomes iguais");
        } else {
            System.out.println("Nomes diferentes");
        }

        System.out.println(nome1 + "  " + nome2);

    }
}

