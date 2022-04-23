package Cap19;

public class Aluno {

	int idAluno;
	String nome, telefone;
	float nota1, nota2, nota3, media;
	public int idAluno() {
		return idAluno;
	}
	public void setCodigo(int codigo) {
		this.idAluno = codigo;
	}
	public String getNome() {
		return nome;
	}
	public int getIdAluno() {
		return idAluno;
	}
	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public float getNota1() {
		return nota1;
	}
	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}
	public float getNota2() {
		return nota2;
	}
	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	public float getNota3() {
		return nota3;
	}
	public void setNota3(float nota3) {
		this.nota3 = nota3;
	}
	public float getMedia() 
	{
		//media = getNota1() + getNota2() + getNota3() + /2;
		return media;
	}
	public void setMedia(float media) {
		this.media = media;
	}
	public Aluno(int codigo, String nome, String telefone, float nota1, float nota2, float nota3, float media) {
		super();
		this.idAluno = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.media = media;
	}
	public Aluno() {}
	public String toString() 
	{
		return String.format("Aluno [Código=%-2d Nome:%-10s Telefone:%-10s "
			+ "Nota1: %2.2f Nota2: %2.2f Nota3: %2.2f Média: %2.2f ", 
				getIdAluno(), getNome(),  getTelefone(),getNota1(),getNota2(),
				getNota3(),getMedia()) + "]";
	}
	public float getmedia() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setmedia(float getmedia) {
		// TODO Auto-generated method stub
		
	}
}