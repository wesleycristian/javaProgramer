package br.com.impacta.java.dao;

import java.sql.*;
import br.com.impacta.DAOException;
import br.com.impacta.model.Funcionario;

public class FuncionarioDAO {
	public static void main(String[] args) {

		Funcionario f1 = new Funcionario("fulano", 2800.5, 5);
	try {
		persist(f1);
	} catch (DAOException e) {
		
		e.printStackTrace();
	}
	}

	private final static String URL = "jdbc:mysql://localhost:3306/impacta";
	private final static String USER = "root";
	private final static String PASSWORD = "daniela123";

	private static Connection con;
	private static Statement stmt;
	private ResultSet rs;

	public static void openDB() {

		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = con.createStatement();
			System.out.println("\nConexão estabelecida com sucesso.");

		} catch (SQLException e) {
			System.out.println("\nNão foi possivel estabelecer conexão." + e + "\n");
			System.exit(1);

		}
	}

	public static void persist(Funcionario func) throws DAOException {

		
		try {
			stmt = con.prepareStatement(" INSERT INTO func (nome,salario, cargoId) " + "VALUES (?, ?, ?)");
			func.setNome(func.getNome());
			func.setSalario(func.getSalario());
			func.setCargoId(func.getCargoId());
			
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
}