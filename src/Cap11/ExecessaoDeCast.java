package Cap11;

public class ExecessaoDeCast {

	public static void main(String[] args) {
		try {
			Conta c = new ContaPoupanca(); //Cast up 
			//ContaCorrente cc = (ContaCorrente)cc; //Cast Down
			//cc.debitarTarifa(35.5);
			
		} catch (Exception e) {
			System.out.println("Conta de tipo Incompativel");
			e.printStackTrace();
			
		}
	}

}
