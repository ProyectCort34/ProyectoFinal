package View;

import java.awt.Color;

import javax.swing.JFrame;

public class MenuPrincipal extends JFrame  {
	
	private static final long serialVersionUID = 1L;
	
	
	public MenuPrincipal() {
		setLayout(null);
		setSize(900, 540);
		setBackground(Color.black);
		setTitle("SISTEMA ");
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		IniciarComponentes();

		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void IniciarComponentes() {
		
	}
}
