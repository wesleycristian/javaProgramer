package cap5;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		
		int idade, maiores50=0, menores21=0;
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
		while(idade!=-99)
		{			
			if(idade<25)
				menores21++;
			else if(idade>50)
				maiores50++;
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade OU -99 para encerrar: "));
		}		
			System.out.println("Total de Pessoas:"
					+ "\nMenores de 21: " +menores21 + 
					"\nMaiores de 50 :" + maiores50);
	}
}
