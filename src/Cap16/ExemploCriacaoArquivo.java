package Cap16;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExemploCriacaoArquivo {

	static String texto = new String("java ");

	public static void main(String args[]) {

		try {

			FileOutputStream arquivo = new FileOutputStream("GerarArquivo.txt");
			DataOutputStream dados = new DataOutputStream(arquivo);
			dados.writeChars(texto);

		} catch (IOException e) {

			System.out.println(e.getMessage());
		}

	}
}