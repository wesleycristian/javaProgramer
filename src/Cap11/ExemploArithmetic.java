package Cap11;

public class ExemploArithmetic {

	public static void main(String[] args)
	{
    
		try {
			
			int valorTotal = 25;
			int quantidadePessoas = 0; // DIVIS�O 0
			int rateio = valorTotal / quantidadePessoas;
			
		}catch (ArithmeticException e) {
	     System.out.println( " Opera��o invalida");
	     e.printStackTrace();
		}
		

	}

}
