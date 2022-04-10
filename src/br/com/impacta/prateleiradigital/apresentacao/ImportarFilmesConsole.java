package br.com.impacta.prateleiradigital.apresentacao;

import javax.swing.JOptionPane;

public class ImportarFilmesConsole {

		public static void main(String[] args) {
			
			String pathFile = JOptionPane.showInputDialog(
					"Digite o caminho e nome do arquivo a ser importado: ");
			
			FilmeControler controller = new FilmeControler();
			try {
				controller.importarFilmes(pathFile);
				System.out.println("...");
				System.out.println("Filmes importados com sucesso!");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,e.getMessage(),
						"Erro ocorrido",JOptionPane.ERROR_MESSAGE);
			}
		}
	}
