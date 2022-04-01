package TestConexao;

public class Aluno {
    @ID
	private long alunosID;
	private String nome;
	private int telefone;
	public Aluno(String nome, int telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
}
