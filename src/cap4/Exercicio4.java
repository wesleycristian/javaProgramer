package cap4;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		System.out.println("O sucessor de " + num1 + " é:\t" + (num1+1)) ;
		System.out.println("O Antecessor de " + num1 + " é:\t" + (num1-1)) ;
		
		
		
	}

}
