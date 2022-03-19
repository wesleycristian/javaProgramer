package cap4;

public class ExemploBreak {

	public static void main(String[] args) 
	{
		for(int i = 1; i < 11; ++i){
			if (i==5)
			break; 
					System.out.println("valor de i =" + i);
			
			System.out.println(" proxima linha após o loop...");
		}

	}

}
