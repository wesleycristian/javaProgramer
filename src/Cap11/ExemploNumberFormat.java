package Cap11;

public class ExemploNumberFormat {

	public static void main(String[] args) {
		
		try {
			
			String texto = "23tr";
			int idade = Integer.parseInt(texto);
			
			System.out.println( " parab�ns pelos seus " + idade + " anos de idade");
			
		} catch ( NumberFormatException e ) {
			
			System.out.println( " N�mero inv�lido");
			e.printStackTrace();
		}

	}

}
