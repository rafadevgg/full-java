package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		
		final int const1 = 32;
		final double const2 = 5.0 / 9.0;
		
		double fahrenheit = 86;
		
		double celsius = (fahrenheit - const1) * const2;
		
		System.out.println("Temperatura em Celsius = " + celsius + "°C");
		
	}
	
}
