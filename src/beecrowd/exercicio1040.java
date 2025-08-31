package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);


        double N1 = input.nextDouble();
        double N2 = input.nextDouble();
        double N3 = input.nextDouble();
        double N4 = input.nextDouble();

        double peso1 = 2;
        double peso2 = 3;
        double peso3 = 4;
        double peso4 = 1;

        double media = ((N1 * peso1) + (N2 * peso2) + (N3 * peso3) + (N4 * peso4)) / (peso1 + peso2 + peso3 + peso4);

        System.out.printf("Media: %.1f\n", media);

        if (media >= 7) {
            System.out.println("Aluno aprovado");
        } else if (media < 5) {
            System.out.println("Aluno reprovado");
        } else {
            System.out.println("Aluno em exame");
            double notaExame = input.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", notaExame);
            double mediaRecalculada = (notaExame + media) / 2;
            if (mediaRecalculada >= 5) {
                System.out.println("Aluno aprovado");
            } else {
                System.out.println("Aluno reprovado");
            }
            System.out.printf("Media final: %.1f", mediaRecalculada);

            input.close();

        }

    }
}
