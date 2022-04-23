package Cap03;

import javax.swing.JOptionPane;

public class Laboratorio1 {

	public static void main(String[] args) {
		
		int valor1, valor2, valor3;
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número:"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número:"));
		valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3º número:"));
		System.out.println(valor1 + " + " + valor2 + " + " + valor3 +  " = " + (valor1 + valor2+ valor3));
		
	}
}


