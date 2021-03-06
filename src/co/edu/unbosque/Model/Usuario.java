package co.edu.unbosque.Model;

import java.io.Serializable;

public class Usuario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6212271318146627842L;
	private String cedula ; 
	private String nombre;
	private String apellido;
	private String genero;
	private String edad;
	private String correo;
	private String alias;
	private String contraseña;
	private String cupo;
	

	public Usuario(String cedula, String nombre, String apellido, String genero, String edad, String correo, String alias,
			String contraseña, String cupo) {
	
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.edad = edad;
		this.correo = correo;
		this.alias = alias;
		this.contraseña = contraseña;
		this.cupo = cupo;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getEdad() {
		return edad;
	}


	public void setEdad(String edad) {
		this.edad = edad;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getAlias() {
		return alias;
	}


	public void setAlias(String alias) {
		this.alias = alias;
	}


	public String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}


	public String getCupo() {
		return cupo;
	}


	public void setCupo(String cupo) {
		this.cupo = cupo;
	}
	


}
