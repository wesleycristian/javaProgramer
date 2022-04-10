package br.com.impacta.prateleiradigital.negocio;
public class Filme 
{
	private String titulo, diretores;
	int url;
	double generos;
	private double nota;
	String duracao;
	private int ano;//caso não tenha modificador será default ~
	String numDeVotos;
	
	public Filme(String titulo, String diretores, double nota2, int j, double nota, String string, int ano,
			String string2) 
	{		
		this.titulo = titulo;
		this.diretores = diretores;
		this.generos = nota2;
		this.url = j;
		this.nota = nota;
		this.duracao = string;
		this.ano = ano;
		this.numDeVotos = string2;
	}	
	public Filme() {}
	public int getNumVotos() {
		
		return 0;
	}
	public double getNota() {
		
		return 0;
	}
		
}