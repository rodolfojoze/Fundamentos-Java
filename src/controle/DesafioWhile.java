package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        // notas entre < 0 e > 10
        // quantas notas foram digitadas
        // a média entre as notas e o número delas
        // -1 para sair

        Scanner input = new Scanner(System.in);

        double nota = 0;
        int somaNota =0;
        double numNotas = 0;

        while (nota != -1) {
        System.out.println("Digite uma nota, -1 para sair");
        nota = input.nextInt();
        if (nota <= 10 && nota >= 0){
           somaNota += nota;
           numNotas++; } else if (nota != -1) {
            System.out.println("Nota inválida! ");
        }}

        double media = somaNota / numNotas;

        System.out.printf("a média das notas é %.2f: ", media);

        input.close();

    }
}

