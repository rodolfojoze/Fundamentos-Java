package beecrowd.rankingPontuacoes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Campeonato {

    List<Jogador> jogadores = new ArrayList<>();


    void adicionarJogador(String nome, int partidas, int pontos, int gols){
        Jogador novo = new Jogador(nome, partidas,pontos,gols);
        jogadores.add(novo);

    }

    void mostrarRanking(){
        jogadores.sort(
                Comparator.comparingInt((Jogador jogadores) -> jogadores.pontos).reversed()
                        .thenComparing(Comparator.comparingInt((Jogador jogadores) -> jogadores.gols).reversed())
        );

        for (int i = 0; i < jogadores.size(); i++){
            Jogador j = jogadores.get(i);
            System.out.println((i + 1) + "º - " + j.nome +
                    "| pontos: " + j.pontos +
                    "| gols: " + j.gols);
        }

    }

   }
