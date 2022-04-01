package Cap11;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
@author WESLEY CRISTIAN
*/
public class ExercicioGravacao {

	public static void main(String[] args) {
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("digite uma frase:");
			String texto = scanner.nextLine();
			PrintWriter writer = new PrintWriter( "D:/JAVA PROGRAMER/Exemplo/src/Cap11/texto.txt");
			writer.println(texto);
			writer.close();
			System.out.println("frase gravada com sucesso");
			
		}catch ( IOException e) {
			System.out.println("falha ao gravar informações");
		}
		

	}

}
