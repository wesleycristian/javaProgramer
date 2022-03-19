package Cap6;

import javax.swing.JOptionPane;

public class Veiculo 
{
	private String placa;
	private int ano;
	
	public Veiculo() 	{}	
	
	public Veiculo(String placa, int ano) 
	{
		this.placa = placa;
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void mostrarDados() 
	{		
		System.out.println("Dados do Veículo: \nPlaca: " + getPlaca()
		+ "\n ano: " + getAno());		
	}
	
	public static void main(String[] args) 
	{				
		Veiculo novo = new Veiculo();
		novo.ano = 2020;
		novo.placa = "ABC-2323";		
		novo.mostrarDados();
		
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:"));
		String placa = JOptionPane.showInputDialog("Digite a placa:");
		
		Veiculo novo2 = new Veiculo(placa, ano);
		novo2.mostrarDados();
	}
}
