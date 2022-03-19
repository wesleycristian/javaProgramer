package cap4;

import javax.swing.JOptionPane;

public class Exercicio9 {

	public static void main(String[] args) {
		int a  = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
		int b  = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
		int c  = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C: "));
		
		
		if((b*b-4*a*c)<0)
			System.out.println("Não existe raizes no mundo dos números Reais ");
		else
		{
			double delta = Math.sqrt(b*b-4*a*c);
			double x1 = (-b + delta)/(2*a);
			double x2 = (-b - delta)/(2*a);
			System.out.println("X1 = " + x1 +  "\nX2 = " + x2);
		
	}
	}
}
