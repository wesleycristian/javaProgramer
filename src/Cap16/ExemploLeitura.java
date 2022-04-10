package Cap16;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ExemploLeitura {

	public static void main(String[] args) {
		try {

			FileInputStream arquivo = new FileInputStream("GerarArquivo.txt");
			DataInputStream dados = new DataInputStream(arquivo);
			while (true) {
				char c = dados.readChar();
				System.out.println(c);

			}

		} catch (IOException e) {

		}

	}

}
