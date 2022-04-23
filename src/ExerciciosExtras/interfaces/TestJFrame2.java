package ExerciciosExtras.interfaces;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TestJFrame2 {
	public class TesteJFrame2 extends JFrame{
		public TesteJFrame2(){//construtor da classe TesteJFrame
			setTitle("Primeira Janela Swing");//Titulo da janela
			setSize(375,200);//tamanho da janela
			getContentPane().setLayout(null);// anula o layout padrao
			getContentPane().setBackground(new Color(39,118,57));//cor de fundo no padrão RGB (Red Green Blue)
			setVisible(true);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//provoca o termino da execução (encerra o programa)
			add(criarJLabel());
			JTextField jt = new JTextField();
			jt.setText("Insira texto aqui");
			jt.setHorizontalAlignment(JTextField.CENTER);
			//insere o JTextField na Janela
			add(jt);
		}
		public JLabel criarJLabel(){
			JLabel jl = new JLabel();//Cria um rótulo
			jl.setText("Rótulo inserido");
			jl.setLocation(10, 10);//10 pixels do topo e da esquerda
			jl.setSize(370, 50); //largura e altura da janela
			//Torna opaco o fundo do rótulo
			jl.setOpaque(true);
			jl.setBackground(new Color(155,55,55));//cor de fundo do rótulo
			jl.setForeground(new Color(0,55,0));//cor da fonte do rótulo
			jl.setFont(new Font("Courier new", Font.BOLD, 18)); //tipo de fonte, estilo, tamanho
			jl.setToolTipText("Rótulo de Exemplo");//Texto de dica quando paramos o mouse sobre ele
			jl.setHorizontalAlignment(SwingConstants.LEFT);
			jl.setVerticalAlignment(SwingConstants.TOP);		
			return jl;
		}

		public static void main(String [] args)
		{
		 new TesteJFrame();
	  }
	}
}

