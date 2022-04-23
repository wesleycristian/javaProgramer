package ExerciciosExtras.interfaces;

import java.awt.*;
import javax.swing.*;
public class TesteJPanel extends JFrame{
	JButton b1, b2;
	JPanel p1, p2;
	public TesteJPanel(){
		setTitle("Teste JPanel");
		setSize(340,220);
		// anula o layout padrao
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(255,255,255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		p1 = new JPanel();
		p1.setLayout(null);
		p1.setBounds(10, 10, 300, 70);
		p1.setBackground(Color.BLUE);
		
		p2 = new JPanel();
		p2.setLayout(null);
		p2.setBounds(10,90,300,70);
		p2.setBackground(Color.YELLOW);
		
		b1 = new JButton("Gravar");
		b1.setBounds(100, 30, 100, 30);
		b2 = new JButton("Sair");
		b2.setBounds(100, 30, 100, 30);
		
		p1.add(b1);
		p2.add(b2);
		getContentPane().add(p1);
		getContentPane().add(p2);
		setVisible(true);
	}
	
	public static void main(String [] args){
		new TesteJPanel();
  }
}
