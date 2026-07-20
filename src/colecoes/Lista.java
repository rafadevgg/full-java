package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {

        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Rafael"));
        lista.add(new Usuario("Cel"));
        lista.add(new Usuario("Lina"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3)); // Acessar pelo índice

        lista.remove(1);
        lista.remove(new Usuario("Manu"));

        System.out.println("Tem? " + lista.contains(new Usuario("Lina")));

        for (Usuario u : lista) {
            System.out.println(u.nome);
        }

    }

}
