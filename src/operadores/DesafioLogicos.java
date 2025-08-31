package operadores;

public class DesafioLogicos {

    public static void main(String[] args) {

        //Minha resposta para o exercício
        boolean trabalho1 = true;
        boolean trabalho2 = false;

        if (trabalho1 && trabalho2){
            System.out.println("Irei comprar a televisão de 50\" e tomar sorvete");
        } else if (trabalho1 ^ trabalho2){
            System.out.println("Irei comprar a televisão de 32\" e tomar sorvete");
        } else {
            System.out.println("Ficarei em casa e estarei mais saudável");
        }

        //Resposta do professor para o exercício

       // boolean trabalho3 = true;
       // boolean trabalho4 = false;

       // boolean comprouTv50 = trabalho3 && trabalho4;
       // boolean comprouTv32 = trabalho3 ^trabalho4;
       // boolean comprouSorvete = trabalho3 || trabalho4;
       // boolean maisSaudavel = !comprouSorvete;

       //  System.out.println("Comprou TV 50\"? " + comprouTv50);
       //  System.out.println("Comprou TV 32\"? " + comprouTv32);
       //  System.out.println("Comprou Sorvete? " + comprouSorvete);
       //  System.out.println("Mais saúdavel? " + maisSaudavel);

        //Resposta melhorada

        boolean trab1 = true;
        boolean trab2 = true;

        final boolean comprouTv50 = trab1 && trab2;
        final boolean comprouTv32 = trab1 ^ trab2;
        final boolean tomouSorvete = trab1 || trab2;

        String mensagem;
        if (comprouTv50) {
            mensagem = "Comprou a TV de 50\" e tomou sorvete";
        } else if  (comprouTv32) {
            mensagem = "Comprou a TV de 32\" e tomou sorvete";
        } else {
            mensagem = "Ficarei em casa mais saudável";
        }

        System.out.println(mensagem);



    }
}
