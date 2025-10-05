package beecrowd.rankingPontuacoes;

public class CampeonatoTeste {
    public static void main(String[] args) {

        Campeonato campeonato = new Campeonato();
        campeonato.adicionarJogador("José", 10, 27, 50);
        campeonato.adicionarJogador("Maria", 10, 30, 60);
        campeonato.adicionarJogador("João", 10, 25, 35);
        campeonato.adicionarJogador("Daniel", 9, 25, 35);
        campeonato.adicionarJogador("Lucas", 9, 24, 40);

        campeonato.mostrarRanking();


    }
}
