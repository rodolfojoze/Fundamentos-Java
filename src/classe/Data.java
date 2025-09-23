package classe;

public class Data {
    static int dia = 5;
    int mes;
    int ano;

    Data (int diaInicial, int mesInicial, int anoInicial){
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }

    Data (){

    }
    String obterDataFormatada(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }

}
