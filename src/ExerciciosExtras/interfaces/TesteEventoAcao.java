package ExerciciosExtras.interfaces;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class TesteEventoAcao extends JFrame implements ActionListener {
	JLabel l1;
	JButton b1, b2;
	int i1, i2;
	public TesteEventoAcao(){
		setTitle("Teste Evento Acao");
		setSize(290,150);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(255,255,255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		i1 = i2 = 0;
		b1 = new JButton("Gravar");
		b1.setBounds(10, 10, 120, 30);
		b1.addActionListener(this);//Adiciono o monitoramento do botão1
		b2 = new JButton("Sair");
		b2.setBounds(140, 10, 120, 30);
		b2.addActionListener(this);//Adiciono o monitoramento do botão2
		l1 = new JLabel("Pressione os botões");
		l1.setBounds(5, 70, 220, 20);
		getContentPane().add(b1);
		getContentPane().add(b2);
		getContentPane().add(l1);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String [] args){
		new TesteEventoAcao();	 
  }
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == b1)
			l1.setText("Botão GRAVAR pressionado " + ++i1 + " vez(es)");
		if (e.getSource() == b2)
			l1.setText("Botão SAIR pressionado " + ++i2 + " vez(es)");
	}
}