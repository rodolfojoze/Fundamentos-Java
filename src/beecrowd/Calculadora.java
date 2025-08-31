package beecrowd;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Digite o primeiro número:");
    double numero1 = input.nextDouble();

    System.out.println("Digite qual a operação:");
    char operacao = input.next().charAt(0);

    System.out.println("Digite o segundo número:");
    double numero2 = (double)input.nextInt();

    double resultado = 0.0;

        switch (operacao) {
        case '*':
            resultado = numero1 * numero2;
            break;
        case '+':
            resultado = numero1 + numero2;
            break;
        case '-':
            resultado = numero1 - numero2;
            break;
        case '/':
            if (numero2 == 0.0) {
                System.out.println("Erro: Divisão por zero");
                return;
            }
            resultado = numero1 / numero2;
            break;
        default:
            System.out.println("Operação inválida!");
            return;
    }

        System.out.printf("O resultado da operação é %.2f", resultado);
        input.close();
} }
