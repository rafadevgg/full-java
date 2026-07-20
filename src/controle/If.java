package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		double media = sc.nextDouble();
		
		if (media <= 10 && media >= 7) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns!");
		}
		
		sc.close();
		
	}
	
}
