package Cap03;

import javax.swing.JOptionPane;

public class CriarPrograma {

	public static void main(String[] args) {
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero:"));
		
		System.out.println( numero1 > numero2  ? numero1: numero2);
		
	
	}
}

