package Cap14;

public class Executando {

	public static void main(String[] args) {
		OperacaoAritmetica operacao = new Soma();

		double result = operacao.execute(15.8, 8.3);

		System.out.println(result);
	}

}
