package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho é: " + conjunto.size());

        conjunto.add("teste");
        System.out.println("Tamanho é: " + conjunto.size());

        System.out.println("Removeu o item? " + conjunto.remove(1));

        System.out.println("Tamanho é: " + conjunto.size());
        System.out.println("Removeu o item? " + conjunto.remove(2));
        System.out.println("Contem o 1.2? " + conjunto.contains(1.2));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        // conjunto.addAll(nums); // União entre dois conjuntos
        conjunto.retainAll(nums); // Intersecção
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);

    }
}
