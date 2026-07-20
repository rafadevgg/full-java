package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Salário 1: ");
		String salario1 = sc.nextLine().replace(",", ".");
		
		System.out.println("Salário 2: ");
		String salario2 = sc.nextLine().replace(",", ".");
		
		System.out.println("Salário 3: ");
		String salario3 = sc.nextLine().replace(",", ".");
		
		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);
		
		double soma = valor1 + valor2 + valor3;
		
		System.out.println("\nA soma salarial é " + soma);
		System.out.println("A média salarial é " + soma / 3);
		
		sc.close();
	}

}
