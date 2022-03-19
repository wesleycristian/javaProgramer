package ExerciciosExtras;

public class Exercicio1 {

	public static void main(String[] args) {
		int[] vet1= new int[20-2+1];
		int[] vet2= new int[19-10+1];
		int soma1=0, soma2=0;
		for(int i=0; i<vet1.length; i++)
		{
			vet1[i]=i+2;
			soma1+=vet1[i];
		}
		for(int i=0; i<vet2.length; i++)
		{
			vet2[i]=i+10;
			soma2+=vet2[i];
		}
		System.out.println("Soma é: "+ (soma2+soma1));
	}
}
