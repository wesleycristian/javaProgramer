package cap7;

public class Cap7_Lab1 {

	public static void main(String[] args) {
		
		Cadastro c1 = new Cadastro();
		c1.setNome("Juca");
		Cadastro c2 = new Cadastro("Claudio", "Abreu");
		c2.setIdade(25);
		Cadastro c3 = new Cadastro("Lourdes", "Souza", 40);		
		c1.mostrar();
		c2.mostrar();
		c3.mostrar();
	}
}
