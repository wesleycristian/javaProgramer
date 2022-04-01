package Cap14;

public class ExecutandoLambda {

	public static void main(String[] args) {
		   /* Implementa a operacao a ser realizada atraves de uma expressao lambda */
	      OperacaoAritmetica operacao = (x, y) -> x + y;
	      OperacaoAritmetica operacao2 = (x, y) -> x - y;
	      OperacaoAritmetica operacao3 = (x, y) -> x * y;
	      OperacaoAritmetica operacao4 = (x, y) -> x / y;
	   /* Executa a operacao sobre dois valores double e obtem o resultado */
	      double result = operacao.execute(15.8, 8.3);
	        /* Exibe o resultado */
	        System.out.println(result);
	        System.out.println(operacao2.execute(5,7));
	        System.out.println(operacao3.execute(5,7));
	        System.out.println(operacao4.execute(5,7));
	    }
	  }