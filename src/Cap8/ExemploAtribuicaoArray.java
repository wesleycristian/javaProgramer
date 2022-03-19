package Cap8;

public class ExemploAtribuicaoArray {

	public static void main(String[] args) {
		int arrayNumero[];

		arrayNumero = new int[10];
		for (int i = 0; i < arrayNumero.length; i++) {
			arrayNumero[i] = i;
			System.out.print(arrayNumero[i] + " ");
		}

	}

}
