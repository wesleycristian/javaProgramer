package Cap9;

public class CriandoObjetos {

	public static void main(String[] args) {
		
	    Professor Daniela = new Professor();
		Professor isac = new Professor  ("Isac", 30, 'M', 
				24254677, " 11/03/98", 180000, 
				" Programação");

		Professor Wesley = new Professor ( " Wesley", 45 ,"Programador");
		System.out.println(isac.getIdade() + " " + isac.getSexo() );
		isac.setIdade(35);
		isac.setSexo('H');
		System.out.println(isac.getIdade() + " " + isac.getSexo() );
		System.out.println(Wesley.getSexo() );
		Wesley.setSexo('m');
		System.out.println(Wesley.getSexo() );
	}

	
}
