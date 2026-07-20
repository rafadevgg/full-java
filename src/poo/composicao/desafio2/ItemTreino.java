package poo.composicao.desafio2;

public class ItemTreino {

    Exercicio exercicio;
    int series;
    int repeticoes;

    ItemTreino(Exercicio exercicio, int series, int repeticoes) {
        this.exercicio = exercicio;
        this.series = series;
        this.repeticoes = repeticoes;
    }

    int obterTotalRepeticoes() {
        return series * repeticoes;
    }

}
