package poo.heranca.desafio;

public class CarroTeste {

    public static void main(String[] args) {

        Civic civic = new Civic();
        Ferrari ferrari = new Ferrari(400);

        System.out.println("Velocidade atual do Civic é " + civic.velocidadeAtual + " km/h");
        System.out.println("Velocidade atual da Ferrari é " + ferrari.velocidadeAtual + " km/h");

        civic.acelerar();
        ferrari.acelerar();

        civic.acelerar();
        ferrari.acelerar();

        civic.acelerar();
        ferrari.acelerar();

        System.out.println("Velocidade atual do Civic é " + civic.velocidadeAtual + " km/h");
        System.out.println("Velocidade atual da Ferrari é " + ferrari.velocidadeAtual + " km/h");

        civic.frear();
        ferrari.frear();

        System.out.println("Velocidade atual do Civic é " + civic.velocidadeAtual + " km/h");
        System.out.println("Velocidade atual da Ferrari é " + ferrari.velocidadeAtual + " km/h");

    }

}
