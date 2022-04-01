package Cap11;

public class ExemploNullPointer {

	public static void main(String[] args) {
		
		try {
			Cliente c = null;
			c.setNome("Manuel da silva");
			
			
		}catch (NullPointerException e) {
			
			System.out.println(" Variavel não instanciada. ");
			e.printStackTrace();
		}

	}

}
