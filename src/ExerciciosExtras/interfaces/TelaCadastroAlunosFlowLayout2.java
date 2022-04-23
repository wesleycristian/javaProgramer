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


public class TelaCadastroAlunosFlowLayout2 extends JFrame implements ActionListener {
	
	JLabel l1;
	JButton b1, b2;
	int i1, i2;
	
	JButton botaoGravar;
	JButton botaoSair; 
	JTextField txtID, txtNota1, txtNota2, txtNota3 , txtMedia,
	txtNome, txtTelefone;
	public TelaCadastroAlunosFlowLayout2()
	{//construtor da classe TesteJFrame
		setTitle("Cadastro de Alunos");//Titulo da janela
		int larguraTela = 880;
		int alturaTela = 250;

		setSize(larguraTela,alturaTela);//tamanho da janela
		getContentPane().setBackground(new Color(39,118,57));//cor de fundo no padrão RGB (Red Green Blue)

		FlowLayout fl = new FlowLayout();
		getContentPane().setLayout(fl);
		
		JLabel rotuloID = criarRotulo("Código");
		txtID = criarCaixaTexto();
		txtID.setText(definirEspacos(10));
		JLabel rotuloNome = criarRotulo("Nome");
		txtNome = criarCaixaTexto();
		txtNome.setText(definirEspacos(70));
		JLabel rotuloTelefone = criarRotulo("Telefone");
		txtTelefone = criarCaixaTexto();
		txtTelefone.setText(definirEspacos(20));

		JLabel rotuloNota1 = criarRotulo("1ª Nota");
		txtNota1 = criarCaixaTexto();
		txtNota1.setText(definirEspacos(20));
		JLabel rotuloNota2 = criarRotulo("2ª Nota");
		txtNota2 = criarCaixaTexto();
		txtNota2.setText(definirEspacos(20));
		JLabel rotuloNota3 = criarRotulo("3ª Nota");
		txtNota3 = criarCaixaTexto();
		txtNota3.setText(definirEspacos(20));
		JLabel rotuloMedia = criarRotulo("Média");	
		txtMedia = criarCaixaTexto();
		txtMedia.setText(definirEspacos(20));
		txtMedia.setEditable(false);	

		txtNota1.setHorizontalAlignment(0);
		txtNota2.setHorizontalAlignment(0);
		txtNota3.setHorizontalAlignment(0);
		txtMedia.setHorizontalAlignment(0);
		
		JLabel txtlinha = new JLabel(definirEspacos(200));

		botaoGravar = criarBotao("Gravar", 'G');
		botaoSair = criarBotao("Sair", 'S');
		int posicaoBotao = larguraTela/2-100;
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
		add(txtlinha);
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
		b1.addActionListener(this);
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
		new TelaCadastroAlunosFlowLayout2();
	}
	
	public String definirEspacos(int qtd)
	{
		String espacos="";
		for(int i=0 ; i<qtd;i++)
			espacos += "  ";
		return espacos;
	}

public static void main1(String [] args){
	new TelaCadastroAlunos();	 
}
public void actionPerformed(ActionEvent e) 
{
	if (e.getSource() == botaoGravar) {
		
	}
		JOptionPane.showMessageDialog(null,"Botão GRAVAR pressionado ");
		
		if (e.getSource() == botaoSair)
			
		JOptionPane.showMessageDialog(null,"Botão SAIR pressionado ");
}
}
