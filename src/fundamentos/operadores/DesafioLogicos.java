package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean tv50 = trabalho1 && trabalho2;
		System.out.println("TV 50 polegadas: " + tv50);
		
		boolean tv32 = trabalho1 ^ trabalho2;
		System.out.println("TV 32 polegadas: " + tv32);
		
		boolean sorvete = trabalho1 || trabalho2;
		System.out.println("Tomou sorvete: " + sorvete);	
		
		// Operador unário
		boolean saudavel = !sorvete;
		System.out.println("Família mais saudável: " + saudavel);
		
		// Se os DOIS trabalhos derem true,
		// será comprado uma TV de 50 polegadas
		// e a família tomará sorvete
		
		// Se UM dos trabalhos derem true,
		// será comprado uma TV de 32 polegadas
		// e a família tomará sorvete
		
		// Se os DOIS trabalhos derem false,
		// família ficará em casa sem sorvete
		// família mais saudável
		
	}
	
}
