package ExerciciosExtras.interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TesteBorderLayout extends JFrame {

	public TesteBorderLayout() {
		// Titulo da janela
		setTitle("Teste BorderLayout");
		// Define um tamanho inicial para a janela
		setSize(350, 150);
		// cor de fundo da janela no padrão RGB (Red Green Blue)
		getContentPane().setBackground(new Color(255, 255, 255));
		// provoca o termino da execução (encerra o programa)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		// Cria um borderlayout definindo o espaçamento horizontal e
		// vertical entre cada uma das regiões
		BorderLayout bl = new BorderLayout(5, 5);

		getContentPane().setLayout(bl);

		JButton b1 = new JButton("Botao Norte");
		JButton b2 = new JButton("Botao Sul");
		JButton b3 = new JButton("Botao Leste");
		JButton b4 = new JButton("Botao Oeste");
		JButton b5 = new JButton("Botao Centro");

		getContentPane().add(b1, BorderLayout.NORTH);
		getContentPane().add(b2, BorderLayout.SOUTH);
		getContentPane().add(b3, BorderLayout.EAST);
		getContentPane().add(b4, BorderLayout.WEST);
		getContentPane().add(b5, BorderLayout.CENTER);

	}

	Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	// obtém a altura e largura da minha janela

	public static void main(String[] args) {
		TesteBorderLayout janela = new TesteBorderLayout();
		janela.setVisible(true);
	}
}