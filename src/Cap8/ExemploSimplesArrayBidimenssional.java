package Cap8;

public class ExemploSimplesArrayBidimenssional {

	public static void main(String[] args) {

		int elementos[][] = { { 0, 1, 1 }, { 3, 5, 8, 13 }, { 21, 34 } };
		for (int i = 0; i < elementos.length; i++) {
			for (int j = 0; j < elementos[i].length; j++) {
				System.out.print(elementos[i][j] + " ");

			}
			System.out.println();
		}

	}

}
