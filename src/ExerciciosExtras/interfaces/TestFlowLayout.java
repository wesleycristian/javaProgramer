package ExerciciosExtras.interfaces;

import java.awt.*;
import javax.swing.*;
public class TestFlowLayout extends JFrame{

	public TestFlowLayout(){
		//Titulo da janela
		setTitle("Teste FlowLayout");
		//Define um tamanho inicial para a janela
		setSize(300,200);
		//cor de fundo da janela no padrão RGB (Red Green Blue)
		getContentPane().setBackground(new Color(11,11,240));
		//provoca o termino da execução (encerra o programa)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		//Cria um flowlayout alinhando seus componentes ah esquerda
		//e definindo o espaçamento horizontal e vertical entre eles
		FlowLayout fl = new FlowLayout(FlowLayout.LEFT, 40, 20);

		getContentPane().setLayout(fl);

		JButton b1 = new JButton("Botao 1");
		JButton b2 = new JButton("Botao 2");
		JButton b3 = new JButton("Botao 3");
		JButton b4 = new JButton("Botao 4");
		JButton b5 = new JButton("Botao 5");

		getContentPane().add(b1);
		getContentPane().add(b2);
		getContentPane().add(b3);
		getContentPane().add(b4);
		getContentPane().add(b5);

	}

	public static void main(String [] args){
		
		TestFlowLayout janela = new TestFlowLayout();
		janela.setVisible(true);
	}
}