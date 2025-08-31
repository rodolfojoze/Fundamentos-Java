package fundamentos;

import java.math.BigDecimal;

public class TipoPrimitivos {

    public static final int valorInss = 20;
    //Tipo numéricos inteiros
    byte anoDeEmpresa = 23;
    short numeroDeVoos = 542;
    int id = 56789;
    long pontosAcumulados = 3_334_845_223L; //O L trabalha como a aplicação de um literal, convertendo um inteiro para long

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    // Tipos numéricos reais
    public float salario = 11_445.44F; //O F trabalha como a aplicação de um literal, convertendo um float para double
    double vendasAcumuladas = 2_991_797_103.01;

    // bigDecimal
    BigDecimal teste = BigDecimal.valueOf(valorInss).add(BigDecimal.TWO);
    BigDecimal somaComInt = teste.add(BigDecimal.valueOf(id));


    // Tipo booleano
    boolean estaDeFerias = false; // true

    // Tipo caractere
    char status = 'A'; // Somente um caractere

}
