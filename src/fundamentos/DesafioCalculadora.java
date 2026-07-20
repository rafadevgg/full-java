package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número: ");
		double numero1 = sc.nextDouble();
		
		System.out.println("Informe o número: ");
		double numero2 = sc.nextDouble();
		
		System.out.println("Informe a operação: ");
		String tipoOperacao = sc.next();
		
		// Lógica
		double resultado = "+".equals(tipoOperacao.trim()) ? numero1 + numero2 : 0;
		resultado = "-".equals(tipoOperacao.trim()) ? numero1 - numero2 : resultado;
		resultado = "*".equals(tipoOperacao.trim()) ? numero1 * numero2 : resultado;
		resultado = "/".equals(tipoOperacao.trim()) ? numero1 / numero2 : resultado;
		resultado = "%".equals(tipoOperacao.trim()) ? numero1 % numero2 : resultado;
				
		System.out.printf("%.2f %s %.2f = %.2f", numero1, tipoOperacao, numero2, resultado);
		
		sc.close();
		
	}

}
