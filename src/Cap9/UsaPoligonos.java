package Cap9;

import javax.swing.JOptionPane;

public class UsaPoligonos {

	public static void main(String[] args) {
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite: \n1-Quadrado ou \n2-Tri�ngulo"));
		if(escolha==1)//calcular a �rea do quadrado
		{
			Quadrado q = new Quadrado(Double.parseDouble(JOptionPane.showInputDialog(
				"Digite o valor do lado:")));
			System.out.println("A �rea do quadrado com lado " + q.lado +
					" = " + q.calcularArea());
		}
		else if(escolha==2)//calcular a �rea do triangulo 
		{
			Triangolo t = new Triangolo(Double.parseDouble(JOptionPane.showInputDialog(
					"Digite o valor da altura:")), Double.parseDouble(JOptionPane.showInputDialog(
							"Digite o valor da base:")));
				System.out.println("A �rea do tri�ngulo com altura " + t.altura + " e base "
						+ t.base + " = " + t.calcularArea());
		}
	}
}
