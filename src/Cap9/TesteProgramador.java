package Cap9;

import javax.swing.JOptionPane;

public class TesteProgramador {

	public static void main(String[] args) {
		int resp=0;
		do
		{
			Programador jr = new Programador();
			
			jr.nome = JOptionPane.showInputDialog("Digite o nome:");
			jr.email = JOptionPane.showInputDialog("Digite o email:");
			jr.setLinguagem(JOptionPane.showInputDialog("Digite a linguagem:"));
			jr.setSistemaOperacional(JOptionPane.showInputDialog("Digite o Sistema Operacional:"));
			
			jr.imprimirDados();
			resp = JOptionPane.showConfirmDialog(null, "Cadastrar outro?");
		}while(resp==0);		
	}
}
		
