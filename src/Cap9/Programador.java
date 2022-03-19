package Cap9;

public class Programador extends Funcionario
{
	private String linguagem, sistemaOperacional;

	public Programador(String nome, String email, String linguagem, String sistemaOperacional) {
		super(nome, email);//super é uma chamada do construtor de Funcionário
		this.linguagem = linguagem;
		this.sistemaOperacional = sistemaOperacional;
	}

	public Programador() {
		// TODO Auto-generated constructor stub
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}

	public String getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}
	
	public void imprimirDados()
	{
		System.out.print("Nome: " + nome + "\n" + "Email: " + email 
				+ "\n" + "Linguagem: " + linguagem+ "\n" 
				+ "Sistema Operacional: " + sistemaOperacional);
	}
}