package co.edu.unbosque.View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import co.edu.unbosque.Controller.Controller;

public class RegistroTiendas  extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel panel1;
	private JLabel LabelUbicacion, LabelNombre, LabelCiudad;
	private JLabel textoA, cupo , logo , fondo;
	private JTextField Jubicacion, Jnombre, Jciudad;
	private JButton RegistrarAlmacen;
	private JButton BotonAtras;
	private ImageIcon imgAtras;
	public static final String BOTONREGISTRARALMACEN = "Registrar Almacen";
	public static final String BOTONATRAS = "BotonAtras";

	public RegistroTiendas(Controller control) {
		setSize(750, 400);
		setResizable(false);
	    setIconImage(new ImageIcon("Imagenes/icono.jpg").getImage());
		setTitle("Hide&Seek (Registrar Almacen) ");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
		setResizable(false);
		panel1 = new JPanel();
		panel1.setLayout(null);
	
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		LabelUbicacion = new JLabel("Ubicación : ");
		LabelNombre = new JLabel("Nombre : ");
		LabelCiudad = new JLabel("Ciudad : ");
		textoA = new JLabel("¡Registro de Almacenes Hide&Seek !");
		RegistrarAlmacen = new JButton(" Registrar Almacen  ");
		
		Jubicacion = new JTextField("");
		Jnombre = new JTextField("");
		Jciudad = new JTextField("");
		
		
		BotonAtras = new JButton();
		BotonAtras.setFocusable(false);
		BotonAtras.setActionCommand(BOTONATRAS);
		BotonAtras.setBorder(null);
		BotonAtras.setOpaque(false);
		imgAtras = new ImageIcon("Imagenes/volver.jpg");
		imgAtras = new ImageIcon(imgAtras.getImage().getScaledInstance(55, 55, Image.SCALE_DEFAULT));
		BotonAtras.setIcon(imgAtras);
		BotonAtras.setBounds(15, 15, 55, 55);
		panel1.add(BotonAtras);
		

		panel1.add(textoA);
		textoA.setBounds(120, 40, 400, 23);
		textoA.setForeground(Color.WHITE);
		textoA.setFont(new Font("Berlin Sans FB", Font.PLAIN, 25));
		

		panel1.add(LabelUbicacion);
		LabelUbicacion.setBounds(60, 90, 150, 23);
		LabelUbicacion.setForeground(Color.WHITE);
		LabelUbicacion.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));

		panel1.add(Jubicacion);
		Jubicacion.setBounds(200, 90, 180, 23);
		Jubicacion.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));

		panel1.add(LabelNombre);
		LabelNombre.setBounds(60, 120, 150, 23);
		LabelNombre.setForeground(Color.WHITE);
		LabelNombre.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));

		panel1.add(Jnombre);
		Jnombre.setBounds(200, 120, 180, 23);
		Jnombre.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));

		panel1.add(LabelCiudad);
		LabelCiudad.setBounds(60, 150, 150, 23);
		LabelCiudad.setForeground(Color.WHITE);
		LabelCiudad.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));

		panel1.add(Jciudad);
		Jciudad.setBounds(200, 150, 180, 23);
		Jciudad.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));


		RegistrarAlmacen.setBounds(150, 190, 180, 35);
		RegistrarAlmacen.setFocusable(false);
		RegistrarAlmacen.setForeground(Color.black);
		RegistrarAlmacen.setBackground(Color.orange);
		RegistrarAlmacen.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		RegistrarAlmacen.setActionCommand(BOTONREGISTRARALMACEN);
		panel1.add(RegistrarAlmacen);
		
		 logo = new JLabel("");
		 ImageIcon icon = new ImageIcon("Imagenes/supermercado.png"); 
		 Image imagenReescalada = icon.getImage().getScaledInstance(220, 220,Image.SCALE_DEFAULT);
		 logo.setIcon(new ImageIcon(imagenReescalada));
		 logo.setBounds(460, 80, 220 , 220); 
		 panel1.add(logo);
		
		 fondo = new JLabel(); 
		 fondo.setBounds(0,0,850,500); 
		 fondo.setIcon(new ImageIcon("Imagenes/fondo.jpg")); 
		 panel1.add(fondo);
		 
		this.add(panel1);

		getBotonAtras().addActionListener(control);
		getRegistrarAlmacen().addActionListener(control);
	}

	public JPanel getPanel1() {
		return panel1;
	}

	public void setPanel1(JPanel panel1) {
		this.panel1 = panel1;
	}

	public JLabel getLabelUbicacion() {
		return LabelUbicacion;
	}

	public void setLabelUbicacion(JLabel labelUbicacion) {
		LabelUbicacion = labelUbicacion;
	}

	public JLabel getLabelNombre() {
		return LabelNombre;
	}

	public void setLabelNombre(JLabel labelNombre) {
		LabelNombre = labelNombre;
	}

	public JLabel getLabelCiudad() {
		return LabelCiudad;
	}

	public void setLabelCiudad(JLabel labelCiudad) {
		LabelCiudad = labelCiudad;
	}

	public JLabel getTextoA() {
		return textoA;
	}

	public void setTextoA(JLabel textoA) {
		this.textoA = textoA;
	}

	public JLabel getCupo() {
		return cupo;
	}

	public void setCupo(JLabel cupo) {
		this.cupo = cupo;
	}

	public JLabel getLogo() {
		return logo;
	}

	public void setLogo(JLabel logo) {
		this.logo = logo;
	}

	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
	}

	public JTextField getJubicacion() {
		return Jubicacion;
	}

	public void setJubicacion(JTextField jubicacion) {
		Jubicacion = jubicacion;
	}

	public JTextField getJnombre() {
		return Jnombre;
	}

	public void setJnombre(JTextField jnombre) {
		Jnombre = jnombre;
	}

	public JTextField getJciudad() {
		return Jciudad;
	}

	public void setJciudad(JTextField jciudad) {
		Jciudad = jciudad;
	}

	public JButton getRegistrarAlmacen() {
		return RegistrarAlmacen;
	}

	public void setRegistrarAlmacen(JButton registrarAlmacen) {
		RegistrarAlmacen = registrarAlmacen;
	}

	public JButton getBotonAtras() {
		return BotonAtras;
	}

	public void setBotonAtras(JButton botonAtras) {
		BotonAtras = botonAtras;
	}

	
}
