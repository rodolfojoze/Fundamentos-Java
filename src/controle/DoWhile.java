package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String frase = "";

        do {
            System.out.println("Digite as palavras mágicas...");
            System.out.println("Você quer sair?");
            frase = entrada.nextLine();
        } while (!frase.equals("Por favor"));

        System.out.println("Obrigado!");
        entrada.close();

    }
}
