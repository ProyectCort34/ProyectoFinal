package co.edu.unbosque.Model;

import java.util.ArrayList;

public interface Interface {

	   public boolean agregarUsuario(String cedula,Usuario usuario, ArrayList<Usuario> arrayusuarios);
		
		String modificarUsuario(int pos, String n1, String n2, String a1, String a2);
		
		String eliminarUsuario(int pos);	
		
}
