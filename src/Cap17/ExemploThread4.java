package Cap17;



public class ExemploThread4 {
	public static void main(String args[]) throws InterruptedException {
		
		Thread segmento = Thread.currentThread();
		System.out.println("[Nome, prioridade e grupo)(padroes):" + segmento);
		segmento.setName(" teste");
		segmento.setPriority(7);
		System.out.println("[mudou nome, mudou prioridade, mesmo grupo]:" + segmento);
		
		try {
			for(int x = 1; x <10; x++) {
				System.out.println(x);
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {
		
		}
		}
		
		
	}

