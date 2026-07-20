package poo.composicao.desafio2;

import java.util.ArrayList;
import java.util.List;

public class FichaTreino {

    String descricao;
    List<ItemTreino> itens = new ArrayList<>();

    FichaTreino(String descricao) {
        this.descricao = descricao;
    }

    void adicionarItem(Exercicio exercicio, int series, int repeticoes) {
        itens.add(new ItemTreino(exercicio, series, repeticoes));
    }

    void adicionarItem(String nome, String grupoMuscular, int series, int repeticoes) {
        itens.add(new ItemTreino(new Exercicio(nome, grupoMuscular), series, repeticoes));
    }

    int obterTotalRepeticoes() {
        int total = 0;
        for (ItemTreino itemTreino : itens) {
            total += itemTreino.obterTotalRepeticoes();
        }

        return total;
    }

}
