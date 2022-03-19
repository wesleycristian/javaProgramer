package TreinamentoSolo;

import javax.swing.JOptionPane;

public class TestandoIfElse {

	public static void main(String[] args) {
		
 
		int valorCelular = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a vista:"));
		String formaPagamento = (JOptionPane.showInputDialog("forma de pagamento:"));
			
		 if (formaPagamento.equals("cartao a vista") ) 
	        {
	            System.out.println("valor sem juros");
	        } 
	        else if (formaPagamento.equals("cartao parcelado") ) 
	        {
	            System.out.println("tera juros de 9 % ");
	        } 
	        else if (formaPagamento.equals("Boleto"))
	        {
	            System.out.println("tera desconto de 5%");
	            
	     }
	        else {
	        	System.out.println("Algo deu errado");
	        }
	}

}
