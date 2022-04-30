package br.com.impacta.prateleiradigital.apresentacao;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import br.com.impacta.prateleiradigital.controle.FilmeController;
import br.com.impacta.prateleiradigital.negocio.Filme;

public class ConsultarFilmeConsole extends JFrame implements ActionListener, FocusListener
{
	JButton botaoConsultar, botaoSair, botaoConsultarPorTitulo,botaoLimparCampo,
	botaoExcluir, botaoAlterar, botaoIncluir;
	JTextField txtTitulo, txtDiretores, txtNota, txtDuracao , 
	txtAnoInicial, txtAnoFinal, txtGeneros, txtNumVotos, txtURL,txtIncluirfilme,txtLimparCampo;
	Calendar c = Calendar.getInstance();
	int anoAtual = c.get(Calendar.YEAR);
	public ConsultarFilmeConsole()
	{//construtor da classe TesteJFrame
		setTitle("Consulta de Filmes");//Titulo da janela
		int larguraTela = 540;
		int alturaTela = 460;

		setSize(larguraTela,alturaTela);//tamanho da janela
		getContentPane().setLayout(new GridLayout(14,2,5,5));
		getContentPane().setBackground(new Color(0,85,85));//cor de fundo no padrão RGB (Red Green Blue)

		JLabel jlTitulo = criarRotulo("Título:");
		txtTitulo = criarCaixaTexto();
		JLabel jlDiretores = criarRotulo("Diretores:");
		txtDiretores = criarCaixaTexto();		
		JLabel jlNota = criarRotulo("Nota: ");
		txtNota = criarCaixaTexto();
		JLabel jlDuracao = criarRotulo("Duração: ");
		txtDuracao = criarCaixaTexto();	
		JLabel jlAno = criarRotulo("Ano Inicial: ");
		txtAnoInicial = criarCaixaTexto();
		JLabel jlAnoFinal = criarRotulo("Ano Final: ");
		txtAnoFinal = criarCaixaTexto();
		JLabel jlGenero = criarRotulo("Gênero");
		txtGeneros = criarCaixaTexto();
		JLabel jlNumeroVotos = criarRotulo("Número de Votos: ");	
		txtNumVotos = criarCaixaTexto();
		JLabel jlURL = criarRotulo("URL: ");	
		txtURL = criarCaixaTexto();
		
		txtNota.setHorizontalAlignment(0);
		txtAnoInicial.setHorizontalAlignment(0);
		txtAnoFinal.setHorizontalAlignment(0);
		txtDuracao.setHorizontalAlignment(0);
		txtNumVotos.setHorizontalAlignment(0);
		
		txtAnoInicial.setText("1900");
		txtAnoFinal.setText("" + anoAtual);//obtém o ano atual do sistema

		botaoConsultar = criarBotao("Consultar", 'C');
		botaoSair = criarBotao("Sair", 'S');
		botaoConsultarPorTitulo = criarBotao("Consultar por Título", 'T');
		botaoExcluir = criarBotao("Excluir", 'E');
		botaoAlterar = criarBotao("Alterar", 'A');
		botaoIncluir = criarBotao("Incluir Filme", 'I');
		botaoLimparCampo = criarBotao("Limpar Campo", 'L');
		
		add(jlTitulo);
		add(txtTitulo);
		add(jlDiretores);
		add(txtDiretores);
		add(jlNota);
		add(txtNota);
		add(jlDuracao);
		add(txtDuracao);
		add(jlAno);
		add(txtAnoInicial);
		add(jlAnoFinal);
		add(txtAnoFinal);
		add(jlGenero);
		add(txtGeneros);
		add(jlNumeroVotos);
		add(txtNumVotos);
		add(jlURL);
		add(txtURL);
		add(botaoConsultar);
		add(botaoSair);	
		add(botaoConsultarPorTitulo);
		add(botaoExcluir);
		add(botaoAlterar);
		add(botaoLimparCampo);
		add(botaoIncluir);
		
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

	public static void main(String[] args) 
	{
		new ConsultarFilmeConsole();		
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==botaoConsultar)
		{
			if(txtAnoInicial.getText().equals("") 
					|| txtAnoFinal.getText().equals(""))
				JOptionPane.showMessageDialog(null, 
						"Os campos ano inicial e final são Obrigatórios");
			try 
			{
				ArrayList<Filme> filmes; 
				FilmeController controller = new FilmeController();
				filmes = controller.consultarFilme(
					txtTitulo.getText(), txtGeneros.getText(), 
					Integer.parseInt(txtAnoInicial.getText()), 
					Integer.parseInt(txtAnoFinal.getText()));
				System.out.println("...");

				System.out.print("TITULO\t\tDIRETORES\t\tNOTA IMDB\t\tDURAÇÃO (MIN)\t\tANO\t\tGÊNEROS\t\tNUM VOTOS\t\tURL");
				
				
				filmes.forEach(System.out::println);
			} 
			catch (Exception exp) 
			{
				JOptionPane.showMessageDialog(null,exp.getMessage(),
					"Erro ocorrido",JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource()==botaoSair)
		{
			System.exit(0);
		}
		else if(e.getSource()==botaoConsultarPorTitulo)
		{
			try 
			{
				Filme filme; 
				FilmeController controller = new FilmeController();
				filme = controller.consultarFilme(txtTitulo.getText(), anoAtual, anoAtual);
				txtTitulo.setText(filme.getTitulo());
				txtDiretores.setText(filme.getDiretores());
				txtNota.setText(""+ filme.getNota());
				txtDuracao.setText(""+ filme.getDuracao());
				txtAnoInicial.setText(""+ filme.getAno()); 
				txtAnoFinal.setText(""+ filme.getAno()); 
				txtGeneros.setText(filme.getGeneros());				
				txtNumVotos.setText(""+ filme.getNumVotos());
				txtURL.setText(filme.getUrl()); 
			} 
			catch (Exception exp) 
			{
				JOptionPane.showMessageDialog(null,exp.getMessage(),
					"Erro ocorrido",JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(e.getSource()==botaoExcluir)
		{
			Filme filme = null; 
			FilmeController controller = new FilmeController();
			try 
			{
				filme = controller.consultarFilme(txtTitulo.getText(), anoAtual, anoAtual);
			} 
			catch (Exception e1) 
			{
				e1.printStackTrace();
			}
			int resp = JOptionPane.showConfirmDialog(null, "Confirma a exclusão do FILME:\n\n"
			+ filme.getTitulo() + "\n" 
			+filme.getDiretores()+ "\n" 
			+""+ filme.getNota()+ "\n" 
			+""+ filme.getDuracao()+ "\n" 
			+""+ filme.getAno()+ "\n" 
			+""+ filme.getAno()+ "\n" 
			+filme.getGeneros()+ "\n" 
			+""+ filme.getNumVotos()+ "\n" 
			+filme.getUrl()+ "\n"); 
			if(resp==0)//Clicou no botão sim.
			{
				FilmeController excluir = new FilmeController();
				try 
				{
					excluir.remover(filme);
					JOptionPane.showMessageDialog(null, "FILME:\n " 
					+ txtTitulo.getText() +"\nREMOVIDO com sucesso!");
					limparCampos();
				} 
				catch (Exception e1) 
				{
					e1.printStackTrace();
				}
			}
		}
		else if(e.getSource()==botaoAlterar)
		{
			Filme filme = new Filme(); 
			FilmeController controller = new FilmeController();
			int resp = JOptionPane.showConfirmDialog(null, 
				"Confirma a ALTERAÇÃO dos dados do FILME:\n\n"
			+ txtTitulo.getText() + "\n" ); 
			if(resp==0)//Clicou no botão sim.
			{
				FilmeController alterar = new FilmeController();
				try 
				{
					filme.setTitulo(txtTitulo.getText());
					filme.setDiretores(txtDiretores.getText());					
					filme.setNota(Double.parseDouble(txtNota.getText()));
					filme.setDuracao(Integer.parseInt(txtDuracao.getText()));
					filme.setAno(Integer.parseInt(txtAnoInicial.getText()));		 
					filme.setGeneros(txtGeneros.getText());				
					filme.setNumVotos(Integer.parseInt(txtNumVotos.getText()));
					filme.setUrl(txtURL.getText()); 
					alterar.alterarFilme(filme);
					JOptionPane.showMessageDialog(null, "FILME:\n " 
					+ txtTitulo.getText() +"\nALTERADO com sucesso!");					
				} 
				catch (Exception e1) 
				{
					e1.printStackTrace();
				}
			}
		}
		else if(e.getSource()==botaoIncluir)
		{
			Filme filme = new Filme(); 
			FilmeController controller = new FilmeController();
			
			{
				FilmeController incluir = new FilmeController();
				try 
				{
					filme.setTitulo(txtTitulo.getText());
					filme.setDiretores(txtDiretores.getText());					
					filme.setNota(Double.parseDouble(txtNota.getText()));
					filme.setDuracao(Integer.parseInt(txtDuracao.getText()));
					filme.setAno(Integer.parseInt(txtAnoInicial.getText()));		 
					filme.setGeneros(txtGeneros.getText());				
					filme.setNumVotos(Integer.parseInt(txtNumVotos.getText()));
					filme.setUrl(txtURL.getText()); 
					incluir.criarFilme(filme.getTitulo(), filme.getDiretores(), filme.getNota(), filme.getDuracao(), filme.getAno(), filme.getGeneros(), filme.getNumVotos(), filme.getUrl());
					JOptionPane.showMessageDialog(null, "FILME:\n " 
					+ txtTitulo.getText() +"\nIncluido com sucesso!");					
				} 
				catch (Exception e1) 
				{
					e1.printStackTrace();
				}
			}
		}
		else if(e.getSource()==botaoLimparCampo)
		{
			
				try 
				{
					limparCampos();					
				} 
				catch (Exception e1) 
				{
					e1.printStackTrace();
				}
			}
		}	
		
	
	
	private void limparCampos() 
	{
		txtTitulo.setText("");
		txtDiretores.setText("");
		txtNota.setText("");
		txtDuracao.setText("");
		txtAnoInicial.setText("1900");		 
		txtAnoFinal.setText("" + anoAtual); 
		txtGeneros.setText("");				
		txtNumVotos.setText("");
		txtURL.setText(""); 
	}
	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}
}