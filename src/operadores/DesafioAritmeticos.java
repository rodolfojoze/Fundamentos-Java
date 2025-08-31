package operadores;

public class DesafioAritmeticos {

    public static void main(String[] args) {

        double numbA = 6 * (3 + 2);
        double superiorA = Math.pow(numbA, 2);
        double inferiorA = 3 * 2;
        double ladoA = superiorA / inferiorA;

        double superiorB = (1 - 5) * (2 - 7);
        double inferiorB = 2;
        double potenciaB = (superiorB / inferiorB);
        double ladoB = Math.pow(potenciaB, 2);

        double funcao1 = ladoA - ladoB;
        double superior1 = Math.pow(funcao1, 3);
        double inferior1 = Math.pow(10, 3);
        double resultado1 = superior1 / inferior1;


        System.out.println((int)resultado1);
    }
}
