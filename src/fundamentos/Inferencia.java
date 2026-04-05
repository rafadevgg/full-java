package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "test";
		System.out.println(c);
		c = "outro test";
		System.out.println(c);
		
		// TODO: Pode estabelecer um novo valor para a inferência, mas NUNCA mudar o tipo dela.
		
		double d;
		d = 123.65;
		System.out.println(d);
		
	}
	
}
