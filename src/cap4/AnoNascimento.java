package cap4;

import java.sql.Date;

import javax.swing.JOptionPane;

public class AnoNascimento {

	public static void main(String[] args) {
		
		int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de seu nascimento: "));
		int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
		System.out.println("Idade = " + (anoAtual-anoNascimento) + " anos!");
		
		Date data = new Date(anoAtual); //Classe Date obtem os dados de data.
		System.out.println("Idade = " + (data.getYear()+1900 -anoNascimento) + " anos!");
		
	}

}
