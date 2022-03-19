package TreinamentoSolo;

import javax.swing.JOptionPane;

public class Primeirotreino {

	public static void main(String[] args) {

		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite valor 1:"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite valor 2:"));
		int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite valor 3:"));
		int valor4 = Integer.parseInt(JOptionPane.showInputDialog("Digite valor 4:"));
		int valor5 = Integer.parseInt(JOptionPane.showInputDialog("Digite valor 5:"));
		int valor6 = Integer.parseInt(JOptionPane.showInputDialog("Digite valor 6:"));
		int resultado = valor1 + valor2 + valor3 + valor4 + valor5 + valor6;
		int resultado2;

		resultado2 = valor4 * (valor2 + valor5) / (valor6 - valor3);
		// System.out.println(valor1 +" + "+ valor2 + " + " + valor3 + " = " +
		// resultado);
		// System.out.println(valor4 + " * " + valor2 + " + " + valor5 + " / " + valor6
		// + " - " + valor3 + " = " + resultado2);
		JOptionPane.showMessageDialog(null, valor1 + " + " + valor2 + " + " + valor3 + " = " + resultado);
		JOptionPane.showMessageDialog(null,
				valor4 + " * " + valor2 + " + " + valor5 + " / " + valor6 + " - " + valor3 + " = " + resultado2);

	}

}
