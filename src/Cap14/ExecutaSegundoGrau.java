package Cap14;
import javax.swing.JOptionPane;
public class ExecutaSegundoGrau
{
	public static void main(String[] args) {
		// x²- 6x + 5 = 0 2x² -9x + 7
		double a1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a"));
		double b1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b"));
		double c1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de c"));
		EquacaoSegundoGrau delta = (a , b , c) -> (Math.sqrt(b1*b1-4*a1*c1));
		System.out.println("X1 = " + delta.execute(a1 , b1 , c1));
		System.out.println("X1 = " + ((-b1 + delta.execute(a1 , b1 , c1))/(2*a1)));
		System.out.println("X2 = " + ((-b1 - delta.execute(a1 , b1 , c1))/(2*a1)));
	}
}