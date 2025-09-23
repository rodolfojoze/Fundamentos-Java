package classe;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;

    Produto (String nomeInicial, double precoInicial, double descontoInicial){
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }

    Produto (){ //posso utilizar como um validador do construtor

    }

    double precoComDesconto() { // não recebe nenhum parâmetro dentro dos parênteses pois o preço e o desconto já estão salvos co
       return preco * (1 - desconto);
    }

    //double precoComDesconto(double descontoDoGerente) { // posso incluir um desconto adicional, nisso quando o método for chamado ele pode conter algum valor nos paramêtros ou não
    //return preco * (1 - (desconto + descontoDoGerente));


}
