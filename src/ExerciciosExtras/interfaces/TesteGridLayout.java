package ExerciciosExtras.interfaces;

import java.awt.*;
import javax.swing.*;
public class TesteGridLayout extends JFrame{
	
	public TesteGridLayout(){
		//Titulo da janela
		setTitle("Teste GridLayout");
		//Define um tamanho inicial para a janela
		setSize(300,150);
		//cor de fundo da janela no padrão RGB (Red Green Blue)
		getContentPane().setBackground(new Color(12,11,240));
		//provoca o termino da execução (encerra o programa)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		GridLayout gl = new GridLayout(3,2,2,2);// criando um layout com 3 linhas e duas colunas sem espaço entre as linhas e colunas.
		
		getContentPane().setLayout(gl);// aplicando o layout na tela
		
		JButton b1 = new JButton("nome");
		JButton b2 = new JButton("Linha 1 - Coluna 2");
		JButton b3 = new JButton("Linha 2 - Coluna 1");
		JButton b4 = new JButton("Linha 2 - Coluna 2");
		JButton b5 = new JButton("Linha 3 - Coluna 1");
		JButton b6 = new JButton("Linha 3 - Coluna 2");
		
		// add os botões na tela
		getContentPane().add(b1);
		getContentPane().add(b2);
		getContentPane().add(b3);
		getContentPane().add(b4);
		getContentPane().add(b5);
		getContentPane().add(b6);
		setVisible(true);
	}
	
	public static void main(String [] args){
		new TesteGridLayout();
  }
}