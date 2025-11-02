package beecrowd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1024 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantos testes serão tratados: ");
        int testes = Integer.parseInt(scanner.nextLine());

        List<String> resultados = new ArrayList<>();

        for (int i = 0; i < testes; i++){

        String linha = scanner.nextLine();

        StringBuilder passo1 = new StringBuilder();
        for (char ch : linha.toCharArray()){
            boolean letraMaiuscula = (ch >= 'A' && ch <= 'Z');
            boolean letraMinuscula = (ch >= 'a' && ch <= 'z');
            if (letraMaiuscula || letraMinuscula){
                ch += 3;
            }
            passo1.append(ch);
        }
        //System.out.println(passo1.toString());

        String passo2 = new StringBuilder(passo1).reverse().toString();
        //System.out.println(passo2);

        char[] arr = passo2.toCharArray();
        int meio = arr.length / 2;
        for (int j = meio; j < arr.length; j++) {
            arr[j] = (char) (arr[j] - 1);
        }

        resultados.add(new String(arr));


    }
        for (String texto : resultados){
            System.out.println(texto);
        }
}}
