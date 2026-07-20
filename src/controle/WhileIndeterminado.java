package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String digitado = "";
		
		while (!digitado.equalsIgnoreCase("sair")) {
		System.out.print("Você diz: ");
		digitado = sc.nextLine();
		}
		
		sc.close();
	}

}
