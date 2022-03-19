
//* 17) Crie programa que solicite ao usuário o tamanho de uma matriz 
//* quadrada (ex: 4X4). Em seguida preencha os valores inteiros na 
//* Matriz. Ao final mostre:
//* A Matriz completa;
//* O maior valor da diagonal principal;
//* O menor valor da diagonal secundária.
//*/
package Cap8;

import javax.swing.JOptionPane;

public class MatrizQuadradaEx17 {
	public static void main(String[] args) {
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da matriz quadrada:"));

		int matriz[][] = new int[qtd][qtd];

		int maiorDP = -100, menorDS = 300;

		for (int l = 0; l < qtd; l++)// laço para percorrer as linhas
		{
			for (int c = 0; c < qtd; c++)// laço para percorrer as colunas
			{
				matriz[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (c + 1) + " número:"));

				// testar se estamos na Diagonal Principal
				if (l == c) {
					if (maiorDP < matriz[l][c])
						maiorDP = matriz[l][c];
				}

				// testar se estamos na Diagonal Secundária
				if ((l + c) == (qtd - 1)) {
					if (menorDS > matriz[l][c])
						menorDS = matriz[l][c];
				}
				System.out.print(" " + matriz[l][c] + " ");// imprime as colunas da linha
			}
			System.out.println();
		}
		System.out.println("\n\n" + " Maior da DP: " + maiorDP);
		System.out.println(" Menor da DS: " + menorDS);
	}

}
