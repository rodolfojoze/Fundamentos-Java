package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto"); //Adiciona
        usuarios.put(1, "Ricardo"); //Substitui
        usuarios.put(2, "Rafaela");
        usuarios.put(3, "Rebeca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());
        System.out.println(usuarios.containsKey(2));
        System.out.println(usuarios.containsValue("Rebeca"));
        System.out.println(usuarios.get(2));
        System.out.println(usuarios.remove(1));
        System.out.println(usuarios.remove(1, "Rebeca"));

        for (int chave: usuarios.keySet()){
            System.out.println(chave);
        }
        for (String valor: usuarios.values()){
            System.out.println(valor);
        }

        for(Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey() + " ");
            System.out.println(registro.getValue());
        }


    }

}
