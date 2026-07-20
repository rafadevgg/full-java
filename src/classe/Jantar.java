package classe;

public class Jantar {

    public static void main(String[] args) {

        Comida c1 = new Comida("Kalzone", 0.223);
        Comida c2 = new Comida("Pizza", 0.300);
        Pessoa p1 = new Pessoa("Rafael", 75.00);

        System.out.println(p1.apresentar());

        p1.comer(c1);
        System.out.println(p1.apresentar());
        p1.comer(c2);
        System.out.println(p1.apresentar());

//        System.out.println("Peso antes de comer: " + p1.peso);
//        System.out.println("Peso depois de comer: " + p1.comerComida(c1.nome, c1.peso));
//        System.out.println("Peso depois de comer: " + p1.comerComida(c2.nome, c2.peso));

    }

}
