package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1021 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double valor = input.nextDouble();
        int valorEmCentavos = (int)Math.round(valor * 100.0);
        int[] notas = new int[]{10000, 5000, 2000, 1000, 500, 200};
        int[] moedas = new int[]{100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS: ");

        int i;
        int quantidade;
        for(i = 0; i < notas.length; ++i) {
            quantidade = valorEmCentavos / notas[i];
            valorEmCentavos %= notas[i];
            System.out.println(String.format("%d nota(s) de R$ %.2f", quantidade, (double)notas[i] / 100.0));
        }

        System.out.println("MOEDAS: ");

        for(i = 0; i < moedas.length; ++i) {
            quantidade = valorEmCentavos / moedas[i];
            valorEmCentavos %= moedas[i];
            System.out.println(String.format("%d moeda(s) de R$ %.2f", quantidade, (double)moedas[i] / 100.0));
        }

    }
}
