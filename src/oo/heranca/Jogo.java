package oo.heranca;

public class Jogo {
    public static void main(String[] args) {

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi(10, 11);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("O monstro tem de vida => " + monstro.vida);
        System.out.println("O herói tem de vida => " + heroi.vida);


    }
}
