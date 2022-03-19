package Cap9;

public class Quadrado  extends Poligono
{

	public double lado;

	@Override
	public double calcularArea() 
	{
	
		
		return lado*lado;
	}

	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}
	
}
