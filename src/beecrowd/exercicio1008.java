package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número do colaborador: ");
        int NUMBER = input.nextInt();
        System.out.println("Digite quantas horas ele trabalhou: ");
        int HOURS = input.nextInt();
        System.out.println("Digite o valor recebido por hora: ");

        String VALOR = input.next();
        VALOR = VALOR.replace(",", ".");
        double VALORCONVER = Double.parseDouble(VALOR);
        double SALARY = (double)HOURS * VALORCONVER;

        System.out.printf("O colaborador número: %d%nReceberá o salário de: %.2f%n", NUMBER, SALARY);

        input.close();
    }
}
