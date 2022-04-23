package Cap18;

import java.awt.Dimension;

import javax.swing.JFrame;

public class HelloFrame extends JFrame{

	public static void main(String[] args) {
		
		JFrame frame = new JFrame ("Hello Jar");
		frame.setSize ( new Dimension (400,200));
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
        frame.setVisible(true);
	}

}
