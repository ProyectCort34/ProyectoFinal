package co.edu.unbosque.Model;

import java.io.Serializable;

public class Almacenes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3780497233806030232L;
	private String ubicacion ; 
	private String nombre; 
	private String ciudad;
	
	public Almacenes(String ubicacion, String nombre, String ciudad) {
		this.ubicacion = ubicacion;
		this.nombre = nombre;
		this.ciudad = ciudad;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	} 
	
	
	

	
	

}
