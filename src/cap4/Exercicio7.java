package cap4;

import javax.swing.JOptionPane;

public class Exercicio7 {

	public static void main(String[] args) {
		float valorHora = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor da Hora: "));
		float totalHoras = Integer.parseInt(JOptionPane.showInputDialog("Digite o Total de Horas aula ministradas: "));
		float descontoINSS = Integer.parseInt(JOptionPane.showInputDialog("Digite o percentual de desconto do INSS: "));
		System.out.println("Salário Líquido = " + ((valorHora*totalHoras)-(valorHora*totalHoras)*descontoINSS/100));
	}

}
