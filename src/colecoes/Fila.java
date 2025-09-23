package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        for (String filas: fila){
            System.out.println(filas);
        }

        //Obtem o próximo elemento da filha sem removar
        System.out.println(fila.peek()); // Se a fila estiver vazia ele monstrará "null"
        System.out.println(fila.element()); // Se a fila estiver vazia ele mostrará um erro

        System.out.println(fila.poll()); //Puxa o primeiro e remove da lista.
        System.out.println(fila.remove()); //Puxa o primeiro e remove da lista. (erro quando a fila está vazia)

        //fila.size();
        //fila.clear();
        //fila.isEmpty(); // se está vazio
        //fila.contains();

    }
}
