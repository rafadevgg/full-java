package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

    public static void main(String[] args) {

        Consumer<Object> print = System.out::println;
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        /*
        * 1. Número para string binário... 6 => "110"
        * 2. Reverter a string... "110" => "011"
        * 3. Converter de volta para inteiro => "011" => 3
         */

        UnaryOperator<String> inverter =
                s -> new StringBuilder(s).reverse().toString();
        Function<String, Integer> binarioParaInt =
                s -> Integer.parseInt(s, 2); // passando o 2, ele entende que é binario string

        nums.stream()
                .map(Integer::toBinaryString)
                .map(inverter)
                .map(binarioParaInt)
                .forEach(print);

    }

}
