package cap4;

import javax.swing.JOptionPane;

public class SolicitarEmpretimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o Sal�rio: "));
		float prestacao = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da presta��o: "));
		if(prestacao>(salario*0.2))
			System.out.println("O Empr�stimo n�o pode ser concedido!");
		else
			System.out.println("O Empr�stimo pode ser concedido!");
	}
}
