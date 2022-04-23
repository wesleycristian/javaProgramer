package TestConexao;

import java.sql.*;


public class ExemploStatement {
	
	public static void main ( String []args) {
		
		
		try {
			
			Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/impacta","root", "daniela1234" );
			
			Statement st = cn.createStatement();
			
			st.executeUpdate(" UPDATE funcionarios SET funcionariosalario = funcionariosalario + 200");
			System.out.println( "salario aumentado com sucesso");
			
			st.close();
			cn.isClosed();
			System.out.println( "conexão encerrada");
			
		}catch ( SQLException e) {
		System.out.println( "falha ao realizar a operação");
		e.printStackTrace();
	
	}

	}
}