package Cap8;
import javax.swing.JOptionPane;

public class VetoresNomes 
{

	public static void main(String[] args) 
	{
		int qtd = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite a quantidade de nomes a cadastrar:"));
		String nomes[] = new String[qtd];
		
		for(int i=0; i<nomes.length ; i++)
		{
			nomes[i] = JOptionPane.showInputDialog("Digite o " + (i+1) 
					+ "º nome:");
		}
		
		for(String nome : nomes)
		{
			System.out.println("Nome: " + nome);			
		}
	}
}