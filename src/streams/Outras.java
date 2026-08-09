package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Outras {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);
        Aluno a5 = new Aluno("Ana", 7.1);
        Aluno a6 = new Aluno("Pedro", 9.1);
        Aluno a7 = new Aluno("Gui", 8.1);
        Aluno a8 = new Aluno("Maria", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        System.out.println("distinct..."); // não pegar valores duplicados...
        alunos.stream() // build
                .distinct() // intermediário
                .forEach(System.out::println); // terminal

        System.out.println("\nSkip/Limit"); // paginação...
        alunos.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("\ntakeWhile"); // vai pegando até determinada condição...
        alunos.stream()
                .distinct()
                .skip(2) // pula os elementos, nesse caso os 2 primeiros da lista
                .takeWhile(a -> a.nota >= 7)
                .forEach(System.out::println);

    }

}
