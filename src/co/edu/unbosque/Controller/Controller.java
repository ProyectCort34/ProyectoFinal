package co.edu.unbosque.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import co.edu.unbosque.Model.Usuario;
import co.edu.unbosque.Model.Persistencia.ArchivoUsuario;
import co.edu.unbosque.Model.Persistencia.UsuarioDao;
import co.edu.unbosque.View.MenuPrincipal;
import co.edu.unbosque.View.RegistroClientes;
import co.edu.unbosque.View.RegistroTiendas;
import co.edu.unbosque.Model.NombresExcepcion;
import co.edu.unbosque.Model.NumeroCedulaExcepcion;

public class Controller implements ActionListener {
	
	
	//private MenuPrincipal Vprincipal;
	//private RegistroTiendas Vtiendas;
	RegistroClientes rc = null;
	UsuarioDao usDao = null;	
	private ArchivoUsuario archivoUs;
	private ArrayList<Usuario>arrayusuarios;	
	private String cedula = "", nombres = "", apellidos = "", edad = "", correo = "", nom_user = "",
			contrasena = "", genero = "",cupo = "";
		

	String numeros = "[0-9]+";
	
	public Controller(RegistroClientes rc) {
		super();
		this.rc = rc;
		rc= new RegistroClientes(this);
	
		arrayusuarios = new ArrayList<Usuario>();
		
		archivoUs = new ArchivoUsuario();
		usDao = new UsuarioDao(archivoUs);
		usDao.usuarios = archivoUs.leerArchivo();
		
		rc.setVisible(true);
		
	}
	
	public String nombres(String n) throws NombresExcepcion {

		if (n.matches(numeros)) {
			throw new NumberFormatException("El formato del nombre o apellido es incorrecto");
		} else {
			return n;
		}
	}
	
	public String comprobarCedula(String c) throws NumeroCedulaExcepcion {

		if (c.matches(numeros) && (c.length() >= 5 && c.length() <= 10)) {
			return c;
		} else {
			throw new NumeroCedulaExcepcion("El formato de la cédula es incorrecto");
		}
	}
	
	
	public String genero() throws NullPointerException {

		if (rc.getSexo().getSelectedItem() == "Masculino") {
			return "Masculino";
		} else if (rc.getSexo().getSelectedItem() == "Femenino") {
			return "Femenino";
		} else {
			throw new NullPointerException("No se ha seleccionado un género");
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == rc.getRegistrarUsuario()) {
	
				String mensaje = "";
				
				cedula = rc.getJapellido().getText();
				nombres = rc.getJnombre().getText();
				apellidos = rc.getJapellido().getText();
				edad = rc.getJedad().getText();
				correo = rc.getJcorreo().getText();
				nom_user = rc.getJusername().getText();
				contrasena = rc.getJcontrasena().getText();
				genero = (String) rc.getSexo().getSelectedItem();
				
				if ((String.valueOf(rc.getJcedula().getText()).isEmpty())||rc.getJcedula().getText().isEmpty()||
					rc.getJnombre().getText().isEmpty()||rc.getJapellido().getText().isEmpty()||
					rc.getJedad().getText().isEmpty()||rc.getJcorreo().getText().isEmpty()||rc.getJusername().getText().isEmpty()||
					rc.getJcontrasena().getText().isEmpty())
			
					
					mensaje = "Todos los campos son obligatorios";
					rc.mostrarMensajes(mensaje);
	
			}
	
			else {
				
				
				String mensaje = "";
					Usuario user = new Usuario(cedula, nombres, apellidos, genero, edad, correo, nom_user, contrasena, cupo);
					
					if (usDao.agregarUsuario(cedula, user, arrayusuarios)) {
						
							mensaje = "Persona añadida al sistema exitosamente";
							rc.mostrarMensajes(mensaje);
					
					} else {
						
							mensaje = "Ya existe un usuario registrado con este numero de cedula";
							rc.mostrarMensajes(mensaje);
					
					}
		
					rc.getJcedula().setText(null);
					rc.getJnombre().setText(null);
					rc.getJapellido().setText(null);
					rc.getSexo().setSelectedItem(null);
					rc.getJedad().setText(null);
					rc.getJcorreo().setText(null);
					rc.getJusername().setText(null);
					rc.getJcontrasena().setText(null);
			
					
			
		}
		rc.getJcedula().setText(null);
		rc.getJnombre().setText(null);
		rc.getJapellido().setText(null);
		rc.getSexo().setSelectedItem(null);
		rc.getJedad().setText(null);
		rc.getJcorreo().setText(null);
		rc.getJusername().setText(null);
		rc.getJcontrasena().setText(null);
		
		
		System.out.println(usDao.usuarios.get(0));
		

		
	}
	
	

	

}
