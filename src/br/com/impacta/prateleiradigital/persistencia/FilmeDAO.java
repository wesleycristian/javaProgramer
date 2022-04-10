	package br.com.impacta.prateleiradigital.persistencia;

	import java.util.ArrayList;
	import java.util.List;

	import br.com.impacta.prateleiradigital.negocio.Filme;

	/**
	 * Representa a classe que realiza o procedimento de mapeamento objeto-relacional da classe Filme 
	 */
	public class FilmeDAO {

		/**
		 * Adiciona um novo filme no repositório de dados
		 * 
		 * @param filme Encapsula os dados do filme que será adicionado ao repositório de dados
		 * 
		 * @throws Exception Se alguma falha de acesso ao banco de dados ocorrer
		 */
		public void adicionar(Filme filme) throws Exception {
			//TODO Código para inserir um novo filme na base de dados 
		}

		/**
		 * Realiza uma consulta no repositório de dados baseado no objeto filtro informado no parâmetro
		 * 
		 * @param tituloParcial Parte do titulo do filme. Sendo o padrão informado fazendo parte de qualquer parte do texto do titulo original 
		 * @param genero Um dos generos em que o filme se enquadra
		 * @param anoInicial Ano representando o limite inferior (inclusive) do ano de lançamento do filme. Valor maior que zero 
		 * @param anoFinal Ano representando o limite superior (inclusive) do ano de lançamento do filme. Valor maior que o anoInicial
		 * 
		 * @return Filme que atende critérios 
		 * 
		 * @throws Caso alguma falha no acesso aos dados ocorrer
		 */
		public List<Filme> consultar(String tituloParcial, String genero, int anoInicial, int anoFinal) throws Exception {
			// TODO Inserir Código para consultar o filme baseado no filtro informado
			return listaFilmeFake(4);
		}
		
		/**
		 * Executa a ação de remover o filme do repositório de dados.
		 * 
		 * @param filme Filme instância do filme que deve ser removido do repositório
		 * 
		 * @throws Caso alguma falha no acesso aos dados ocorra
		 */
		public void remover(Filme filme) throws Exception{
			// TODO Código para remoção do filme informado como parâmetro
		}
		
		/**
		 * 
		 * @param genero Gênero desejado 
		 * @param diretor Diretor ou um dos diretores do filme 
		 * @param notaMinima Nota mínima para ser considerada na busca
		 * @param numeroVotosMinimo Número minimo de votos desejado 

		 * @return Filme que atende aos critérios informados
		 * 
		 * @throws Exception se alguma falha no acesso aos dados ocorrer
		 */
		public List<Filme> consultar(String genero, String diretor, double notaMinima, int numeroVotosMinimo) throws Exception{
			// TODO Gerar a busca baseada nas informações do parâmetro
			return listaFilmeFake(3);
		}
		
		
		//TODO remover este metodo após implementação do acesso a dados
		private List<Filme> listaFilmeFake(int size) {
			
			List<Filme> filmes = new ArrayList<>();
			
			for(int i=0; i<size; i++) {
				Filme f = new Filme("Filme-"+i,"diretor-"+i,10,100,2017,"genero-"+i,100_000,"http://impacta.com.br");
				filmes.add(f);
			}
			
			return filmes;
		}



	}

