package cap5;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		
int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));
int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro: "));
		
		System.out.println(" média dos valores digitados é " + (num1+num2+num3)/3);

	}

}
