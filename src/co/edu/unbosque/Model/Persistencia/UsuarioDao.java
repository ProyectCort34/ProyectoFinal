package co.edu.unbosque.Model.Persistencia;
import java.util.ArrayList;
import co.edu.unbosque.Model.Interface;
import co.edu.unbosque.Model.Usuario;

public class UsuarioDao  implements Interface {
	private ArchivoUsuario archivo;
	public ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	public String nombre;

	public UsuarioDao() {

	}

	public UsuarioDao(ArchivoUsuario archivo) {
		this.archivo = archivo;
	}

	// CRUD
	
	public Usuario buscarPersona(String cedula, ArrayList<Usuario> arraypersonas) {
		Usuario p = null;
		if (!arraypersonas.isEmpty()) {
			for (int i = 0; i <= arraypersonas.size() - 1; i++) {
				if (arraypersonas.get(i).getCedula().equals(cedula)) {
					p = arraypersonas.get(i);
				}
			}

		}
		return p;
	}
	@Override
	public boolean agregarUsuario(String cedula, Usuario usuario, ArrayList<Usuario> arrayusuarios) {
		Usuario nuevo = null;
		if (buscarPersona(cedula, usuarios) == null) {
			nuevo = usuario;
			usuarios.add(usuario);
			archivo.escribirEnArchivo(usuarios);
			return true;
		} else {
			return false;
		}
	}
	@Override
	public String eliminarUsuario(int pos) {
		try {

			String mensaje = "";
			usuarios.remove(pos);
			archivo.getArchivo().delete();
			archivo.getArchivo().createNewFile();
			archivo.escribirEnArchivo(usuarios);
			mensaje = "Se ha eliminado la persona";
			return mensaje;
		} catch (Exception e) {
			String mensaje = "No se ha eliminado";
			return mensaje;
		}
	}

	@Override
	public String modificarUsuario(int pos, String n1, String n2, String a1, String a2) {
		// TODO Auto-generated method stub
		return null;
	}

}
