package co.edu.unbosque.View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

import co.edu.unbosque.Controller.Controller;

public class RegistroClientes extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel panel1;
	private JLabel LabelCedula, LabelNombre, LabelApellido, LabelGenero, LabelEdad;
	private JLabel LabelCorreo, fondo;
	private JLabel LabelUsername, LabelContrasena ;
	private JLabel textoA, cupo , logo;
	private JTextField Jcedula, Jnombre, Japellido, Jedad, Jcorreo, Jusername, Jcontrasena;
	private JComboBox<String> sexo;
	private JButton RegistrarUsuario;
	private JButton BotonAtrasHR;
	private JDateChooser calendario;
	private ImageIcon imgAtras;
	public static final String BOTONREGISTRAR = "Registrar Usuario";
	public static final String BOTONATRAS = "BotonAtras";

	public RegistroClientes(Controller control) {
		setSize(850, 480);
		setResizable(false);
	    setIconImage(new ImageIcon("Imagenes/icono.jpg").getImage());
		setTitle("Hide&Seek (Registrar Usuario) ");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
		setResizable(false);
		panel1 = new JPanel();
		panel1.setLayout(null);
	
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		LabelCedula = new JLabel("Cédula : ");
		LabelNombre = new JLabel("Nombres: ");
		LabelApellido = new JLabel("Apellidos: ");
		LabelGenero = new JLabel("Genero: ");
		LabelEdad = new JLabel("Edad: ");
		LabelCorreo = new JLabel("Correo: ");
		LabelUsername = new JLabel("Nombre de usuario: ");
		LabelContrasena = new JLabel("Contraseña:");
		cupo = new JLabel();
		textoA = new JLabel("¡Bienvenido a Hide&Seek!");

		Jcedula = new JTextField("");
		Jnombre = new JTextField("");
		Japellido = new JTextField("");
		Jedad = new JTextField("");
		Jcorreo = new JTextField("");
		Jusername = new JTextField("");
		Jcontrasena = new JTextField("");

		RegistrarUsuario = new JButton(" Registrar Usuario ");

		BotonAtrasHR = new JButton();
		BotonAtrasHR.setFocusable(false);
		BotonAtrasHR.setActionCommand(BOTONATRAS);
		BotonAtrasHR.setBorder(null);
		BotonAtrasHR.setOpaque(false);
		imgAtras = new ImageIcon("Imagenes/volver.jpg");
		imgAtras = new ImageIcon(imgAtras.getImage().getScaledInstance(55, 55, Image.SCALE_DEFAULT));
		BotonAtrasHR.setIcon(imgAtras);
		BotonAtrasHR.setBounds(15, 15, 55, 55);
		panel1.add(BotonAtrasHR);

		///////////////////////////////////////////////////////////////////////////////////////////////////////////////

		panel1.add(textoA);
		textoA.setBounds(120, 40, 300, 23);
		textoA.setForeground(Color.WHITE);
		textoA.setFont(new Font("Berlin Sans FB", Font.PLAIN, 25));
		

		panel1.add(LabelCedula);
		LabelCedula.setBounds(60, 90, 150, 23);
		LabelCedula.setForeground(Color.WHITE);
		LabelCedula.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));

		panel1.add(Jcedula);
		Jcedula.setBounds(230, 90, 200, 23);
		Jcedula.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));

		panel1.add(LabelNombre);
		LabelNombre.setBounds(60, 120, 150, 23);
		LabelNombre.setForeground(Color.WHITE);
		LabelNombre.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));

		panel1.add(Jnombre);
		Jnombre.setBounds(230, 120, 200, 23);
		Jnombre.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));

		panel1.add(LabelApellido);
		LabelApellido.setBounds(60, 150, 150, 23);
		LabelApellido.setForeground(Color.WHITE);
		LabelApellido.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));

		panel1.add(Japellido);
		Japellido.setBounds(230, 150, 200, 23);
		Japellido.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));

		panel1.add(LabelEdad);
		LabelEdad.setBounds(60, 180, 200, 23);
		LabelEdad.setForeground(Color.WHITE);
		LabelEdad.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));

		panel1.add(Jedad);
		Jedad.setBounds(232, 180, 200, 23);
		Jedad.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));

		panel1.add(LabelCorreo);
		LabelCorreo.setBounds(60, 210, 270, 23);
		LabelCorreo.setForeground(Color.WHITE);
		LabelCorreo.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));

		panel1.add(Jcorreo);
		Jcorreo.setBounds(230, 210, 200, 23);
		Jcorreo.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));

		panel1.add(LabelUsername);
		LabelUsername.setBounds(60, 240, 240, 23);
		LabelUsername.setForeground(Color.WHITE);
		LabelUsername.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));

		panel1.add(Jusername);
		Jusername.setBounds(230, 240, 200, 23);
		Jusername.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));

		panel1.add(LabelContrasena);
		LabelContrasena.setBounds(60, 270, 200, 23);
		LabelContrasena.setForeground(Color.WHITE);
		LabelContrasena.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));

		panel1.add(Jcontrasena);
		Jcontrasena.setBounds(230, 270, 200, 23);
		Jcontrasena.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));

		
		panel1.add(LabelGenero);
		LabelGenero.setForeground(Color.WHITE);
		LabelGenero.setBounds(60, 300, 200, 23);
		LabelGenero.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		
		String[] pass = { "Seleccione", "Masculino", "Femenino" };
		sexo = new JComboBox<String>(pass);
		sexo.setSize(200, 30);
		sexo.setLocation(230, 300);
		add(sexo);

		panel1.add(RegistrarUsuario);
		RegistrarUsuario.setBounds(220, 370, 150, 35);
		RegistrarUsuario.setFocusable(false);
		RegistrarUsuario.setForeground(Color.black);
		RegistrarUsuario.setBackground(Color.LIGHT_GRAY);
		RegistrarUsuario.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		RegistrarUsuario.setActionCommand(BOTONREGISTRAR);

		 logo = new JLabel(""); ImageIcon icon = new
		 ImageIcon("Imagenes/amor.gif"); Image imagenReescalada =
		 icon.getImage().getScaledInstance(340, 340,Image.SCALE_DEFAULT);
		 logo.setIcon(new ImageIcon(imagenReescalada));
		 logo.setBounds(460, 50, 350 , 350); 
		 panel1.add(logo);
		
		 fondo = new JLabel(); 
		 fondo.setBounds(0,0,850,500); fondo.setIcon(new ImageIcon("Imagenes/fondo.jpg")); 
		 panel1.add(fondo);
		 
		this.add(panel1);

		getBotonAtrasHR().addActionListener(control);
		getRegistrarUsuario().addActionListener(control);
	}

	public JPanel getPanel1() {
		return panel1;
	}

	public void setPanel1(JPanel panel1) {
		this.panel1 = panel1;
	}

	public JLabel getLabelCedula() {
		return LabelCedula;
	}

	public void setLabelCedula(JLabel labelCedula) {
		LabelCedula = labelCedula;
	}

	public JLabel getLabelNombre() {
		return LabelNombre;
	}

	public void setLabelNombre(JLabel labelNombre) {
		LabelNombre = labelNombre;
	}

	public JLabel getLabelApellido() {
		return LabelApellido;
	}

	public void setLabelApellido(JLabel labelApellido) {
		LabelApellido = labelApellido;
	}

	public JLabel getLabelGenero() {
		return LabelGenero;
	}

	public void setLabelGenero(JLabel labelGenero) {
		LabelGenero = labelGenero;
	}

	public JLabel getLabelEdad() {
		return LabelEdad;
	}

	public void setLabelEdad(JLabel labelEdad) {
		LabelEdad = labelEdad;
	}

	public JLabel getLabelCorreo() {
		return LabelCorreo;
	}

	public void setLabelCorreo(JLabel labelCorreo) {
		LabelCorreo = labelCorreo;
	}

	public JLabel getLabelUsername() {
		return LabelUsername;
	}

	public void setLabelUsername(JLabel labelUsername) {
		LabelUsername = labelUsername;
	}

	public JLabel getLabelContrasena() {
		return LabelContrasena;
	}

	public void setLabelContrasena(JLabel labelContrasena) {
		LabelContrasena = labelContrasena;
	}

	public JLabel getTextoA() {
		return textoA;
	}

	public void setTextoA(JLabel textoA) {
		this.textoA = textoA;
	}

	public JTextField getJcedula() {
		return Jcedula;
	}

	public void setJcedula(JTextField jcedula) {
		Jcedula = jcedula;
	}

	public JTextField getJnombre() {
		return Jnombre;
	}

	public void setJnombre(JTextField jnombre) {
		Jnombre = jnombre;
	}

	public JTextField getJapellido() {
		return Japellido;
	}

	public void setJapellido(JTextField japellido) {
		Japellido = japellido;
	}

	public JTextField getJedad() {
		return Jedad;
	}

	public void setJedad(JTextField jedad) {
		Jedad = jedad;
	}

	public JTextField getJcorreo() {
		return Jcorreo;
	}

	public void setJcorreo(JTextField jcorreo) {
		Jcorreo = jcorreo;
	}

	public JTextField getJusername() {
		return Jusername;
	}

	public void setJusername(JTextField jusername) {
		Jusername = jusername;
	}

	public JTextField getJcontrasena() {
		return Jcontrasena;
	}

	public void setJcontrasena(JTextField jcontrasena) {
		Jcontrasena = jcontrasena;
	}

	public JComboBox<String> getSexo() {
		return sexo;
	}

	public void setSexo(JComboBox<String> sexo) {
		this.sexo = sexo;
	}

	public JButton getRegistrarUsuario() {
		return RegistrarUsuario;
	}

	public void setRegistrarUsuario(JButton registrarUsuario) {
		RegistrarUsuario = registrarUsuario;
	}

	public JButton getBotonAtrasHR() {
		return BotonAtrasHR;
	}

	public void setBotonAtrasHR(JButton botonAtrasHR) {
		BotonAtrasHR = botonAtrasHR;
	}

	public ImageIcon getImgAtras() {
		return imgAtras;
	}



	// ESTE METODO SE USA PARA MOSTRAR MENSAJES DE NOTIFICACION
	public void mostrarMensajes(String mensaje) {
		
		JOptionPane.showMessageDialog(null, mensaje);
	}
}	
