package fundamentos;

import java.util.Scanner;

public class ExerciciosFinais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Exercício 1
		System.out.println("Digite o Grau Fahrenheit: ");
		double fahrenheit1 = sc.nextDouble();
		double celsius1 = (fahrenheit1 - 32) * 5 / 9;
		System.out.println("Grau Celsius: " + celsius1 + " °C");
		
		// Exercício 2
		System.out.println("\nDigite o Grau Celsius: ");
		double celsius2 = sc.nextDouble();
		double fahrenheit2 = celsius2 * 9 / 5 + 32;
		System.out.println("Grau Fahrenheit: " + fahrenheit2 + " °F");
		
		// Exercício 3
		System.out.println("\nPeso: ");
		double peso = sc.nextDouble();
		System.out.println("Altura: ");
		double altura = sc.nextDouble();
		double altura2 = Math.pow(altura, 2);
		double imc = peso / altura2;
		System.out.println("Cálculo IMC: " + imc);
		
		// Exercício 4
		System.out.println("\nDigite o número que deseja ver ao QUADRADO: ");
		double quadrado = sc.nextDouble();
		double aoQuadrado = Math.pow(quadrado, 2);
		System.out.println("Esse número ao QUADRADO = " + aoQuadrado);
		System.out.println("\nDigite o número que deseja ver ao CUBO: ");
		double cubo = sc.nextDouble();
		double aoCubo = Math.pow(cubo, 3);
		System.out.println("Esse número ao CUBO = " + aoCubo);
		
		// Exercício 5
		System.out.println("\nDigite a base do triângulo: ");
		double baseTriangulo = sc.nextDouble();
		System.out.println("Digite a altura do triângulo: ");
		double alturaTriangulo = sc.nextDouble();
		double areaTriangulo = baseTriangulo * alturaTriangulo;
		System.out.println("A área total do triângulo é = " + areaTriangulo);
		
		// Exercício 6 b2 - 4 * a * c
		double valorA = 1;
		double valorB = 12;
		double valorC = -13;
		
		double bhaskara1 = Math.pow(valorB, 2);
		double bhaskara2 = -4;
		double bhaskara3 = valorA * valorC;
		
		double resultadoBhaskara = bhaskara1 - bhaskara2 * bhaskara3;
		System.out.println("\nO resultado da equação (ax2 + bx + c = 0)");
		System.out.println("Tendo em conta a = 1, b = 12 e c = -13");
		System.out.println("Resultado = " + resultadoBhaskara);
	
		
		sc.close();
	}
	
}
