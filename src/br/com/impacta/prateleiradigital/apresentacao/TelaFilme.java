package br.com.impacta.prateleiradigital.apresentacao;

public class TelaFilme {

private String titulo;
private String diretor;
private double nota;
private int duracao;
private int ano;
private String genero;
public TelaFilme(String titulo, String diretor, double nota, int duracao, int ano, String genero, int nunVotos,
		String url) {
	super();
	this.titulo = titulo;
	this.diretor = diretor;
	this.nota = nota;
	this.duracao = duracao;
	this.ano = ano;
	this.genero = genero;
	this.nunVotos = nunVotos;
	this.url = url;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getDiretor() {
	return diretor;
}
public void setDiretor(String diretor) {
	this.diretor = diretor;
}
public double getNota() {
	return nota;
}
public void setNota(double nota) {
	this.nota = nota;
}
public int getDuracao() {
	return duracao;
}
public void setDuracao(int duracao) {
	this.duracao = duracao;
}
public int getAno() {
	return ano;
}
public void setAno(int ano) {
	this.ano = ano;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public int getNunVotos() {
	return nunVotos;
}
public void setNunVotos(int nunVotos) {
	this.nunVotos = nunVotos;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
private int nunVotos;
private String url;
}
