package ExerciciosExtras;

public class Exercicio3 {

	public static void main(String[] args) {
		int vetor[] = {2 , 4 , 6 , 8 , 10 , 12, 14,16,18,19,20};
		int num=0;
		for(int i=0; i<vetor.length ; i++)//preenchendo o vetor
		{
			vetor[i] = num+=2;//Incremento de num e Atribui��o ao vetor  
		}
		
		for(int i=0; i<vetor.length ; i++)//La�o impress�o
		{
			System.out.print(vetor[i] +" ");
		}		
	}
}

	