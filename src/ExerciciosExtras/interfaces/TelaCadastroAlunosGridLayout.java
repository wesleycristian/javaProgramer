package ExerciciosExtras.interfaces;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.*;


public class TelaCadastroAlunosGridLayout extends JFrame {
	JButton botaoGravar;
	JButton botaoSair; 
	JTextField txtID, txtNota1, txtNota2, txtNota3 , txtMedia,
	txtNome, txtTelefone;
	public TelaCadastroAlunosGridLayout()
	{//construtor da classe TesteJFrame
		setTitle("Cadastro de Alunos");//Titulo da janela
		JLabel botao= new JLabel("Pressione os botões");
		int larguraTela = 380;
		int alturaTela = 280;

		setSize(larguraTela,alturaTela);//tamanho da janela
		getContentPane().setBackground(new Color(39,118,57));//cor de fundo no padrão RGB (Red Green Blue)

		//Definindo o layout e adicionando na janela
		GridLayout fl = new GridLayout(12,2,2,2);//Qtd de linhas, colunas, espaço entre linhas e colunas
		getContentPane().setLayout(fl);
		
		JLabel rotuloID = criarRotulo("Código");
		rotuloID.setFont(getFont());
		txtID = criarCaixaTexto();
		JLabel rotuloNome = criarRotulo("Nome");
		txtNome = criarCaixaTexto();
		JLabel rotuloTelefone = criarRotulo("Telefone");
		txtTelefone = criarCaixaTexto();
		
		JLabel rotuloNota1 = criarRotulo("1ª Nota");
		txtNota1 = criarCaixaTexto();
		JLabel rotuloNota2 = criarRotulo("2ª Nota");
		txtNota2 = criarCaixaTexto();
		JLabel rotuloNota3 = criarRotulo("3ª Nota");
		txtNota3 = criarCaixaTexto();
		JLabel rotuloMedia = criarRotulo("Média");	
		txtMedia = criarCaixaTexto();
		txtMedia.setEditable(false);	

		txtNota1.setHorizontalAlignment(0);
		txtNota2.setHorizontalAlignment(0);
		txtNota3.setHorizontalAlignment(0);
		txtMedia.setHorizontalAlignment(0);
		
		JLabel txtlinha1 = new JLabel(definirEspacos(2));
		JLabel txtlinha2 = new JLabel(definirEspacos(2));
		JLabel txtlinha3 = new JLabel(definirEspacos(2));
		JLabel txtlinha4 = new JLabel(definirEspacos(2));

		botaoGravar = criarBotao("Gravar", 'G');
		botaoSair = criarBotao("Sair", 'S');
		//botaoSair.setEnabled(false);

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
		add(txtlinha1);
		add(txtlinha2);
		add(txtlinha3);
		add(txtlinha4);
		add(botaoGravar);
		add(botaoSair);	
		txtNome.requestFocus();
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
		jt.setFont(new Font("Courier new", Font.BOLD, 16));
		return jt;
	}
	public JLabel criarRotulo(String texto){
		JLabel jl = new JLabel();//Cria um rótulo
		jl.setText(texto);
		jl.setFont(new Font("Courier new", Font.BOLD, 16)); //tipo de fonte, estilo, tamanho
		return jl;
	}

	public static void main(String [] args)
	{
		new TelaCadastroAlunosGridLayout();
	}
	
	public String definirEspacos(int qtd)
	{
		String espacos=" ";
		for(int i=0 ; i<qtd; i++)
			espacos += "  ";
		return espacos;
	}
	public void actionPerformed(ActionEvent e) 
	{
		int i1 = 0;
		if (e.getSource() == botaoGravar)
			botaoGravar.setText("Botão GRAVAR pressionado " + ++i1 + " vez(es)");
		int i2 = 0;
		if (e.getSource() == botaoSair )
			botaoSair.setText("Botão SAIR pressionado " + ++i2 + " vez(es)");
}


}
