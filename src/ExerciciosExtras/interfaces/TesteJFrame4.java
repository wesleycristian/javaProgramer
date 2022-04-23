package ExerciciosExtras.interfaces;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TesteJFrame4 extends JFrame{
	public TesteJFrame4(){//construtor da classe TesteJFrame
		setTitle("Primeira Janela Swing");//Titulo da janela
		setSize(375,200);//tamanho da janela
		getContentPane().setLayout(new FlowLayout());// anula o layout padrao
		getContentPane().setBackground(new Color(39,118,57));//cor de fundo no padrão RGB (Red Green Blue)
		setVisible(true);
		add(criarRotulo());				
		add(criarCaixaTexto());
		add(criarBotao("Gravar", 'G'));
		add(criarBotao("Sair", 'S'));
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//provoca o termino da execução (encerra o programa)
	}
	private Component criarBotao(String texto, char m) {		
		JButton b1 = new JButton();
		b1.setText(texto);
		b1.setBounds(50, 30, 100, 30);//50 posição x, 30 posição y, 100 largura, 30 altura
		b1.setBackground(new Color(0,0,170));
		b1.setForeground(Color.YELLOW);
		b1.setFont(new Font("Helvetica", Font.BOLD, 15));
		b1.setToolTipText("Botao b1");
		b1.setHorizontalAlignment(SwingConstants.CENTER);
		b1.setVerticalAlignment(SwingConstants.CENTER);
		b1.setEnabled(true);//desabilita (false) ou habilita (true) o botão
		b1.setMnemonic(m); 
		return b1;
	}
	private Component criarCaixaTexto() {
		JTextField jt = new JTextField();
		jt.setText("Insira texto aqui");
		jt.setHorizontalAlignment(JTextField.CENTER);
		return jt;
	}
	public JLabel criarRotulo(){
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
	 new TesteJFrame4();
  }
}