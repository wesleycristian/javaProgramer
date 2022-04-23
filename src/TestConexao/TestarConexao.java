package TestConexao;

import java.sql.*;

import br.com.impacta.DAOException;
import br.com.impacta.model.Funcionario;

public class TestarConexao {

	private final static String url = "jdbc:mysql://localhost:3306/impacta";

	private final static String username = "root";
	private final static String password = "daniela1234";

	private static Connection con;
	private static Statement stmt;
	private ResultSet rs;

	private String nome = null;
	private String telefone = null;

	public static void main(String args[]) throws DAOException {
		TestarConexao b = new TestarConexao();
	
		
		b.openDB();
		b.mostra();
		//b.closedDB();
    
	}

	public static void openDB() {

		try {
			con = DriverManager.getConnection(url, username, password);
			stmt = con.createStatement();
			System.out.println("\nConexão estabelecida com sucesso.");

		} catch (SQLException e) {
			System.out.println("\nNão foi possivel estabelecer conexão." + e + "\n");
			System.exit(1);

		}
	}

	private void closedDB() {
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println("\nNão foi possivel fechar conexão." + e + "\n");
			System.exit(1);

		}
	}

	public void setnome(String nome) {
		if (nome.trim().length() == 0)
			this.nome = null;
		else
			this.nome = nome;

	}

	public void settelefone(String telefone) {
		if (telefone.trim().length() == 0)
			this.telefone = null;
		else
			this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	private void mostra() {
		String query;

		try {
			query = " SELECT * FROM alunos";
			System.out.println(" \nMostrando dados.\n");

			rs = stmt.executeQuery(query);
			while (rs.next()) {

				System.out.println(rs.getString("nome"));
				System.out.println(rs.getString("telefone"));
			}

		} catch (SQLException e) {
			setnome(null);
			settelefone(null);
		}
	}
public static void persist(Aluno aluno) throws DAOException {

		
		try {
			TestarConexao.openDB();
		    PreparedStatement ps = con.prepareStatement(" INSERT INTO alunos (nome,telefone)" + " VALUES (?,?,?,?)");
			ps.setString(1, aluno.getNome());
		    ps.setInt(2, aluno.getTelefone());
		    ps.execute();
		    aluno.setNome(aluno.getNome());
			aluno.setTelefone(aluno.getTelefone());
		    
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
}

}
