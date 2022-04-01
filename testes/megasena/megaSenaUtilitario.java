package megasena;
import java.util.Random;

public class megaSenaUtilitario {

	public static int sortearNumero() {
		Random sorteador = new Random();
		int numero = sorteador.nextInt();

		while ( numero <= 0 || numero> 60);{
		numero = sorteador.nextInt();
		}
		
		return numero;

	}
	//public static void main(String a []) {
	//MegaSenaUtilitario msu = new MegaSenaUtilitario();
	//for(int i=0 ; i<6 ; i++)
	//System.out.print(sortearNumero()+"\t");
		
	}

