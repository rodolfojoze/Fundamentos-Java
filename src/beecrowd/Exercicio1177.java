package beecrowd;

import java.util.Scanner;

public class Exercicio1177 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite um número");
        int T = scanner.nextInt();

        if(T < 2 || T > 50) {
            System.out.println("Valor inválido");
            } else {
            int [] N = new int[1000];

                for (int i = 0; i < 1000; i++){
                    N[i] = i % T;
                    System.out.println("N[" + i + "] = " + N[i]);
                }
            }

        scanner.close();

        }

}
