package ExerciciosExtras.interfaces;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CadastroAlunos extends JFrame{
	public CadastroAlunos()
	
	{//construtor da classe TesteJFrame
		setTitle("Cadastro de Alunos");//Titulo da janela
		int larguraTela = 880;
		int alturaTela = 250;
		
		FlowLayout fl = new FlowLayout(FlowLayout.LEFT, 40, 20);
		setSize(larguraTela,alturaTela);//tamanho da janela
		getContentPane().setLayout(null);// anula o layout padrao
		getContentPane().setBackground(new Color(39,118,57));//cor de fundo no padrão RGB (Red Green Blue)
		
		
		JLabel rotuloID = criarRotulo("Código");
		JTextField txtID = criarCaixaTexto();
		JLabel rotuloNome = criarRotulo("Nome");
		JTextField txtNome = criarCaixaTexto();		
		JLabel rotuloTelefone = criarRotulo("Telefone");
		JTextField txtTelefone = criarCaixaTexto();
		
		JLabel rotuloNota1 = criarRotulo("1ª Nota");
		JTextField txtNota1 = criarCaixaTexto();	
		JLabel rotuloNota2 = criarRotulo("2ª Nota");
		JTextField txtNota2 = criarCaixaTexto();
		JLabel rotuloNota3 = criarRotulo("3ª Nota");
		JTextField txtNota3 = criarCaixaTexto();
		JLabel rotuloMedia = criarRotulo("Média");	
		JTextField txtMedia = criarCaixaTexto();
		txtMedia.setEditable(false);	
		
		
		
		
		JButton botaoGravar = criarBotao("Gravar", 'G');
		JButton botaoSair = criarBotao("Sair", 'S');
		int posicaoBotao = larguraTela/2-100;
	
		botaoSair.setEnabled(false);
		
		add(rotuloID);
		add(txtID);
		add(rotuloNome);
		add(txtNome);
		
		add(rotuloTelefone);
		add(txtTelefone);
		add(rotuloNota1);
		add(txtNota1);
		add(rotuloNota2);
		add(txtNota2);
		add(rotuloNota3);
		add(txtNota3);
		add(rotuloMedia);
		add(txtMedia);		
		add(botaoGravar);
		add(botaoSair);		
		setLocationRelativeTo(null);
		setVisible(true);
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
	 new CadastroAlunos();
	}
}