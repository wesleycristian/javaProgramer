package ExerciciosExtras;

public class Exercicio4 {

	public static void main(String[] args) {
int vetor1[] = { 4 , 55 , 32 , 44 ,  8 , 10 , 9 , 62 };
		
		int maior30=0;
		int somaMaior30=0, somaTodos=0;
		for(int i=0; i<vetor1.length ; i++)//preenchendo o vetor
		{
			if(vetor1[i]>30)
			{
				maior30++;
				somaMaior30+=vetor1[i];
			}
			somaTodos+=vetor1[i];
		}
		System.out.print("Números do vetor: \n" );
		for(int i=0; i<vetor1.length ; i++)//imprimindo o vetor
		{
			System.out.print(vetor1[i] + " ");
		}
		System.out.println("\n\nA soma dos números > 30 = " + somaMaior30);				
		System.out.println("\nA soma de todos os números do vetor = " + somaTodos);
		System.out.println("\nTotal de números maiores 30 = " + maior30);
	}
}
