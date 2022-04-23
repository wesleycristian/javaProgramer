package ExerciciosExtras.interfaces;

import java.awt.*;
import javax.swing.*;

public class TesteJFrame extends JFrame{
	public TesteJFrame(){//construtor da classe TesteJFrame
		
		setTitle("Primeira Janela Swing");//Titulo da janela
		setSize(375,200);//tamanho da janela
		getContentPane().setLayout(null);// anula o layout padrao
		getContentPane().setBackground(new Color(39,118,57));//cor de fundo no padrão RGB (Red Green Blue)
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//provoca o termino da execução (encerra o programa)
	}
	public static void main(String [] args)
	{
	 new TesteJFrame();
  }
	
}