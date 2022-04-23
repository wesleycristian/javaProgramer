package ExerciciosExtras.interfaces;

	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.*;
	public class LoginUsuario extends JFrame implements ActionListener
	{
		JButton btnOk, btnCancelar;
		JTextField campoUsuario;
		JPasswordField campoSenha;
		public LoginUsuario()
		{
			setTitle("Login do Usuário");
			setSize(320,120);
			GridLayout gl = new GridLayout(3,2,1,1);
			getContentPane().setLayout(gl);
			//provoca o termino da execução (encerra o programa)
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			JLabel labelUsuario = criarRotulo(" Usuário: ");
			getContentPane().add(labelUsuario);

			campoUsuario = criarCaixaTexto();
			getContentPane().add(campoUsuario);

			JLabel labelSenha = criarRotulo(" Senha: ");
			getContentPane().add(labelSenha);

			campoSenha = new JPasswordField();
			getContentPane().add(campoSenha);
			
			btnOk = new JButton("Ok");
			getContentPane().add(btnOk);
			btnOk.addActionListener(this);
			
			btnCancelar = new JButton("Cancelar");
			getContentPane().add(btnCancelar);
			btnCancelar.addActionListener(this);
			
			setVisible(true);
		}
		
		public void actionPerformed(ActionEvent e){
			if (e.getSource() == btnOk){
				String usuario = campoUsuario.getText();
				String senha = String.valueOf(campoSenha.getPassword());
				if (usuario.equals("Marcos") && senha.equals("1234"))
				{
					JOptionPane.showMessageDialog(null, usuario + ", "
							+ "você foi logado ao sistema.");
					System.exit(0);		
				}
				else
				{
					JOptionPane.showMessageDialog(null, 
							"Usuario: " +usuario+ " ou senha invalidos. Tente novamente");		
				}	
			}
			if (e.getSource() == btnCancelar)
			{
				System.exit(0);	
			}
		}

		public static void main(String[] args) {
			new LoginUsuario();

		}
		private JTextField criarCaixaTexto() {
			JTextField jt = new JTextField();	
			return jt;
		}
		public JLabel criarRotulo(String texto){
			JLabel jl = new JLabel();//Cria um rótulo
			jl.setText(texto);
			jl.setFont(new Font("Times new Roman", Font.BOLD, 18));
			jl.setForeground(Color.blue);		
			return jl;
		}
	}
