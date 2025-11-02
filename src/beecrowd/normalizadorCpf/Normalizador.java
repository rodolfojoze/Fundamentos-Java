package beecrowd.normalizadorCpf;

import java.util.Scanner;

public class Normalizador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um CPF válido: ");
        String cpf = scanner.nextLine();

        String cpfLimpo = cpf.replaceAll("\\D", "");

        if (cpfLimpo.length() == 11){
            System.out.println("CPF normalizado: " + cpfLimpo);
        } else {
            System.out.println("CPF inválido!");
        }

        String formatado = cpfLimpo.substring(0,3) + "." +
                cpfLimpo.substring(3,6) + "." +
                cpfLimpo.substring(6,9) + "-" +
                cpfLimpo.substring(9);
        System.out.println("CPF formatado: " + formatado);

    }
}
