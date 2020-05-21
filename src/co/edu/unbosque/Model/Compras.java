package co.edu.unbosque.Model;

import java.io.Serializable;

public class Compras implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2226800129002277894L;
	private String pareja;
	private String lugar;
	private int monto;
	private String Fecha;

	public Compras(String pareja, String lugar, int monto, String fecha) {

		this.pareja = pareja;
		this.lugar = lugar;
		this.monto = monto;
		Fecha = fecha;
	}

	public String getPareja() {
		return pareja;
	}

	public void setPareja(String pareja) {
		this.pareja = pareja;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

}
