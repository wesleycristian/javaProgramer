package ExerciciosExtras.interfaces;

import java.awt.Color;
import java.awt.Font;
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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Cap19.Aluno;
public class AdicionandoAlunosBancoDados extends JFrame 
implements ActionListener, FocusListener{
	JButton botaoGravar;
	JButton botaoSair; 
	JTextField txtID, txtNota1, txtNota2, txtNota3 , txtMedia,
	txtNome, txtTelefone;
	public AdicionandoAlunosBancoDados()
	{//construtor da classe TesteJFrame
		
		setTitle("Cadastro de Alunos");//Titulo da janela
		int larguraTela = 880;
		int alturaTela = 250;

		setSize(larguraTela,alturaTela);//tamanho da janela
		getContentPane().setLayout(null);// anula o layout padrao
		getContentPane().setBackground(new Color(0,85,85));//cor de fundo no padrão RGB (Red Green Blue)

		//Linha 1
		int linha = 25;//altura da linha
		int topo = 20;
		JLabel rotuloID = criarRotulo("idAluno");
		txtID = criarCaixaTexto();
		JLabel rotuloNome = criarRotulo("Nome");
		txtNome = criarCaixaTexto();		
		JLabel rotuloTelefone = criarRotulo("Telefone");
		txtTelefone = criarCaixaTexto();

		rotuloID.setBounds(30, topo, 80, linha);//50 posição x, 30 posição y, 100 largura, 30 altura
		txtID.setBounds(100, topo, 80, linha);
		rotuloNome.setBounds(200, topo, 50, linha);
		txtNome.setBounds(250, topo, 360, linha);	
		rotuloTelefone.setBounds(630, topo, 100, linha);//50 posição x, 30 posição y, 100 largura, 30 altura
		txtTelefone.setBounds(700, topo, 140, linha);

		//Linha 2
		topo+=40;
		JLabel rotuloNota1 = criarRotulo("1ª Nota");
		txtNota1 = criarCaixaTexto();	
		JLabel rotuloNota2 = criarRotulo("2ª Nota");
		txtNota2 = criarCaixaTexto();
		JLabel rotuloNota3 = criarRotulo("3ª Nota");
		txtNota3 = criarCaixaTexto();
		JLabel rotuloMedia = criarRotulo("Média");	
		txtMedia = criarCaixaTexto();
		txtMedia.setEditable(false);	

		rotuloNota1.setBounds(30, topo, 80, linha);//50 posição x, 30 posição y, 100 largura, 30 altura
		txtNota1.setBounds(100, topo, 100, linha);
		txtNota1.setHorizontalAlignment(0);
		rotuloNota2.setBounds(245, topo, 80, linha);
		txtNota2.setBounds(315, topo, 100, linha);	
		txtNota2.setHorizontalAlignment(0);
		rotuloNota3.setBounds(455, topo, 80, linha);//50 posição x, 30 posição y, 100 largura, 30 altura
		txtNota3.setBounds(525, topo, 100, linha);
		txtNota3.setHorizontalAlignment(0);
		rotuloMedia.setBounds(665, topo, 80, linha);//50 posição x, 30 posição y, 100 largura, 30 altura
		txtMedia.setBounds(730, topo, 100, linha);
		txtMedia.setHorizontalAlignment(0);

		//Linha 5
		topo+=120;
		botaoGravar = criarBotao("Gravar", 'G');
		botaoSair = criarBotao("Sair", 'S');
		int posicaoBotao = larguraTela/2-100;
		botaoGravar.setBounds(posicaoBotao, topo, 100, linha);
		botaoSair.setBounds(posicaoBotao+100, topo, 100, linha);
		botaoGravar.setEnabled(false);
		txtID.setEditable(false);

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
		jt.setForeground(Color.BLUE);
		jt.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		jt.addFocusListener(this);
		return jt;
	}
	public JLabel criarRotulo(String texto){
		JLabel jl = new JLabel();//Cria um rótulo
		jl.setText(texto);
		jl.setForeground(Color.WHITE);
		jl.setFont(new Font("Times New Roman", Font.BOLD, 18)); //tipo de fonte, estilo, tamanho
		return jl;
	}

	public static void main(String [] args)
	{
		new AdicionandoAlunosBancoDados();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==botaoGravar)
		{
			if(!(txtNota1.getText().equals("")) 			
				&& !(txtNome.getText().equals(""))
				&& !(txtTelefone.getText().equals(""))
				&& !(txtNota1.getText().equals(""))
				&& !(txtNota2.getText().equals("")))
                
			{
				try 
				{
					gravarAluno();
					limparCampos();
				} 
				catch (SQLException e1) 
				{
					e1.printStackTrace();
				}
			}
			else	
				JOptionPane.showMessageDialog(null, 
						"Preencha todos campos!!!");
		}
		else if(e.getSource()==botaoSair)
			System.exit(0);		
	}
	private void gravarAluno() throws SQLException 
	{
		Aluno novo;
		Connection cn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/impacta", 
				"root", "daniela1234");
		Statement st = cn.createStatement();
		ResultSet rs=null;
		PreparedStatement ps=null;
		
		novo = new Aluno();
		ps = cn.prepareStatement(
				"INSERT INTO Alunos VALUES (?, ?, ?, ?, ?, ?, ?)");
		novo.setNome(txtNome.getText());
		novo.setTelefone(txtTelefone.getText());
		novo.setNota1(Float.parseFloat(txtNota1.getText()));
		novo.setNota2(Float.parseFloat(txtNota2.getText()));
		novo.setNota3(Float.parseFloat(txtNota3.getText()));
		novo.setMedia(novo.getMedia());
		//Percorrendo a tabela de alunos buscando o último ID
		rs = st.executeQuery("SELECT idAlunos FROM Alunos");           
		int id=0;
		while (rs.next()) 
			{
				id = rs.getInt("idAlunos");
			}
			ps.setInt(1, (id+1));
			ps.setString(2, novo.getNome());
			ps.setString(3, novo.getTelefone());
			ps.setFloat(4, novo.getNota1());
			ps.setFloat(5, novo.getNota2());
			ps.setFloat(6, novo.getNota3());
			ps.setFloat(7, novo.getMedia());
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!!!");
			
		rs.close();
		ps.close();	
		cn.close();
	}
	
	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void focusLost(FocusEvent e) {
	 if(e.getSource()==txtNota3)
	{
	  if(!(txtNome.getText().equals(""))
		&& !(txtTelefone.getText().equals(""))
		&& !(txtNota1.getText().equals(""))
		&& !(txtNota2.getText().equals(""))
		&& !(txtNota3.getText().equals("")))
	  {	txtMedia.setText(""+(Float.parseFloat(txtNota1.getText().toString())+
				Float.parseFloat(txtNota2.getText()) + 
				Float.parseFloat(txtNota3.getText()))/3);
	  	botaoGravar.setEnabled(true);
	  }	  
	  else
		{ JOptionPane.showMessageDialog(null, 
		 "Preencha todos campos da tela e volte digitar a nota 3 nota!!!");
			txtNota3.setText("");
		}
	}
	}
	public void limparCampos()
	{
		txtNome.setText("");
		txtTelefone.setText("");
		txtNota1.setText("");
		txtNota2.setText("");
		txtNota3.setText("");
		txtMedia.setText("");
		botaoGravar.setEnabled(false);
	}
}