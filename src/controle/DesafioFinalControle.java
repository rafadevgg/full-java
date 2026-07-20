package controle;

import java.util.Random;
import java.util.Scanner;

public class DesafioFinalControle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // TODO Programa 1
        System.out.print("Digite o número: ");
        int numero = sc.nextInt();

        if (numero < 10) {
            if (numero % 2 == 0) {
                System.out.println("Número par!");
            } else {
                System.out.println("Número ímpar!");
            }
        } else {
            System.out.println("O número precisa ser menor que 10!");
        }

        // TODO Programa 2
        System.out.print("\nVerificar se o ano é bissexto");
        System.out.print("\nDigite os dias do ano: ");
        int dias = sc.nextInt();

        if (dias == 366) {
            System.out.print("Ano bissexto!");
        } else {
            System.out.print("Ano comum!");
        }

        // TODO Programa 3
        System.out.println("\nCalculador de média aluno");

        System.out.print("\nNota 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();

        double somaNotas = nota1 + nota2;
        double media = somaNotas / 2;

        if (media > 7.0) {
            System.out.println("Média: " + media + "\nAprovado!");
        } else if (media < 7.0 && media > 4.0) {
            System.out.println("Média: " + media + "\nRecuperação!");
        } else {
            System.out.println("Média: " + media + "\nReprovado!");
        }

        // TODO Programa 4
        System.out.print("\nVerifique se o número é PRIMO: ");
        int numeroPrimo = sc.nextInt();

        if (numeroPrimo == 2 || numeroPrimo == 3 || numeroPrimo == 5 || numeroPrimo == 7 || numeroPrimo == 11) {
            System.out.println("Número primo!");
        } else if (numeroPrimo == 4 || numeroPrimo == 6 || numeroPrimo == 8 || numeroPrimo == 9 || numeroPrimo == 10) {
            System.out.println("Número não primo!");
        }

        // TODO Programa 5
        System.out.print("\nVerifique se o número é PRIMO 2: ");
        int numeroPr = sc.nextInt();

        switch (numeroPr) {
            case 2: case 3: case 5: case 7: case 11:
                System.out.print("Número primo");
                break;
            case 4: case 6: case 8: case 9: case 10:
                System.out.print("Número não primo");
                break;
            default:
                System.out.print("Número comum");
                break;
        }

        // TODO Programa 6
        System.out.println();
        int numeroSecreto = random.nextInt(100) + 1;
        int palpite = 0;
        int tentativas = 0;

        while (palpite != numeroSecreto && tentativas < 10) {
            System.out.print("\nDigite seu palpite");
            palpite = sc.nextInt();
            tentativas++;

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns você acertou o número " + numeroSecreto);
            } else if (palpite < numeroSecreto) {
                System.out.print("O número é maior...");
            } else {
                System.out.print("O número é menor...");
            }

            int tentativasRestantes = 10 - tentativas;
            System.out.print("\nRestam " + tentativasRestantes + " tentativas");
        }

        // TODO Programa 7
        System.out.println();
        int positivo = 0;

        while (positivo < 0) {
            System.out.println("\nDigite o número positivo: ");
            positivo += sc.nextInt();
        }

        System.out.print("A soma dos números digitados é " + positivo);



    }

}
