package manipulacaoString;

import java.util.Scanner;

public class manipulacaoString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String palavra = scanner.nextLine(); //Algoritmos
        char[] caracteres = palavra.toCharArray();

        System.out.println("Palavra informada: ");
        for (int i = 0; i < caracteres.length; i ++){
            System.out.println(caracteres[i]);
        }
        System.out.println("Palavra inversa: ");
        for (int i = caracteres.length-1; i >=0; i--){
            System.out.println(caracteres[i]);
        }

    }
}
