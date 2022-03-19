package Cap8;

import javax.swing.JOptionPane;

public class ExemploVetor {

	public static void main(String[] args) {
Pessoa pessoas[] = new Pessoa[2];//criando o vetor com tamanho 2
		
		for(int i=0; i<pessoas.length; i++)//laço de cadastro do Vetor
		{
			pessoas[i] =  new Pessoa(Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura:")),
					Double.parseDouble(JOptionPane.showInputDialog("Digite o peso:")));
		}
		
		for(int i=0; i<pessoas.length; i++)//laço de impressão do Vetor
		{
			System.out.println("Altura: " + pessoas[i].altura  + 
					"\tPeso: " + pessoas[i].peso); 
		}
	}
}


