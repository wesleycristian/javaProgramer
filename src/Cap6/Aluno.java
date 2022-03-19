package Cap6;

public class Aluno {

	
	public static int contadorDeAlunos;
	private String nome;
	public int contadorDeAluno;	

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public void imprimeAluno() 
	{
		System.out.println("Aluno: " + this.nome);		
	}
	
	public Aluno() {}
		
	public Aluno(String nome) 
	{
		this.nome=nome;
		contadorDeAlunos++;
		imprimeAluno(nome);
	}
	
	public void imprimeAluno(String nome) 
	{
		System.out.println("Aluno: " + this.nome);
		System.out.println("Contagem no objeto: " + this.nome + " = " + contadorDeAlunos);		
	}
}


