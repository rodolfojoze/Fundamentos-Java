package fundamentos;

public class TipoString {

    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(6));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!")); // Concatenando string através da função concat
        System.out.println(s + "!!!"); // Concatenando string através do +
        System.out.println(s.startsWith("Boa")); // Filtrando a primeira palavra escrita da forma exata
        System.out.println(s.toLowerCase().startsWith("boa")); // Filtrando a primeira palavra depois que ela foi transformada em letras minisculas
        System.out.println(s.toUpperCase().endsWith("TARDE")); // Filtando a última palabra depois que ela foi transformada em letras maiusculas
        System.out.println(s.length()); // contagem de caracteres das duas palabras
        System.out.println(s.toLowerCase().equals("boa tarde")); // Comparando após transformar string em letras minusculas
        System.out.println(s.equalsIgnoreCase("boa tarde")); // Comparando ignorando qualquer mudança de letras "maiusculas" e "minusculas"

        var nome = "Pedro"; // Quando utilizamos uma variável, ela converte o seu tipo através do valor dado a ela
        var sobrenome = "Santos"; // String %s
        var idade = 33; // int %d
        var salario = 1234.45; // double %f

        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f",
                nome, sobrenome, idade, salario);

        String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f",
                nome, sobrenome, idade, salario);
        System.out.printf(frase);



    }


}
