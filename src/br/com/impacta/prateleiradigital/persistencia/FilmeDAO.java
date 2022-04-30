package br.com.impacta.prateleiradigital.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.impacta.prateleiradigital.negocio.Filme;

/**
 * Representa a classe que realiza o procedimento de mapeamento
 * objeto-relacional da classe Filme
 */
public class FilmeDAO {

	/**
	 * Adiciona um novo filme no repositório de dados
	 * 
	 * @param filme
	 *            Encapsula os dados do filme que será adicionado ao repositório de
	 *            dados
	 * 
	 * @throws Exception
	 *             Se alguma falha de acesso ao banco de dados ocorrer
	 */
	public void adicionar(Filme filme) throws Exception {

		String insertCmd = "INSERT INTO tb_filmes(titulo, diretores, nota, duracao, ano, generos, numVotos, url) VALUES (?,?,?,?,?,?,?,?)";
		Connection con = null;
		
		try {
			
			con = this.getConnection();

			PreparedStatement ps1 = con.prepareStatement(insertCmd);

			ps1.setString(1, filme.getTitulo());
			ps1.setString(2,filme.getDiretores());
			ps1.setDouble(3, filme.getNota());
			ps1.setInt(4, filme.getDuracao());
			ps1.setInt(5, filme.getAno());
			ps1.setString(6, filme.getGeneros());
			ps1.setInt(7, filme.getNumVotos());
			ps1.setString(8, filme.getUrl());

			ps1.execute();

		} catch (SQLException e) {
			throw new Exception(e); // encapsula excecao original
		} finally {
			this.closeConnection(con);	
		}

	}

	/**
	 * Realiza uma consulta no repositório de dados baseado no objeto filtro
	 * informado no parâmetro
	 * 
	 * @param tituloParcial
	 *            Parte do titulo do filme. Sendo o padrão informado fazendo parte
	 *            de qualquer parte do texto do titulo original
	 * @param genero
	 *            Um dos generos em que o filme se enquadra
	 * @param anoInicial
	 *            Ano representando o limite inferior (inclusive) do ano de
	 *            lançamento do filme. Valor maior que zero
	 * @param anoFinal
	 *            Ano representando o limite superior (inclusive) do ano de
	 *            lançamento do filme. Valor maior que o anoInicial
	 * 
	 * @return Filme que atende critérios
	 * 
	 * @throws Caso
	 *             alguma falha no acesso aos dados ocorrer
	 */
	public ArrayList<Filme> consultar(String tituloParcial, String genero, int anoInicial, int anoFinal) throws Exception {
		
		String queryCmd = "select * from tb_filmes where titulo like ? and generos like ? and ano > ? and ano < ?";
		
		ArrayList<Filme> filmes = new ArrayList<Filme>();
		
		Connection con = null;
		
		try {
			con = this.getConnection();

			PreparedStatement ps1 = con.prepareStatement(queryCmd);
			ps1.setString(1, (tituloParcial != null ? '%'+tituloParcial.trim()+'%' : ""));
			ps1.setString(2, (genero != null ? '%'+genero.trim()+'%' : ""));
			ps1.setInt(3, anoInicial);
			ps1.setInt(4, anoFinal);
			
			ResultSet view = ps1.executeQuery();
			
			while(view.next()) {
				
				String titulo = view.getString("titulo");
				String diretores = view.getString("diretores");
				double nota = view.getDouble("nota");
				int duracao = view.getInt("duracao");
				int ano = view.getInt("ano");
				String generos = view.getString("generos");
				int numVotos = view.getInt("numVotos");
				String url = view.getString("url");
				
				Filme filme = new Filme(titulo,diretores,nota,duracao,ano,generos,numVotos,url);
				filmes.add(filme);
				
			}


		} catch (SQLException e) {
			throw new Exception(e); // encapsula excecao original
		} finally {
			this.closeConnection(con);	
		}

		
		return filmes;
		
	}


	/**
	 * Executa a ação de remover o filme do repositório de dados.
	 * 
	 * @param filme
	 *            Filme instância do filme que deve ser removido do repositório
	 * 
	 * @throws Caso
	 *             alguma falha no acesso aos dados ocorra
	 */
	public void remover(Filme filme) throws Exception {
		
		String deleteCmd = "DELETE FROM tb_filmes WHERE titulo = ? and ano = ? and duracao = ?";
		Connection con = null;
		
		try {
			con = this.getConnection();

			PreparedStatement ps1 = con.prepareStatement(deleteCmd);

			ps1.setString(1, filme.getTitulo());
			ps1.setInt(2, filme.getAno());
			ps1.setInt(3, filme.getDuracao());

			ps1.execute();

		} catch (SQLException e) {
			throw new Exception(e); // encapsula excecao original
		} finally {
			this.closeConnection(con);	
		}

		
	}
	public Filme consultar(String titulo, int anoInicial, int anoFinal) throws Exception {

        String queryCmd = "select * from tb_filmes where titulo like ?";

        Filme filme = new Filme();

        Connection con = null;

        try {
            con = this.getConnection();

            PreparedStatement ps1 = con.prepareStatement(queryCmd);
            ps1.setString(1, (titulo != null ? '%'+titulo.trim()+'%' : ""));
            ResultSet view = ps1.executeQuery();

            while(view.next()) {

                String titulo1 = view.getString("titulo");
                String diretores = view.getString("diretores");
                double nota = view.getDouble("nota");
                int duracao = view.getInt("duracao");
                int ano = view.getInt("ano");
                String generos = view.getString("generos");
                int numVotos = view.getInt("numVotos");
                String url = view.getString("url");

                filme = new Filme(titulo,diretores,nota,duracao,ano,generos,numVotos,url);

            }


        } catch (SQLException e) {
            throw new Exception(e); // encapsula excecao original
        } finally {
            this.closeConnection(con);
        }


        return filme;

    }
	
	
	/**
	 * 
	 * @param genero
	 *            Gênero desejado
	 * @param diretor
	 *            Diretor ou um dos diretores do filme
	 * @param notaMinima
	 *            Nota mínima para ser considerada na busca
	 * @param numeroVotosMinimo
	 *            Número minimo de votos desejado
	 * 
	 * @return Filme que atende aos critérios informados
	 * 
	 * @throws Exception
	 *             se alguma falha no acesso aos dados ocorrer
	 */
	public List<Filme> consultar(String genero, String diretor, double notaMinima, int numeroVotosMinimo)
			throws Exception {
		
		String queryCmd = "select * from tb_filmes where generos like ? and diretores like ? and nota > ? and numVotos > ?";
		
		List<Filme> filmes = new ArrayList<Filme>();
		
		Connection con = null;
		
		try {
			con = this.getConnection();

			PreparedStatement ps1 = con.prepareStatement(queryCmd);
			ps1.setString(1, (genero != null ? '%'+genero.trim()+'%' : ""));
			ps1.setString(2, (diretor != null ? '%'+diretor.trim()+'%' : ""));
			ps1.setDouble(3, notaMinima);
			ps1.setInt(4, numeroVotosMinimo);
			
			ResultSet view = ps1.executeQuery();
			
			while(view.next()) {
				
				String titulo = view.getString("titulo");
				String diretores = view.getString("diretores");
				double nota = view.getDouble("nota");
				int duracao = view.getInt("duracao");
				int ano = view.getInt("ano");
				String generos = view.getString("generos");
				int numVotos = view.getInt("numVotos");
				String url = view.getString("url");
				
				Filme filme = new Filme(titulo,diretores,nota,duracao,ano,generos,numVotos,url);
				filmes.add(filme);
				
			}


		} catch (SQLException e) {
			throw new Exception(e); // encapsula excecao original
		} finally {
			this.closeConnection(con);	
		}

		
		return filmes;
		
	}

	
	private void closeConnection(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/impacta"; 
		String usuario = "root";
		String senha = "daniela1234";

		Connection con = DriverManager.getConnection(url,usuario,senha);
		
		return con;
	}

	public void importar(List<Filme> filmes) throws Exception {
		
		String insertCmd = "INSERT INTO tb_filmes(titulo, diretores, nota, duracao, ano, generos, numVotos, url) VALUES (?,?,?,?,?,?,?,?)";
		Connection con = null;
		
		try {
			con = this.getConnection();

			PreparedStatement ps1 = con.prepareStatement(insertCmd);

			for(Filme filme : filmes) {
				ps1.setString(1, filme.getTitulo());
				ps1.setString(2,filme.getDiretores());
				ps1.setDouble(3, filme.getNota());
				ps1.setInt(4, filme.getDuracao());
				ps1.setInt(5, filme.getAno());
				ps1.setString(6, filme.getGeneros());
				ps1.setInt(7, filme.getNumVotos());
				ps1.setString(8, filme.getUrl());
	
				ps1.execute();				
			}

		} catch (SQLException e) {
			System.out.println("ERRO ao importar o FILME.");
			throw new Exception(e); // encapsula excecao original
		} finally {
			this.closeConnection(con);	
		}

	}

	public void alterarFilme(Filme filme2) 
	{
		Connection con = null;//		
		try 
		{							;
			con = this.getConnection();
			PreparedStatement pstm = con.prepareStatement(
					"UPDATE tb_filmes SET diretores=?, nota=?, "
					+ "duracao=?, ano=?, generos=?, "
					+ "numVotos=?, url=? WHERE titulo=?"); 	

				pstm.setString(1, filme2.getDiretores());
				pstm.setDouble(2, filme2.getNota());				
				pstm.setInt(3, filme2.getDuracao());										
				pstm.setInt(4, filme2.getAno());				
				pstm.setString(5, filme2.getGeneros());
				pstm.setInt(6, filme2.getNumVotos());
				pstm.setString(7, filme2.getUrl());
				pstm.setString(8, filme2.getTitulo());
				pstm.execute();				
		} catch (SQLException e) 
		{
			System.out.println("ERRO ao ATUALIZAR o Filme.\n" 
		+ e.getMessage());
		}
		finally 
		{
			this.closeConnection(con);	
		}
	}
}