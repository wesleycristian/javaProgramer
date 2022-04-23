package ExerciciosExtras.interfaces;

import javax.swing.*;

public class ExemploFrame1 {
	public static void main(String[] args) {

		JFrame f = new JFrame();
		JLabel texto = new JLabel(" Criando meu primeiro JLabel ");
		f.setSize(275, 100);
		f.getContentPane().add(texto);
		f.setVisible(true);
		
	}
	
}
