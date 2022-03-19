package Cap9;

public class Zoologico {

	public static void main(String[] args) {
		animal a = new animal();
		a.comer();
		Zebra z = new Zebra();
		z.comer();
		Leao l = new Leao();		
		a=l;
		a.comer();	

		verificarAnimal(z);		
	}	
	public static void verificarAnimal(animal a)
	{
		if(a instanceof Leao)
		{
			System.out.println("Objeto do tipo leao");
		}
		else if(a instanceof Zebra)
		{
			System.out.println("Objeto do tipo Zebra");
		}
		else if(a instanceof animal)
		{
			System.out.println("Objeto do tipo Animal");
		}
	}
}