package Cap6;

import javax.swing.JOptionPane;

public class SomarDoisNumeros {

	public static void main(String[] args) {
		float num1 = Float.parseFloat(JOptionPane.showInputDialog
				("Digite um número:"));
		float num2 = Float.parseFloat(JOptionPane.showInputDialog
				("Digite um segundo número:"));
		
		JOptionPane.showMessageDialog(null, "Resultado da soma: "  +
		somar(num1, num2));
	}

	private static float somar(float num1, float num2) 
	{
		return (num1+num2);
	}
}
