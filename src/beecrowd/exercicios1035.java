package beecrowd;

public class exercicios1035 {
    public static void main(String[] args) {

        int A = 2;
        int B = 3;
        int C = 2;
        int D = 6;

        if ((B > C) &&
                (D > A)&&
                (C + D > A + B)&&
                (C > 0)&&
                (D > 0)&&
                (A % 2 == 0)){
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores não aceitos");
        }
    }
}
