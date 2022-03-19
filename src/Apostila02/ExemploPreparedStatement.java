package Apostila02;

import java.sql.*;

public class ExemploPreparedStatement {

	public static void main(String[] args) {
		
		try {
		
		Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/impacta","root", "daniela1234" );
		
		PreparedStatement ps= cn.prepareStatement("INSERT INTO funcionarios VALUES( ?,?,?,?)");
		
		ps.setInt ( 1, 4);
		ps.setString(2,"wesley");
		ps.setString(4,"São Paulo");
		ps.setDouble(3,3550.15);
		ps.executeUpdate();
		
		System.out.println("funcionario cadastrado com sucesso.");
		
		ps.close();
		cn.isClosed();
	    System.out.println(" Conexão encerrada");
		

	}catch ( SQLException e) {
		
		System.out.println("falha ao realizar a operação");
		e.printStackTrace();
	}

}
}