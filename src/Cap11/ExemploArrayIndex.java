package Cap11;

public class ExemploArrayIndex {

	public static void main(String[] args) {
		
		try { 
			double[] salario = {1200.5, 630.0, 950.15};
			double s = salario[3];// índice invalido começa 0,1,2
			
			System.out.println(" salario atual " + s ) ;
				
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("numero invalido");
			e.printStackTrace();
		}

	}

}
