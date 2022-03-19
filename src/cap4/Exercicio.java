package cap4;

import javax.swing.JOptionPane;

public class Exercicio {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 1:"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 2:"));
        int total = num1 + num2;
		//if((num1+num2)>10)
		System.out.println(total > 10 ? " Maior que 10 " : " total é menor" );
	
	}

}
