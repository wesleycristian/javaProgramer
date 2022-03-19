package ExerciciosExtras;

import javax.swing.JOptionPane;

public class ExercicioVersão2 {

	public static void main(String[] args) {
		int qtd = Integer.parseInt(	JOptionPane.showInputDialog(
				"Digite a quantidade de números a cadastrar no vetor:"));
		int vetor[] = new int[qtd];
		String resultado = "";
		
		for(int i=0 ; i<qtd ; i++)
		{
			vetor[i] = Integer.parseInt(	JOptionPane.showInputDialog(
					"Digite o " + (i+1) + " número:"));
		}
		
		int num = Integer.parseInt(
				JOptionPane.showInputDialog("Digite o número a pesquisar:"));
		for(int i=0; i<vetor.length ; i++)//Laço de Pesquisa
		{
			if(vetor[i]==num)
			{
				resultado = "Número " + num + " encontrado na posição: " + i;
				break;
			}
		}
		if(resultado=="")
			System.out.println("Número " + num + " não encontrado no vetor.");
		else
			System.out.println(resultado);
	}
}

