
import javax.swing.JOptionPane;
public class Exercicio8
{
	public static void main(String[] args) 
	{
		int qtd = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite a quantidade de alunos a cadastrar:"));
		String matriz[][] = new String[qtd][5];
		
		for(int l=0; l<matriz.length ; l++)
		{
			for(int c=0; c<5 ; c++)
			{
				if(c==0)
					matriz[l][c] = JOptionPane.showInputDialog("Digite o nome:");
				if(c==1)
					matriz[l][c] = JOptionPane.showInputDialog(""
						+ "Digite a 1� nota:");
				if(c==2)
					matriz[l][c] = JOptionPane.showInputDialog(""
						+ "Digite a 2� nota:");
				if(c==3)
				{
					matriz[l][c] = ""+((Float.parseFloat(matriz[l][1])+Float.parseFloat(matriz[l][2]))/2);
					if(Float.parseFloat(matriz[l][c])>5)
						matriz[l][4] = "Aprovado";
					else
						matriz[l][4] = "Reprovado";
				}					
			}
		}		
		System.out.print("\nImprimindo a Matriz: \n");
		System.out.print("Nome: 1� Nota 2� Nota M�dia   Situa��o\n");
		for(int l=0; l<matriz.length ; l++)
		{
			for(int c=0; c<5 ; c++)
			{
				System.out.print(matriz[l][c] + "\t");
			}
			System.out.print("\n");
		}	
	}
}