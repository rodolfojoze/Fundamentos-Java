package controle;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = 0;

        try{
            System.out.println("Qual é a sua idade?");
            idade = scanner.nextInt();
            System.out.println("Sua idade é: " + idade);
        } catch (Exception e){
            System.out.println("A idade digitada é inválida");
        } finally {
            System.out.println("O processo foi finalizado!");
        }

    }
}
