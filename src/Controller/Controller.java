package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.MenuPrincipal;
import View.RegistroClientes;
import View.RegistroTiendas;

public class Controller implements ActionListener {
	
	private MenuPrincipal Vprincipal;
	private RegistroClientes Vclientes;
	private RegistroTiendas Vtiendas;
	public Controller() {
		//mprincipal = new MenuPrincipal();
		Vclientes= new RegistroClientes(this);
		Vtiendas= new RegistroTiendas(this);
		//Vclientes.setVisible(true);
		Vtiendas.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {

	}
	
	
	

}
