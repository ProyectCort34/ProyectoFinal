package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.MenuPrincipal;
import View.RegistroClientes;

public class Controller implements ActionListener {
	
	private MenuPrincipal Vprincipal;
	private RegistroClientes Vclientes;
	public Controller() {
		//mprincipal = new MenuPrincipal();
		Vclientes= new RegistroClientes(this);
		Vclientes.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
