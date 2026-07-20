package poo.composicao.desafio2;

public class Sistema {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("João");

        FichaTreino ficha1 = new FichaTreino("Treino A");
        ficha1.adicionarItem(new Exercicio("Supino", "Peitoral"), 4, 12);
        ficha1.adicionarItem(new Exercicio("Tríceps corda", "Tríceps"), 4, 12);
        ficha1.adicionarItem(new Exercicio("Abdominal", "Abdômen"), 4, 12);
        ficha1.adicionarItem(new Exercicio("Prancha", "Abdômen"), 4, 12);

        System.out.println(ficha1.obterTotalRepeticoes());

        FichaTreino ficha2 = new FichaTreino("Treino B");
        ficha2.adicionarItem(new Exercicio("Cadeira extensora", "Quadriceps"), 4, 12);
        ficha2.adicionarItem(new Exercicio("Agachamento", "Quadriceps"), 4, 12);
        ficha2.adicionarItem(new Exercicio("Cadeira flexora", "Quadriceps"), 4, 12);
        ficha2.adicionarItem(new Exercicio("Levantamento calcanhar", "Panturrilha"), 4, 12);

        System.out.println(ficha2.obterTotalRepeticoes());

        aluno.fichas.add(ficha1);
        aluno.fichas.add(ficha2);
        System.out.println(aluno.obterTotalRepeticoes());

    }

}
