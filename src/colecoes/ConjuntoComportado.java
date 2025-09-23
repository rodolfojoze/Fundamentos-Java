package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {

        //Set<String> listaAprovados = new HashSet<>(); // não obedece a ordem de inserção
        SortedSet<String> listaAprovados = new TreeSet<>(); //Obedece a ordem de inserção
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for (String candidato: listaAprovados){
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>(); // não obedece a ordem de inserção
        nums.add(1);
        nums.add(2);
        nums.add(10);
        nums.add(50);

        for (int n: nums){
            System.out.println(n);
        }


    }
}
