package Cap11;

public class CadastroNotas {

	public static void main(String[] args) throws NotaInvalidaExeption, notaInvalidaExecepition  {
		
		try {
			Nota nota = new Nota ( "maria", 13 );
		
			
		}catch (NotaInvalidaExeption e) {
			System.err.println(" Nota Inv�lida = " + e.getMessage());
		e.printStackTrace();
		}

	}

}
