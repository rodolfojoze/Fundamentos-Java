package classe;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data(25,8,2022);

        Data d2 = new Data();

        String dataFormatada1 = d1.obterDataFormatada();
       // String dataFormatada2 = d2.obterDataFormatada();


        System.out.println(dataFormatada1);
        System.out.println(d2.obterDataFormatada());
        // System.out.println(Data.dia); // quando a variável está "static" na classe, conseguimos puxar direto só escrevendo o nome da classe + a variável




    }
}
