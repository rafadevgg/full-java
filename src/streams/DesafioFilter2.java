package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {

    public static void main(String[] args) {

        Produto p1 = new Produto("Mouse", 299.99, 0.3, 0);
        Produto p2 = new Produto("Mousepad", 59.99, 0.13, 10.0);
        Produto p3 = new Produto("Gabinete", 159.99, 0.35, 0);
        Produto p4 = new Produto("Fonte", 239.95, 0.18, 25.0);
        Produto p5 = new Produto("Memória", 499.59, 0.31, 21.0);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
        Predicate<Produto> isPromocao =
                p -> p.desconto >= 0.3;
        Predicate<Produto> isFreteGratis =
                p -> p.frete == 0;
        Function<Produto, String> produtosImperdiveis =
                p -> "Produto " + p.nome + " está com " + p.transformandoDesconto(p.desconto) + "% de desconto e frete grátis";
        Consumer<Object> printando = System.out::println;

        produtos.stream()
                .filter(isPromocao)
                .filter(isFreteGratis)
                .map(produtosImperdiveis)
                .forEach(printando);
    }

}
