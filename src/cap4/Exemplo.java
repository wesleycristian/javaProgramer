package cap4;

import javax.swing.JOptionPane;

public class Exemplo {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog(" Digite o numero"));// vou digitar 10
		System.out.println(num += 100);// vai imprimir 110
		System.out.println(num ++);// vai imprimir 110
		System.out.println(num --);// vai imprimir 111
		System.out.println(++ num);// vai imprimir 111
		System.out.println(--num); // vai imprimir 110
		

	}

}
