package arrays;

import java.util.Scanner;

public class DesafioArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de notas: ");
        int qtDeNotas = sc.nextInt();

        double[] notas = new double[qtDeNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota: " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        double total = 0;
        for (double nota : notas) {
            total += nota;
        }

        double media = total / notas.length;
        System.out.println("A média é " + media);

        sc.close();
    }

}
