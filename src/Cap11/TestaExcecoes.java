package Cap11;

public class TestaExcecoes {
	
	public static void main(String[] args) 
	{
		int i;
		
		try
		{
			i=2;
			System.out.println(i);
		}
		catch (Exception e) 
		{
			System.out.print("Ocorreu um erro inesperado!");
		}
		try
		{
			i=1/0;
			System.out.println(i);
		}
		catch (ArithmeticException e) 
		{
			System.out.print("Ocorreu um ao tentar dividir um número por zero!\nMensagem do erro " 
		+ e.getMessage());
		
		
		}
	}
}
	
	

