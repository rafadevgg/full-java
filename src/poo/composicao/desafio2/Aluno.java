package poo.composicao.desafio2;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    String nome;
    List<FichaTreino> fichas = new ArrayList<>();

    Aluno(String nome) {
        this.nome = nome;
    }

    int obterTotalRepeticoes() {
        int total = 0;
        for (FichaTreino fichaTreino : fichas) {
            total += fichaTreino.obterTotalRepeticoes();
        }

        return total;
    }

}
