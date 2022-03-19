package cap7;

public class Cadastro {

	private String nome;
	private String sobrenome;
	private int idade;
	
	
	public Cadastro() {
		super();
		
	}
	
	
	public Cadastro(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}


	public Cadastro(String nome, String sobrenome, int idade) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}

    public void mostrar(Cadastro cad) {
    	System.out.println(nome +" " + sobrenome + " "+  idade);
    }
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void mostrar(){
		System.out.println("Nome: " + nome);
		System.out.println("Sobrenome: " + sobrenome);
		System.out.println("Idade: " + idade);
		System.out.println();
	
}
}
