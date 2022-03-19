package cap4;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		
		if(num1 ==20)
			System.out.println("O numero é igual a 20!");
		else if (num1>20)
			System.out.println("O numero é maior que 20!");
		else 
		System.out.println("O numero é menor que 20!");
	}

}
