package Cap14;

public class DescontoSalarial<salarioLiquido> {
public static void main ( String [] args) {
	
	double[] salarioBruto = { 1350.0, 4320.15, 8235.25, 2500.55,1830.0,850.25,};
    double[] SalariosLiquido = DoubleArrayUtils.transformaValores 
    		(salarioBruto, d -> 0.9 * d);

    DoubleArrayUtils.processaValores (SalariosLiquido, d -> System.out.println(d));
}
}