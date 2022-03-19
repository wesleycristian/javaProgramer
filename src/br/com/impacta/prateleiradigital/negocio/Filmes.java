package br.com.impacta.prateleiradigital.negocio;

public class Filmes {

	private String titulo, diretores, generos, url;
	private double nota;
	private int duracao, ano, numDeVotos;

	public Filmes(String titulo, String diretores, String generos, String url, double nota, int duracao, int ano,
			int numDeVotos) {
		super();
		this.titulo = titulo;
		this.diretores = diretores;
		this.generos = generos;
		this.url = url;
		this.nota = nota;
		this.duracao = duracao;
		this.ano = ano;
		this.numDeVotos = numDeVotos;
	}

	public Filmes() {
	}

}
