package Cap11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.JdbcConnection;

public class ExemploSQL {

	public static void main(String[] args) {
		
		try {
			Connection cn;
			cn = DriverManager.getConnection("jdbc:oracle:thin:localhost:1521:orcl", "scot", "tiger");
		
		
		} catch ( SQLException e) {
			
			System.out.println( " nao foi possivel realizar a conexão.");
			e.printStackTrace();
		}

	}

}
