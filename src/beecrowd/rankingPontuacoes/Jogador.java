package beecrowd.rankingPontuacoes;

public class Jogador {
    String nome;
    int partidas;
    int pontos;
    int gols;

    Jogador(String nome, int partidas, int pontos, int gols){
        this.nome = nome;
        this.partidas = partidas;
        this.pontos = pontos;
        this.gols = gols;
    }
}
