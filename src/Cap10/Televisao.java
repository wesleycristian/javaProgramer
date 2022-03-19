package Cap10;

public class Televisao implements Eletrodomestico 
{
	private int canal, volume;	

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void ligar() 
	{
		System.out.println("Ligando a televisão");		
	}

	public void desligar() 
	{
		System.out.println("Desligando a Geladeira");		
	}
	
	public void trocarCanal() 
	{
		System.out.println("Trocando o canal");		
	}
}