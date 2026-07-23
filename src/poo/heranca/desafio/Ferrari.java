package poo.heranca.desafio;

public class Ferrari extends Carro {

    public Ferrari() {
        this(315);
    }

    public Ferrari(int velocidadeMax) {
        super(velocidadeMax);
        delta = 300;
    }

    @Override
    public void acelerar() {
        super.acelerar();
    }

}
