package Cap14;

public class Executando3 {

	public static void main(String[] args) {
		ExemploFuncional3 funcao = d -> Math.sqrt(d);
		ExemploFuncional3 funcao1 = d -> (d/d);
		double result = funcao.execute(144);
		System.out.println("resultado: " + result);
		System.out.println("resultado: " + funcao1.execute(6));
	}

}
