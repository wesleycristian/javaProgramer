package cap4;

import javax.swing.JOptionPane;

public class Exercicio8 {

	public static void main(String[] args) {
		float temperaturaCelsius = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura em celsius: "));
        float fahrenheit = temperaturaCelsius * 1.8f + 32f;
        
        System.out.println(fahrenheit);
	}

}
