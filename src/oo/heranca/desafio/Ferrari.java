package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{

    private boolean ligarTurbo = false;
    private boolean ligarAr = false;

    Ferrari (){
        super(320);
        setDelta(15);
    }

    @Override
    void acelerar() {
        velocidadeAtual += getDelta();
    }
    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }
    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }
    @Override
    public void desligarAr() {
        ligarAr = false;
    }
    public int getDelta(){
        if(ligarTurbo && !ligarAr) {
            return 35;
        } else if (ligarTurbo && ligarAr) {
            return 30;
        } else if (!ligarTurbo && !ligarAr) {
            return 20;
        } else {
            return 15;
    }
} }
