package br.com.impacta.model;

public class Funcionario {

	private int id;
	private String nome;
	private double salario;
	private int cargoId;

	public Funcionario(String nome, double salario, int cargoId) {
		super();
		this.nome = nome;
		this.salario = salario;
        this.cargoId = cargoId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getCargoId() {
		return cargoId;
	}

	public void setCargoId(int cargoId) {
		this.cargoId = cargoId;
	}

}
