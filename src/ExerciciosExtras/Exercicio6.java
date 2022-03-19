package ExerciciosExtras;

public class Exercicio6 {

	public static void main(String[] args) {
		int vetor1[] = { 4, 55, 32, 44, 33 };
		int vetor2[] = { 8, 10, 9, 62, 37 };
		int vetor3[] = new int[5];
		System.out.print("Vetor 1: \n");
		for (int i = 0; i < vetor1.length; i++)// imprimindo o vetor
		{
			System.out.print(vetor1[i] + " ");
		}
		System.out.print("\nVetor 2: \n");
		for (int i = 0; i < vetor2.length; i++)// imprimindo o vetor
		{
			System.out.print(vetor2[i] + " ");
		}

		System.out.print("\nSoma dos números de mesma posição: \n");
		for (int i = 0; i < vetor3.length; i++)// imprimindo o vetor
		{
			vetor3[i] = (vetor1[i] + vetor2[i]);
			System.out.print(vetor3[i] + " ");
		}
	}
}
