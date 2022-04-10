package Cap17;

public class ExemploThread3 {
	public static void main(String args[]) {
		testRunnable r = new testRunnable();
		Thread testar = new Thread(r);
		Thread avaliar = new Thread(r);
		Thread examinar = new Thread(r);
		testar.start();
		avaliar.start();
		examinar.start();
	}
}