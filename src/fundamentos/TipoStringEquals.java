package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s));
		// Equals compara os conteúdos dentro da String
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		System.out.println("2" == s1.trim());
		System.out.println("2".equals(s1.trim()));
		
		sc.close();
		
	}

}
