package cap4;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número: "));
		if(num1>0)
			System.out.println("A raiz quadrada de " + num1 + " é: " + (Math.sqrt(num1)));
		else
			System.out.println("O quadrado de " + num1 + " é: " + (num1*num1));
      
		
	}

}
