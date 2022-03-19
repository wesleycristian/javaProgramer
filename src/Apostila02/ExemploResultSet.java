package Apostila02;
import java.sql.*;

public class ExemploResultSet {

	public static void main(String[] args) {
	

		try { 
			
Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/impacta","root", "daniela1234" );
			Statement st = cn.createStatement();
			ResultSet rs= st.executeQuery("Select funcionariosNome, funcionarioSalario FROM funcionarios");
			
			while ( rs.next()) {
				
				String nome = rs.getString("funcionariosNome");
				double sal = rs.getDouble("funcionarioSalario");
				
				System.out.println( nome + " - " + sal);
			}
			
		}catch ( SQLException e) {
			System.out.println( "falha ao realizar a operação");
			e.printStackTrace();
		}
		
	}

}
