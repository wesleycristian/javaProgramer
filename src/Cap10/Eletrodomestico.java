package Cap10;

public interface Eletrodomestico {
	public void ligar();

	public void desligar();

	default void acionartimer (int minutos) {
		try { Thread.sleep(minutos * 60000 );} catch ( Exception e) {}
	
		
	desligar();
	}
	
	static void ligartudo(Eletrodomestico... eletroArray) {
		for (Eletrodomestico eletro : eletroArray) {
			eletro.ligar();
		}

	}

	static void desligartudo(Eletrodomestico... eletroArray) {
		{
			for (Eletrodomestico eletro : eletroArray) {
				eletro.desligar();

			}
		}

	}
}
