package cap4;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1� n�mero: "));
		if(num1>0)
			System.out.println("A raiz quadrada de " + num1 + " �: " + (Math.sqrt(num1)));
		else
			System.out.println("O quadrado de " + num1 + " �: " + (num1*num1));
      
		
	}

}
