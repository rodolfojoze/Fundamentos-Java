package beecrowd.gerenciadorTarefas;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static beecrowd.gerenciadorTarefas.Status.CONCLUIDA;
import static beecrowd.gerenciadorTarefas.Status.PENDENTE;

public class App {
    public static void main(String[] args) {
        Tarefa t1 = new Tarefa(1, "Pagar conta", "Vence dia 25", PENDENTE);
        Tarefa t2 = new Tarefa(2, "Fazer o pix", "Vence dia 20", CONCLUIDA);

        String linha = t1.toCsv();
        System.out.println("CSV gerado: " + linha);

        String linha2 = t2.toCsv();
        System.out.println("CSV gerado: " + linha2);

        //Tarefa t2 = Tarefa.fromCsv(linha);
        //System.out.println("Reconstruída: " + t2);

        List<Tarefa> tarefas = new ArrayList<>();
        tarefas.add(t1);
        tarefas.add(t2);

        Path caminho = Paths.get(System.getProperty("user.home"), "Documents", "tarefas.csv");

        try {
            ArquivoTarefas.salvar(tarefas, caminho.toString());
            System.out.println("Arquivo salvo em: " + caminho.toAbsolutePath());
        } catch (IOException e){
            System.out.println("Erro ao salvar: " + e.getMessage());
        }

        try {
            List<Tarefa> tarefasLidas = ArquivoTarefas.ler(caminho.toString());
            tarefasLidas.forEach(System.out::println);
        } catch (IOException e){
            System.out.println("Erro na leitura: " + e.getMessage());
        }

    }

}
