package Model;

public class Almacenes {
	
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
