package arrays;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int qtDeAlunos = sc.nextInt();

        System.out.print("Quantos notas por aluno? ");
        int qtDeNotas = sc.nextInt();

        double[][] notasDaTurma = new double[qtDeAlunos][qtDeNotas];

        double total = 0;
        for (int a = 0; a < notasDaTurma.length; a++) {
            for (int n = 0; n < notasDaTurma[a].length; n++) {
                System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
                notasDaTurma[a][n] = sc.nextDouble();
                total += notasDaTurma[a][n];
            }
        }

        double media = total / (qtDeAlunos * qtDeNotas);
        System.out.println("Média da turma é " + media);

        sc.close();
    }

}
