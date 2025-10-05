package beecrowd;

import controle.WhileDeterminado;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Exercicio1259 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantas linhas virão a seguir:");
        int x = scanner.nextInt();
        int N = 0;
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        if (x < 0){
            System.out.println("Válido somente números positivos");
            } else { System.out.println("Digite um valor");
             for (int i = 0; i < x; i ++) {
                N = scanner.nextInt();
                if (N % 2 == 0) {
                    pares.add(N);
                } else {
                    impares.add(N);
            }
        }
            pares.sort(Comparator.naturalOrder());
            impares.sort(Comparator.reverseOrder());

            System.out.printf("Os números pares são: " + pares + "\n E os impares são: " + impares);

}}
}