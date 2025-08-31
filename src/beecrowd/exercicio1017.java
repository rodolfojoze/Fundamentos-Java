package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Quanto tempo vai levar a viagem?");
        int Tempo = input.nextInt();
        System.out.println("Qual será a velocidade média da viagem?");
        int VelocidadeMedia = input.nextInt();
        int ConsumoMedio = 12;

        double KmRodado = (double)(VelocidadeMedia * Tempo);
        double ConsumoTotal = KmRodado / (double)ConsumoMedio;

        System.out.printf("Serão necessários %.3f litros de combustível", ConsumoTotal);

        input.close();

    }
}
