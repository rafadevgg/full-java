package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();
        fila.add("Ana"); // Lançará uma exceção caso a fila esteja cheia.
        fila.offer("Bia"); // Retorna falso caso a fila esteja cheia.
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        System.out.println(fila.peek()); // Retorna null
        System.out.println(fila.element()); // Lança uma exceção

        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll()); // Chama da fila e remove, se tiver vazia retorna null
        System.out.println(fila.remove()); // Mesmo comportamento do poll, porém se estiver vazia retorn exceção

        System.out.println(fila.peek());

    }

}
