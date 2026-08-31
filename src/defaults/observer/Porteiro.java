package defaults.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

    private List<ChegadaAniversarianteObserver> observers = new ArrayList<>();

    public void registerObservers(ChegadaAniversarianteObserver observer) {
        observers.add(observer);
    }

    public void detect() {
        Scanner sc = new Scanner(System.in);
        String valor = "";

        while (!"sair".equalsIgnoreCase(valor)) {
            System.out.print("Aniversariante chegou? ");
            valor = sc.nextLine();

            if ("sim".equalsIgnoreCase(valor)) {
                ChegadaAniversarianteEvent event = new ChegadaAniversarianteEvent(new Date());
                observers.stream().forEach(o -> o.chegou(event));
                valor = "sair";
            } else {
                System.out.println("Alarme falso!");
            }
        }

        sc.close();
    }

}
