package beecrowd.gerenciadorTarefas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ArquivoTarefas {

    public static void salvar(List<Tarefa> tarefas, String nomeArquivo) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(nomeArquivo), StandardCharsets.UTF_8)){
            for (Tarefa t : tarefas){
                writer.write(t.toCsv());
                writer.newLine();
            }

        }

    }

    public static List<Tarefa> ler (String caminho) throws IOException{
        List<Tarefa> tarefas = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(caminho), StandardCharsets.UTF_8)){
        String linha;
        while ((linha = reader.readLine()) !=null){
            if (linha.trim().isEmpty()) continue;
            Tarefa t = Tarefa.fromCsv(linha);
            tarefas.add(t);
        }}
    return tarefas;

    }


}
