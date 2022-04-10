package br.com.impacta.prateleiradigital.negocio;

public class LerFilme {

	public static void main(String[] args) {
		
		String filme = "A Sombra e a Escuridão;Stephen Hopkins;6.8;110;1996;adventure, drama, horror, thriller;46293;http://www.imdb.com/title/tt0116409/";
		gerarFilme(filme);
	}
	private static void gerarFilme(String nextLine) { //private static Filme gerarFilme(String nextLine) {
		String[] colunas = nextLine.split(";");
		Filme filme = new Filme(colunas[0], colunas[1], Double.parseDouble(colunas[2]), 
				Integer.parseInt(colunas[3]),Integer.parseInt(colunas[4]), colunas[5], 
				Integer.parseInt(colunas[6]), colunas[7]);
		for(int i = 0 ; i< colunas.length ; i++)
			System.out.print(colunas[i] + "\n");		
	}
}