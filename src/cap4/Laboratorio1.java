package cap4;

import javax.swing.JOptionPane;

public class Laboratorio1 {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		int contador = 0;
		
		for(int i = 1; i <= numero; i++) {
			if(numero % i == 0 ) {
			   contador++;	
				
			}
	
		}
		if (contador > 2 || numero == 0 || numero == 1) {
			System.out.println( numero +" O numero não é primo ");
			
		}
		else {
			System.out.println( numero +" O numero é primo ");
			
		}

	}

}
