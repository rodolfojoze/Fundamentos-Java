package beecrowd;

import java.util.Scanner;

public class exercicio1132 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int X = input.nextInt();
        System.out.println("Digite o segundo número: ");
        int Y = input.nextInt();
        int soma = 0;
        int min = Math.min(X, Y);
        int max = Math.max(X, Y);

        for(int i = min; i <= max; ++i) {
            if (i % 13 != 0) {
                soma += i;
            }
        }

        System.out.println("Os valores digitados foram: " + X + " e " + Y + "\nE a soma total dos valores é: " + soma);
    }
}
