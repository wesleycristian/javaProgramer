package cap4;

public class Instru�oesRotuladas {

	public static void main(String[] args) {
		instrucao1:
			for ( int i = 1; i < 4; i++) 
			{
				instrucao2:
			for( int j= 1; j < 4; j++) 
			{
				if (j==2)
				{
					System.out.println("saindo da instru��o 2");
					break;
					
				}
				System.out.println("instru��o 2");
				break;
			}
				System.out.println("instru��o 1");
			}

	}

}
