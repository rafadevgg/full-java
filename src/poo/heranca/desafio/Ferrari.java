package poo.heranca.desafio;

public class Ferrari extends Carro {

    Ferrari() {
        this(315);
    }

    Ferrari(int velocidadeMax) {
        super(velocidadeMax);
        delta = 300;
    }

    @Override
    void acelerar() {
        super.acelerar();
    }

}
