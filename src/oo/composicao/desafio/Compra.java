package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

    Cliente cliente;
    final ArrayList<Item> itens = new ArrayList();

    void adicionarItem(Produto produto, int quantidade){
         this.itens.add(new Item(produto, quantidade));
    }

    double ObterValorTotal (){
        double total = 0;

        for (Item item: itens){
            total += item.quantidade * item.produto.preco;
        }

        return total;
    }
}
