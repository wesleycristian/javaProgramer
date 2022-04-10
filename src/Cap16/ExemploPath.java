package Cap16;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ExemploPath {

	public static void main(String[] args) {
		Path poema = Paths.get(" resources\\poema.txt");
		/* exibe o caminho especifico pelo path  */
		System.out.println(poema);
		/* exibe o caminho completo do path a partir da raiz */
		System.out.println(poema.toAbsolutePath());
		/* exibe apenas o nome do arquivo */
		System.out.println(poema.getFileName());
		/* exibe o caminho completo do diretório pai */
		System.out.println(poema.getParent().toAbsolutePath());
		
	}

}
