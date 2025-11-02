package beecrowd.gerenciadorTarefas;

public class Tarefa {
    private final int id;
    private String titulo;
    private String descricao;
    private Status status;

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Status getStatus() {
        return status;
    }

    public Tarefa (int id, String titulo, String descricao, Status status){
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
    }

    public String toCsv(){
        return id + ";" + titulo + ";" + descricao + ";" + status.name();
    }

    public static Tarefa fromCsv(String linha){
        String[] p = linha.split(";", -1);
        if (p.length != 4){
            throw new IllegalArgumentException("Linha inválida: " + linha);
        }
        int id = Integer.parseInt(p[0]);
        String titulo = p[1];
        String descricao = p[2];
        Status status = Status.valueOf(p[3]);
        return new Tarefa(id, titulo, descricao, status);
    }

    @Override
    public String toString(){
        return "Tarefa{id=" + id + ", status=" + status +
                ", titulo='" + titulo + "', descricao='" + descricao + "'}";
    }

}
