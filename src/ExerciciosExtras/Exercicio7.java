package ExerciciosExtras;

public class Exercicio7 {

	public static void main(String[] args) {

		double vetor1[] = { 4, 22, 29.785, 44, 33, 40, 80, 99 };

		double maior = 0, somaTodos = 0;
		int multiplus5 = 0, maiores10menores30 = 0;

		for (int i = 0; i < vetor1.length; i++) {
			if (maior < vetor1[i])
				maior = vetor1[i];
			if (vetor1[i] % 5 == 0)// Vericando se é multiplo 5
				multiplus5++;
			if (vetor1[i] > 10 && vetor1[i] < 30)
				maiores10menores30++;
			somaTodos += vetor1[i];
		}

		System.out.print("\nNúmeros no Vetor: \n");
		for (int i = 0; i < vetor1.length; i++)// imprimindo o vetor
		{
			System.out.print(vetor1[i] + "\t");
		}

		System.out.print("\nMaior valor no vetor: " + maior);
		System.out.print("\nTotal de Múltiplos de 5 no vetor: " + multiplus5);
		System.out.print("\nTotal de Números \">10 e <30\" no vetor: " + maiores10menores30);
		System.out.print("\nMédia dos números do vetor: " + somaTodos / vetor1.length);
	}
}
