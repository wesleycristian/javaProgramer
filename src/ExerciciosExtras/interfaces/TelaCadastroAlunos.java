package ExerciciosExtras.interfaces;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TelaCadastroAlunos extends TesteJFrame{
		public TelaCadastroAlunos(){//construtor da classe TesteJFrame
			setTitle("Cadastro de Aluno");//Titulo da janela
			setSize(375,200);//tamanho da janela
			getContentPane().setLayout(null);// anula o layout padrao
			getContentPane().setBackground(new Color(39,118,57));//cor de fundo no padrão RGB (Red Green Blue)
			setVisible(true);
			JLabel rotuloID = criarRotulo("Código");
			JTextField txtID = criarCaixaTexto();
			JLabel rotuloNome = criarRotulo("Nome");
			JTextField txtNome = criarCaixaTexto();		
			JButton botaoGravar = criarBotao("Gravar", 'G');
			JButton botaoSair = criarBotao("Sair", 'S');
			
			rotuloID.setBounds(50, 30, 80, 30);//50 posição x, 30 posição y, 100 largura, 30 altura
			txtID.setBounds(120, 30, 80, 30);
			rotuloNome.setBounds(230, 30, 60, 30);
			txtNome.setBounds(290, 30, 300, 30);
			
			botaoGravar.setBounds(50, 130, 100, 30);
			botaoSair.setBounds(160, 130, 100, 30);
			
			add(rotuloID);
			add(txtID);
			add(rotuloNome);
			add(txtNome);
			add(botaoGravar);
			add(botaoSair);		
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//provoca o termino da execução (encerra o programa)
		}
		private JButton criarBotao(String texto, char m) {		
			JButton b1 = new JButton();
			b1.setText(texto);
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
		private JTextField criarCaixaTexto() {
			JTextField jt = new JTextField();
			jt.setHorizontalAlignment(JTextField.CENTER);
			return jt;
		}
		public JLabel criarRotulo(String texto){
			JLabel jl = new JLabel();//Cria um rótulo
			jl.setText(texto);
			jl.setFont(new Font("Courier new", Font.BOLD, 18)); //tipo de fonte, estilo, tamanho
			return jl;
		}

		public static void main(String [] args)
		{
		 new TelaCadastroAlunos();
	  }
	}

