package ExerciciosExtras.interfaces;

import java . awt .*;
import java . awt . event .*;
import javax . swing .*;

public class TratandoEvento extends JFrame 
{

	private JCheckBox checkB , checkI ;
	private JRadioButton rbotaoA , rbotaoB , rbotao ;
	private ButtonGroup grupoRadio ;
	private JPanel painelA , painelB ;
	JTextField texto = new JTextField("Marcos Monteiro");

	// Configura a GUI
	public TratandoEvento () 
	{
		super (" Testando CheckBox e RadioButton ");

		// Cria o container e atribui o layout
		Container container = getContentPane () ;
		container . setLayout ( new FlowLayout () );
		// Cria os pain éis
		painelA = new JPanel () ;
		painelB = new JPanel () ;
		//Cria os objetos CheckBox , adiciona para o painel e
		// adiciona o painel para o container
		checkB = new JCheckBox ("Bold");
		painelA . add ( checkB ) ;
		checkI = new JCheckBox ("Itálico ") ;
		painelA . add ( checkI ) ;
		container . add ( painelA ) ;

		// Cria os objetos RadioButton , adiciona para o painel e
		// adiciona o painel para o container
		rbotaoA = new JRadioButton ("Plain", true );
		painelB . add ( rbotaoA );
		rbotaoB = new JRadioButton ("Bold", false );
		painelB . add ( rbotaoB );
		rbotao = new JRadioButton ("Itálico", false );
		painelB . add ( rbotao );
		container . add ( painelB ) ;
		container.add(texto);

		// Cria o relacionamento ló gico entre os objetos JRadioButton
		grupoRadio = new ButtonGroup () ;
		grupoRadio . add ( rbotaoA );
		grupoRadio . add ( rbotaoB );
		grupoRadio . add ( rbotao );

		// Registra os tratadores de evento
		Gerenciador gerente = new Gerenciador () ;
		checkB.addItemListener ( gerente );
		checkI.addItemListener ( gerente );
		rbotaoA.addItemListener ( gerente );
		rbotaoB.addItemListener ( gerente );
		rbotao.addItemListener ( gerente );

		setSize (300,200 ) ;
		setVisible ( true ) ;
		setDefaultCloseOperation ( JFrame . EXIT_ON_CLOSE );
		setLocationRelativeTo(null);
	}

	// Classe interna para tratamento de evento
	private class Gerenciador implements ItemListener 
	{
		// Mé todo de manipula ção do evento

		public void itemStateChanged ( ItemEvent event ) 
		{
			// Testa qual objeto foi pressionado
			if ( event . getSource () == checkB ) 
			{
				texto.setFont(new Font("Times New Roman", Font.BOLD, 16));
			} 
			else if ( event . getSource () == checkI ) 
			{
				texto.setFont(new Font("Times New Roman", Font.ITALIC, 16));
			} 
			else if (( event . getSource () == rbotaoA )
					&& ( event . getStateChange () == ItemEvent . SELECTED )) 
			{
				texto.setFont(new Font("Times New Roman", Font.PLAIN, 16));
			} 
			else if (( event . getSource () == rbotaoB )
					&& ( event . getStateChange () == ItemEvent . SELECTED )) 
			{		
				texto.setFont(new Font("Times New Roman", Font.BOLD, 16));
			} 
			else if (( event . getSource () == rbotao )
					&& ( event . getStateChange () == ItemEvent . SELECTED )) 
			{
				texto.setFont(new Font("Times New Roman", Font.ITALIC, 16));
			}
		}
	} // fim da classe interna Gerenciador

	//Mé todo principal
	public static void main ( String args []) {
		new TratandoEvento ();
	}
} // fim da classe E
