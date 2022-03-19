package cap4;

public class InstruçãoRotuladas {

	public static void main(String[] args) {
		instrução1:
			for(int i= 1; i< 4; i++) {
				instrução2:
					for ( int j = 1; j < 4; i++){
				if( j==2) {
					System.out.println(" saindo da instrução 1 ");
					break instrução1;
				}
				System.out.println(" instrução 2 ");
			}
			System.out.println(" instrução 1");	
			}
	}

}
