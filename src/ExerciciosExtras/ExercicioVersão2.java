package ExerciciosExtras;

import javax.swing.JOptionPane;

public class ExercicioVers�o2 {

	public static void main(String[] args) {
		int qtd = Integer.parseInt(	JOptionPane.showInputDialog(
				"Digite a quantidade de n�meros a cadastrar no vetor:"));
		int vetor[] = new int[qtd];
		String resultado = "";
		
		for(int i=0 ; i<qtd ; i++)
		{
			vetor[i] = Integer.parseInt(	JOptionPane.showInputDialog(
					"Digite o " + (i+1) + " n�mero:"));
		}
		
		int num = Integer.parseInt(
				JOptionPane.showInputDialog("Digite o n�mero a pesquisar:"));
		for(int i=0; i<vetor.length ; i++)//La�o de Pesquisa
		{
			if(vetor[i]==num)
			{
				resultado = "N�mero " + num + " encontrado na posi��o: " + i;
				break;
			}
		}
		if(resultado=="")
			System.out.println("N�mero " + num + " n�o encontrado no vetor.");
		else
			System.out.println(resultado);
	}
}

