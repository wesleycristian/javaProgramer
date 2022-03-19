package Cap6;

public class Pessoa 
{
	//String nome;
	//int idade;
	//char sexo;
	
	//public void exibirDados() {
	//	System.out.println("Nome da pessoa:" + nome);
		//System.out.println("Idade da pessoa:" + idade);
		//System.out.println("Sexo da Pessoa:" + sexo);
		//{
			String nome;
			int idade= 50;
			char sexo;
			
						
			
			private String getNome() {
				return nome;
			}



			private void setNome(String nome) {
				this.nome = nome;
			}



			private int getIdade() {
				return idade;
			}



			private void setIdade(int idade) {
				this.idade = idade;
			}



			private char getSexo() {
				return sexo;
			}



			void setSexo(char sexo) {
				this.sexo = sexo;
			}



			public void exibirDados() {
				System.out.println("Nome da pessoa:" + nome);
				System.out.println("Idade da pessoa:" + idade);
				System.out.println("Sexo da Pessoa:" + sexo);
			

		

	}

}
