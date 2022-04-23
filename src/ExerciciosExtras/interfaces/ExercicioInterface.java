package ExerciciosExtras.interfaces;

import java.awt.*;


import javax.swing.*;


public class ExercicioInterface extends JFrame {
	JButton ok;
	JButton cancelar; 
	JTextField txtID,txtMedia,
	txtNome;
	public ExercicioInterface()
	{//construtor da classe T                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            esteJFrame
		setTitle("LOGIN USUÁRIO");//Titulo da janela
		JLabel botao= new JLabel("Pressione os botões");
		int larguraTela = 380;
		int alturaTela = 280;

		setSize(larguraTela,alturaTela);//tamanho da janela
		getContentPane().setBackground(new Color(39,118,57));//cor de fundo no padrão RGB (Red Green Blue)

		//Definindo o layout e adicionando na janela
		GridLayout fl = new GridLayout(12,2,2,2);//Qtd de linhas, colunas, espaço entre linhas e colunas
		getContentPane().setLayout(fl);
		
		JLabel rotuloID = criarRotulo("Usuário");
		rotuloID.setFont(getFont());
		txtID = criarCaixaTexto();
		JLabel rotuloNome = criarRotulo("Senha");
		txtNome = criarCaixaTexto();
		//txtMedia = criarCaixaTexto();
		//txtMedia.setHorizontalAlignment(0);
		ok = criarBotao("OK", 'G');
		cancelar = criarBotao("Cancelar", 'C');
	
		add(rotuloID);
		add(txtID);
		add(rotuloNome);
		add(txtNome);
		//add(txtMedia);	
		add(ok);
		add(cancelar);	
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
		new ExercicioInterface();
	}
	
	public String definirEspacos(int qtd)
	{
		String espacos="";
		for(int i=0 ; i<qtd; i++)
			espacos += "  ";
		return espacos;
	}
	

}
