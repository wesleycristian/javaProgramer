package cap5;

public class Exemplo2Atribuicao {

	public static void main(String[] args) {
		
		Pessoa joao = new Pessoa();
		Pessoa maria = new Pessoa();
		
		joao.sexo = 'M';
		joao.idade = 45;
		
		maria.sexo = 'F';
		maria.idade = 45;
		
		joao = maria;
		
		System.out.println(" joao sexo = " + joao.sexo);
		System.out.println(" joao idade = " +  joao.idade);
		
		joao.idade = 50;
		System.out.println(" Maria idade = " +  maria.idade);
		
		joao.sexo = 'M';
		System.out.println(" joao idade = " +  maria.sexo);
		

	}

}
