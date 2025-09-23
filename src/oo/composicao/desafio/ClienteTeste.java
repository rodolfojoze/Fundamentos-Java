package oo.composicao.desafio;

public class ClienteTeste {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("José");

        Produto p1 = new Produto("Caneta", 2.50);
        Produto p2 = new Produto("Caderno", 10.00);
        Produto p3 = new Produto("Borracha", 5.00);
        Produto p4 = new Produto("Sulfite", 0.20);

        Compra compra1 = new Compra();
        compra1.adicionarItem(p1, 3);
        compra1.adicionarItem(p2, 2);

        Compra compra2 = new Compra();
        compra2.adicionarItem(p3, 5);
        compra2.adicionarItem(p4, 20);

        cliente1.adicionarCompra(compra1);
        cliente1.adicionarCompra(compra2);

        System.out.println("Valor total do cliente: "
                + cliente1.obterValorTotalDaCompra());

    }
}
