package co.edu.unbosque.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.View.MenuPrincipal;
import co.edu.unbosque.View.RegistroClientes;
import co.edu.unbosque.View.RegistroTiendas;

public class Controller implements ActionListener {
	
	private MenuPrincipal Vprincipal;
	private RegistroClientes Vclientes;
	private RegistroTiendas Vtiendas;
	public Controller() {
		//mprincipal = new MenuPrincipal();
		Vclientes= new RegistroClientes(this);
		Vtiendas= new RegistroTiendas(this);
		Vclientes.setVisible(true);
		//Vtiendas.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {

	}
	
	
	

}
