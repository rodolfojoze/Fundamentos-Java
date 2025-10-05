package beecrowd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio1172 {
    public static void main(String[] args) {
        List<String> lista = List.of("zé", "will");
        Scanner scanner = new Scanner(System.in);
        int [] X = new int[10];

        for (String s : lista) {
            if (s.contains("z")) {
                System.out.println(s);
            }
        }

        for(int i = 0; i < 10; i++){
            X[i] = scanner.nextInt();
            if (X[i] <= 0) {
            X[i] = 1;
        }
        }

    for (int i = 0; i < 10; i++){
            System.out.println("X[" + i +"] = " +X[i]);
    }
    scanner.close();
}
}
