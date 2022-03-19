package cap5;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int idade = 0;

		while (idade != -99) {
			int i = 1;
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
			
			if ( idade < 21 ) { 
				
				System.out.println("a idade da pessoa numero " + i + " é " + idade);
			}
			i++;
		}
		
	}

}
