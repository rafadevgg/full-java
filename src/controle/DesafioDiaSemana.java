package controle;

import javax.swing.JOptionPane;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("Informe o dia da semana:");
		
		if (a.equals("Domingo")) {
			System.out.print(1);
		} else if (a.equalsIgnoreCase("Segunda")) {
			System.out.print(2);
		} else if (a.equalsIgnoreCase("Terça") || a.equalsIgnoreCase("Terca")) {
			System.out.print(3);
		} else if (a.equalsIgnoreCase("Quarta")) {
			System.out.print(4);
		} else if (a.equalsIgnoreCase("Quinta")) {
			System.out.print(5);
		} else if (a.equalsIgnoreCase("Sexta")) {
			System.out.print(6);
		} else if (a.equalsIgnoreCase("Sábado") || a.equalsIgnoreCase("Sabado")) {
			System.out.print(7);
		}
				
	}

}
