package TestConexao;
import java.sql.*;

import Cap18.Funcionario;

public class ExemploResultSet {

	public static void main(String[] args) {
	

		  try 
	        {
	            Connection cn = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/impacta", "Marcos", "1234.5678");
	            Statement st = cn.createStatement();
	            ResultSet rs = st.executeQuery("SELECT IDfuncionarios, "
	            		+ "funcionariosNome, funcionariosSalario, funcionariosCidade"
	            		+ " FROM funcionarios");
	            System.out.println("Dados dos Funcionários");
	            while (rs.next()) 
	            {
	            	Funcionario novo = new Funcionario();
	            	novo.setId(rs.getInt("IDfuncionarios"));
	            	novo.setNome(rs.getString("funcionariosNome"));
	                novo.setSalario(rs.getDouble("funcionariosSalario"));
	                novo.setCidade(rs.getString("funcionariosCidade"));                
	                System.out.println(novo);
	            }            
	            rs.close();
	            st.close();
	            cn.close();
	        } 
	        catch (SQLException e) 
	        {
	            System.out.println("Falha ao realizar a operação.");
	            e.printStackTrace();
	        }
	    }
	}