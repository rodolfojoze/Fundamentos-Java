package oo.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("José", "Carreira", - 30);
          p1.setIdade(31);

        System.out.println(p1); //toString
        System.out.println(p1.getNomeCompleto());
    }
}
