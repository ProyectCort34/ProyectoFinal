package co.edu.unbosque.Model;

public class NombresExcepcion extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * Este es el constructor de la clase NombresExcepcion el cual esta vacio De
	 * esta manera este método cumple con la función de hacer una sobrecarga de
	 * constructores. <b>post</b> Se debe hacer la validación del nombre para que
	 * sea de tipo String, para el registro.<br>
	 */
	public NombresExcepcion() {
		super();
	}

	/**
	 * 
	 * Este es el constructor de la clase NombresExcepcion el cual se le asigna la
	 * inicialización de los atributos y objectos. De esta manera el objecto el
	 * objeto toma el valor. Este método se llama automaticamente cuando se esta
	 * validando el proceso del nombre del ciudadano en el registro. <b>post</b> Se
	 * debe hacer la validación del nombres para que sea de tipo String, para el
	 * registro <br>
	 * 
	 * @param mensaje es el atributo que tendrán el sistema para validar los nombres
	 *                mensaje != null, mensaje != “ “
	 * 
	 */
	public NombresExcepcion(String mensaje) {
		super(mensaje);
	}

}
