package Cap17;

public class Segmento extends Thread{
	
	public void run() {
		
		System.out.println("Algo sendo executado em exemplo thread");
	}
	public void run(String segmento) {
		System.out.println("A String em execução é " + segmento);
}
}