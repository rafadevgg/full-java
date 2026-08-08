package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

    public static void main(String[] args) {

        Vendedor v1 = new Vendedor("Gabriel", 3, true);
        Vendedor v2 = new Vendedor("Milena", 13, true);
        Vendedor v3 = new Vendedor("Caio", 9, false);
        Vendedor v4 = new Vendedor("Sara", 17, false);
        Vendedor v5 = new Vendedor("Bruno", 9, true);
        Vendedor v6 = new Vendedor("Tulio", 7, true);

        List<Vendedor> vendedores = Arrays.asList(v1, v2, v3, v4, v5, v6);
        Predicate<Vendedor> isMetaBatida =
                v -> v.vendasMes >= 7;
        Predicate<Vendedor> isLegal =
                v -> v.isComportamento;
        Function<Vendedor, String> metaBatida =
                v -> "Vendedor " + v.nome + " bateu a meta e se comportou legal!";

        vendedores.stream()
                .filter(isMetaBatida)
                .filter(isLegal)
                .map(metaBatida)
                .forEach(System.out::println);

    }

}
