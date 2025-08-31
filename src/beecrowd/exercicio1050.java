package beecrowd;

import java.io.PrintStream;
import java.util.*;

public class exercicio1050 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Map<Integer, List<String>> dddMap = new HashMap();

        dddMap.put(11, Arrays.asList("São Paulo"));
        dddMap.put(61, Arrays.asList("Brasilia"));
        dddMap.put(71, Arrays.asList("Salvador"));
        dddMap.put(21, Arrays.asList("Salvador"));
        dddMap.put(32, Arrays.asList("Juiz de Fora"));
        dddMap.put(19, Arrays.asList("Campinas"));
        dddMap.put(27, Arrays.asList("Vitoria"));
        dddMap.put(31, Arrays.asList("Belo Horizonte"));

        System.out.println("Digite o DDD: ");
        int DDD = input.nextInt();
        if (dddMap.containsKey(DDD)) {
            PrintStream var10000 = System.out;
            List var10001 = (List)dddMap.get(DDD);
            var10000.println("A cidade do DDD digitado é " + (String)var10001.get(0));
        } else {
            System.out.println("DDD não encontrado");
        }
    }
}
