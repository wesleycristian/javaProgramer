package Cap19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.Statement;

public class ImprimiAluno {

	Connection cn = null;
	java.sql.Statement st = null;
	ResultSet rs=null;
	PreparedStatement ps=null;
	public static void main(String[] args) 
	{        
		ImprimiAluno im = new ImprimiAluno();
		im.imprimirAlunos();		
		
	}
	public void imprimirAlunos(){		
		try{
			Connection cn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/impacta", 
					"Marcos", "1234.5678");
			st = cn.createStatement();
			String consulta = "SELECT * FROM Alunos";
			System.out.println("Mostrando dados dos Alunos.\n");
			Aluno novo;
			ArrayList<Aluno> alunos = new ArrayList<>();
			rs = st.executeQuery(consulta);
			while(rs.next())
			{
				novo = new Aluno(rs.getInt("codigo"), rs.getString("nome"),
						rs.getString("telefone"),rs.getFloat("nota1"), 
						rs.getFloat("nota2"), rs.getFloat("nota3"),	rs.getFloat("media"));
				alunos.add(novo);
			}
			alunos.stream()
			.filter((aluno)-> aluno.getMedia()!=0)
			.sorted((f1, f2) -> f1.getNome().compareTo(f2.getNome()))
			.forEach(System.out::println);
		}
		catch (SQLException e) 
		{
			System.out.println("Falha ao realizar a operação." + e.getMessage() );
			e.printStackTrace();
		}
	}
}
	
	

