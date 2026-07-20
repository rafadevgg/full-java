package fundamentos.operadores;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
	
		int a = 6 * (3 + 2);
		double b = Math.pow(a, 2);
		int c = 3 * 2;
		double primeira = b / c;
		
		int d = (1 - 5) * (2 - 7) / 2;
		double segunda = Math.pow(d, 2);
		
		double somaCima = primeira - segunda;
		double cima = Math.pow(somaCima, 3);
		double baixo = Math.pow(10, 3);
		
		double resultadoFinal = cima / baixo;
		System.out.println("Resultado final é " + resultadoFinal);
		
		
	}

}
