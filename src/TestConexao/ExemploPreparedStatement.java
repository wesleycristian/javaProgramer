package TestConexao;

import java.sql.*;

import javax.swing.JOptionPane;

public class ExemploPreparedStatement {

	public static void main(String[] args) {

		  try {
	            Connection cn = DriverManager.getConnection(
	            		"jdbc:mysql://localhost:3306/impacta", 
	            		"Marcos", "1234.5678");
	            Statement st = cn.createStatement();
	            PreparedStatement ps = cn.prepareStatement(
	            		"INSERT INTO funcionarios VALUES (?, ?, ?, ?)");
	            int id = 1;
	            String nome = JOptionPane.showInputDialog("Digite o Nome:");
	            double salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o Salário:"));
	            String cidade = JOptionPane.showInputDialog("Digite a Cidade:");
	            ResultSet rs = st.executeQuery("SELECT IDfuncionarios FROM funcionarios");
	           while (rs.next()) 
	            {
	        	   id = rs.getInt("IDfuncionarios");
	            }
	            ps.setInt(1, (id+1));
	            ps.setString(2, nome);
	            ps.setDouble(3, salario);
	            ps.setString(4, cidade);            
	            ps.executeUpdate();
	            System.out.println("Funcionário cadastrado com sucesso.");
	            ps.close();
	            cn.close();
	            System.out.println("Conexão encerrada.");            
	        } catch (SQLException e) 
	        {
	            System.out.println("Falha ao realizar a operação." + e.getMessage() );
	            e.printStackTrace();
	        }
	    }
	}