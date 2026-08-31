package defaults.observer;

public class AniversarioSurpresa {

    public static void main(String[] args) {
        Porteiro porteiro = new Porteiro();

        Namorada namorada = new Namorada();
        porteiro.registerObservers(namorada);
        porteiro.registerObservers(e -> {
            System.out.println("Surpresa via lambda expression!");
            System.out.println("Ocorreu em: " + e.getMomento());
        });
        porteiro.detect();
    }

}
