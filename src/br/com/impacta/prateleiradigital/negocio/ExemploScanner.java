package br.com.impacta.prateleiradigital.negocio;

import java.util.Scanner;

public class ExemploScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Nome      : ");
			String nome = scanner.nextLine();
			System.out.println("Nome digitado: " + nome);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro na entrada de dados");
		}
	}
}