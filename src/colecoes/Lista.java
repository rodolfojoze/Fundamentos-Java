package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);

        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3)); // acessar pelo indíce.
        lista.remove(4);
        System.out.println(lista.getFirst());
        System.out.println(lista.getLast());
        System.out.println(lista.remove(new Usuario("Lia")));

        for(Usuario u: lista){
            System.out.println(u.nome);
        }

    }
}
