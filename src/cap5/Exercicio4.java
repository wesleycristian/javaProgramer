package cap5;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
		String sexo = JOptionPane.showInputDialog("Digite o seu sexo: Feminino ou Masculino");
		if(idade<25 && sexo.equalsIgnoreCase("Feminino"))
		{
			System.out.println(nome + " Aceita!");
		}		
		else
			System.out.println("Não Aceita!");
	}
}


