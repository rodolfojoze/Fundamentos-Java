package classe;

public class ProdutoTeste {
    public static void main(String[] args) {

        // Produto p1 = new Produto("Notebook", 4356.89, 0.25);
        // p1.nome = "Notebook";
        // p1.preco = 4356.89;
        // p1.desconto = 0.25;

        //var p2 = new Produto("Caneta Preta", 12.56, 0.29);
        // p2.nome = "Caneta Preta";
        // p2.preco = 12.56;
        // p2.desconto = 0.29;

        //double precoFinal1 = p1.precoComDesconto(0.2); // posso incluir um desconto adicional, nisso quando o método for chamado ele pode conter algum valor nos paramêtros ou não
        //System.out.println();

        Produto p3 = new Produto();
        p3.nome = "Celular";
        p3.preco = 2500.00;

        Produto.desconto = 0.25;
        System.out.println(p3.nome + " " + p3.precoComDesconto());






    }
}
