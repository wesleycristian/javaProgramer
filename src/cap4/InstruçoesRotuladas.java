package cap4;

public class InstruçoesRotuladas {

	public static void main(String[] args) {
		instrucao1:
			for ( int i = 1; i < 4; i++) 
			{
				instrucao2:
			for( int j= 1; j < 4; j++) 
			{
				if (j==2)
				{
					System.out.println("saindo da instrução 2");
					break;
					
				}
				System.out.println("instrução 2");
				break;
			}
				System.out.println("instrução 1");
			}

	}

}
