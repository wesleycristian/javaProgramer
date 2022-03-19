package Cap8;

public class ArrayBidimensional {

	public static void main(String[] args) {

		double notas[][] = new double[100][3];

		notas[0][0] = 6.5;
		notas[0][1] = 7.5;
		notas[0][2] = 7.0;

		notas[1][0] = 5.4;
		notas[1][1] = 9.0;
		notas[1][2] = 4.1;

		notas[99][0] = 7.2;
		notas[99][1] = 8.6;
		notas[99][2] = 6.5;

		for (int l = 0; l < 100; l++)// laço para linhas
		{
			System.out.print((l + 1) + "º Aluno: ");
			for (int c = 0; c < 3; c++)// laço para colunas
			{
				System.out.print((c + 1) + "ª Nota: " + notas[l][c] + " \t ");
			}
			if (l == 1)
				break;
			System.out.println();
		}
	}
}
