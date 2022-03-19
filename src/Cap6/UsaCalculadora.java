package Cap6;

public class UsaCalculadora {

	public static void main(String[] args) {
		int s; 
		Calculadora calc = new Calculadora();
		s=calc.somar(15, 20);
		System.out.println("s = " + s);

		s=calc.subtrair(20, 30);
		System.out.println( "s = " + s);
		
		s=calc.dividir(45, 30);
		System.out.println( "s = " + s);
		
		s=calc.multiplicar(20, 30);
		System.out.println( "s = " + s);
		
	}

	
}
