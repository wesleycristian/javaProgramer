package ExerciciosExtras;

public class Exercicio9 {

	public static void main(String[] args) {
int vetor1[] = { 10 , 11 , 12 , 13 , 14 , 15 , 16 , 17 , 18 , 19 , 20 };
		
		System.out.print("Imprimindo os pares em ordem decrescente:\n");
		for(int i=10; i>-1 ; i--)
		{
			if(vetor1[i]%2==0)
				System.out.print(vetor1[i] + "\t");
		}
		
		System.out.print("\n\nImprimindo os ímpares em ordem crescente:\n");
		for(int i=0; i<11 ; i++)
		{
			if(vetor1[i]%2==1)
				System.out.print(vetor1[i] + "\t");
		
		}
	}
}
		
