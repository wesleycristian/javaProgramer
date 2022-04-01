package Cap11;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExercicioIdade {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Digite o ano de seu nascimento: ");

			String anoStr = scanner.nextLine();
			int ano = Integer.parseInt(anoStr);
			int idade = 2022 - ano;

		} catch (Exception e) {
			System.out.println("Conta de tipo Incompativel");
			e.printStackTrace();
		}

	}
}
