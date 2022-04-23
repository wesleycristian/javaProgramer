package Cap18;

 public class Funcionario 
{
	private int id;
	private String nome, cidade;
	private double salario;
	public Funcionario(int id, String nome, String cidade, double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.cidade = cidade;
		this.salario = salario;
	}
	public Funcionario() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String d) {
		this.nome = d;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", Nome=" + nome + ", Cidade=" + cidade + ", Salário=" + salario + "]";
	}
}