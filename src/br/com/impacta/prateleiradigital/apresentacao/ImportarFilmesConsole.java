package br.com.impacta.prateleiradigital.apresentacao;
import javax.swing.JOptionPane;
import br.com.impacta.prateleiradigital.controle.FilmeController;

public class ImportarFilmesConsole {

	public static void main(String[] args) {
		String pathFile = JOptionPane.showInputDialog("Digite o Caminho e o Nome com a extensão do arquivo:\n"
				+ "Exemplo:\n" + "C:\\Users\\solda\\Downloads\\filmes-imdb (1).csv");

		FilmeController controller = new FilmeController();
		try {
			controller.importarFilmes(pathFile);
			System.out.println("...");
			System.out.println("Filmes importados com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage(), "Erro ocorrido", JOptionPane.ERROR_MESSAGE);
		}
	}
}