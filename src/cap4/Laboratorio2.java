package cap4;

import javax.swing.JOptionPane;

public class Laboratorio2 {

	public static void main(String[] args) {
		
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do mês"));
    	switch (mes) 
        {
            case 1:  case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("O mês escolhido tem 31 dias!");
                break;
            case 2: 
                System.out.println("O mês escolhido tem 28 dias!");
                break;
            case 4:case 6:case 9:case 11:
                System.out.println("O mês escolhido tem 30 dias!");
                break;
           
            default:
                System.out.println("Mês inexistente");
			

	}
	}
}
