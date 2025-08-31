package operadores;

import java.sql.SQLOutput;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        double x = 95.85;
        double y = 52.65;

        System.out.println("A soma das variáveis x e y é: "+ (x + y));
        System.out.println("A subtração das varíaveis x e y é: " + (x - y));
        System.out.println("A multiplicação das variáveis x e y é: " + (x * y));
        System.out.println("A divisão das variáveis x e y é: " + (x / y));

        int a = 10;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a / (double) b); // Posso converter para outro tipo

        System.out.println(a % b); // O que sobra da divisão.


    }
}
