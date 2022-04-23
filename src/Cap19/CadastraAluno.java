package Cap19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class CadastraAluno {
	public static void main(String[] args) {
		try {
			Aluno novo;
			int resp = 0;
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/impacta", "root", "daniela1234");
			Statement st = cn.createStatement();
			ResultSet rs = null;
			PreparedStatement ps = null;
			while (resp == 0) {
				novo = new Aluno();
				ps = cn.prepareStatement("INSERT INTO Alunos VALUES (?, ?, ?, ?, ?, ?, ?)");
				int id = 1;
				novo.setNome(JOptionPane.showInputDialog("Digite o Nome:"));
				novo.setTelefone(JOptionPane.showInputDialog("Digite o Telefone:"));
				novo.setNota1(Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota1:")));
				novo.setNota2(Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota2:")));
				novo.setNota3(Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota3:")));
				novo.setMedia(novo.getMedia());
				// Percorrendo a tabela de alunos buscando o último ID
				rs = st.executeQuery("SELECT IdAlunos FROM Alunos");
				while (rs.next()) {
					id = rs.getInt("idAlunos");
				}
				ps.setInt(1, (id + 1));
				ps.setString(2, novo.getNome());
				ps.setString(3, novo.getTelefone());
				ps.setFloat(4, novo.getNota1());
				ps.setFloat(5, novo.getNota2());
				ps.setFloat(6, novo.getNota3());
				ps.setFloat(7, novo.getMedia());
				ps.executeUpdate();
				JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!!!");
				resp = JOptionPane.showConfirmDialog(null, "Cadastrar Outro?");
			}
			rs.close();
			ps.close();
			cn.close();
			JOptionPane.showMessageDialog(null, "Conexão encerrada.");
		} catch (SQLException e) {
			System.out.println("Falha ao realizar a operação." + e.getMessage());
			e.printStackTrace();
		}
       imprimir();
	}

	public static void imprimir() {
		try {
			String query = "SELECT * FROM alunos";
			System.out.println("Dados dos alunos cadastrados.\n");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/impacta", "root", "daniela1234");
			Statement stmt = cn.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				System.out.print(rs.getString("nome") + " - ");
				System.out.print(rs.getDouble("nota1") + ", ");
				System.out.print(rs.getDouble("nota2") + ", ");
				System.out.print(rs.getDouble("nota3") + " - ");
				System.out.println(
						"Média: " + (rs.getDouble("nota1") + rs.getDouble("nota2") + rs.getDouble("nota3")) / 3);
			}
		} catch (SQLException e) {
			System.out.println("Falha ao realizar a operação." + e.getMessage());
			e.printStackTrace();
		}
	}
}