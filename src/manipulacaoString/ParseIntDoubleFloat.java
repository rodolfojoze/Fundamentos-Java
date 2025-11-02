package manipulacaoString;

public class ParseIntDoubleFloat {

    public static void main(String[] args) {
        String valor2 = "9";

        String valor = "9.01";
        System.out.println(valor);

        valor = valor + 1;
        System.out.println(valor);

        double novoValor = Double.parseDouble(valor) + 1;
        System.out.println(novoValor);

        float novoValor2 = Float.parseFloat(valor) + 2;
        System.out.println(novoValor2);

        int novoValor3 = Integer.parseInt(valor2) + 3;
        System.out.println(novoValor3);

    }
}
