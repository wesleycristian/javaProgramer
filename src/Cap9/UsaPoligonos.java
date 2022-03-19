package Cap9;

import javax.swing.JOptionPane;

public class UsaPoligonos {

	public static void main(String[] args) {
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite: \n1-Quadrado ou \n2-Triângulo"));
		if(escolha==1)//calcular a área do quadrado
		{
			Quadrado q = new Quadrado(Double.parseDouble(JOptionPane.showInputDialog(
				"Digite o valor do lado:")));
			System.out.println("A área do quadrado com lado " + q.lado +
					" = " + q.calcularArea());
		}
		else if(escolha==2)//calcular a área do triangulo 
		{
			Triangolo t = new Triangolo(Double.parseDouble(JOptionPane.showInputDialog(
					"Digite o valor da altura:")), Double.parseDouble(JOptionPane.showInputDialog(
							"Digite o valor da base:")));
				System.out.println("A área do triângulo com altura " + t.altura + " e base "
						+ t.base + " = " + t.calcularArea());
		}
	}
}
