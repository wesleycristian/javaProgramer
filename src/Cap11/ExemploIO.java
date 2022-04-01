package Cap11;

import java.io.FileReader;
import java.io.IOException;

public class ExemploIO {

	public static void main(String[] args) {
		
		try { 
			FileReader doc;
			doc = new FileReader ("c:\\carta.txt");
							
		}catch (IOException e) {
			System.out.println("nao foi possivel abrir o arquivo");
			e.printStackTrace();

	}

	}
}