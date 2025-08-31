package beecrowd;

import java.util.Scanner;

public class exercicio1865 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite quantos testes serão feitos: ");
        int C = input.nextInt();
        System.out.println("Digite quem está tentando e sua força: ");

        for(int i = 0; i < C; ++i) {
            String nome = input.next();
            int forca = input.nextInt();
            if (nome.contains("Thor")) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }
}
