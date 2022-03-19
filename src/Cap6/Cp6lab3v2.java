package Cap6;

import javax.swing.JOptionPane;

public class Cp6lab3v2 {

	public static void main(String[] args) {
		
		int continuar=0;
		do 
		{
			new Aluno(JOptionPane.showInputDialog("Digite o nome do Aluno:"));		
			System.out.println("Contador acessado diretamente da classe: " + Aluno.contadorDeAlunos);
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");			
		}while(continuar==0);	
	}
}

