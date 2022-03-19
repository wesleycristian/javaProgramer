package Cap8;
import javax.swing.JOptionPane;

public class ExercicioTest {

	public static void main(String[] args) {
		float media=0;
		int qtd = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite a quantidade de alunos a cadastrar:"));
		String alunos[][] = new String [qtd][5]; 

		for(int l=0 ; l<qtd ; l++)//laço de cadastro para linhas
		{
			for(int c=0 ; c<3 ; c++)//laço de cadastro para colunas
			{
				if(c==0)
					alunos[l][c] = JOptionPane.showInputDialog(
							"Digite o nome do Aluno:"); 
				else if(c==1)
					alunos[l][c] = JOptionPane.showInputDialog(
							"Digite a 1ª Nota:");
				else if(c==2)
					alunos[l][c] = JOptionPane.showInputDialog(
							"Digite a 2ª Nota:");
				if(c>1)
						media = (Float.parseFloat(alunos[l][1])+Float.parseFloat(alunos[l][2]))/2;
				alunos[l][3] = "" + media;
				if(media>=7)
					alunos[l][4] = "Aprovado";
				else 
					alunos[l][4] = "Reprovado";
			}
		}
		for(int l=0 ; l<qtd ; l++)
		{
			for(int c=0 ; c<5 ; c++)
			{
				System.out.print(alunos[l][c] + "\t");
			}
			System.out.println("");
		}	
	}


	}


