package Cap10;

public class Executando {

	public static void main(String[] args) 
	{
		Eletrodomestico a, b, c, d, e ,f, g;
		
	a= new Geladeira();
	b= new Televisao();
	c= new Televisao();
	d= new Geladeira();
	e= new Microondas();
	f= new Televisao();
	g= new Microondas();
	
	Eletrodomestico tv = new Televisao();
	
	tv = new Televisao();
	tv.ligar();
	tv.acionartimer(1);
	Eletrodomestico.ligartudo(a,b,c,d,e,f,g);
	Eletrodomestico.desligartudo(a,b,c,d,e,f,g);
	}

}

