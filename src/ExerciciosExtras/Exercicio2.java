package ExerciciosExtras;

public class Exercicio2 {

	public static void main(String[] args) {
		int vetor[] = new int[10];//declarando o vetor
		int num=0;
		for(int i=0; i<vetor.length ; i++)//preenchendo o vetor
		{
			vetor[i] = num+=2;//Incremento de num e Atribuição ao vetor  
		}
		
		for(int i=0; i<vetor.length ; i++)//Laço impressão
		{
			System.out.print(vetor[i] +" ");
		}		
	}
}
