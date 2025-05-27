package model;

import java.sql.SQLException;

import dao.DaoUsuario;

public class Usuario {
	String nombre;
	String contrasena;
	int puntuacion;
	private static Usuario instance = null;
	protected static String usuarioIn = "";

	public Usuario(String nombre, String contrasena) {

		this.nombre = nombre;
		this.contrasena = contrasena;

	}
	public Usuario() {
		
	}

	

	public static Usuario getInstance() {

		if (instance == null) {

			instance = new Usuario();
		}
		return instance;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contraseña) {
		this.contrasena = contraseña;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	public String getUsuario() {
		return usuarioIn;
		
	}
	
	public static void darNombreUsuario(String inNombre) {
		usuarioIn = inNombre;
	}

	public void crearNuevoUsuario() throws SQLException {
		DaoUsuario.getInstance().insert(this);
	}

	public boolean buscarUsuarioPorNombreComtraseña(String nombre, String contraseña) throws SQLException {
		if (DaoUsuario.getInstance().select(nombre, contraseña)) {
			return true;
		} else {
			return false;
		}

	}

	public String buscarUsuarioPorNombre(String nombre) throws SQLException {

		String NombreDadoPorBD = DaoUsuario.getInstance().selectNombre(nombre);

		return NombreDadoPorBD;

	}

	public void buscarPorPuntuacionMasAlta() throws SQLException {
		DaoUsuario.getInstance().selectPuntuacionMasAlta();
	}

	public void buscarPorPuntuacionMasAltaTOP() throws SQLException {
		DaoUsuario.getInstance().selectPuntuacionTop();
	}

	public void darPuntuacion(int puntuacion) {
		try {
			DaoUsuario.getInstance().darPuntuacion(puntuacion, usuarioIn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Hubo un problema al dar puntuación, contacta con el administrador");
		}
	}

	@Override
	public String toString() {
		String infoJugador = "nombre=" + nombre + ", contraseña=" + contrasena + ", puntuacion=" + puntuacion;
		return infoJugador;
	}

}
