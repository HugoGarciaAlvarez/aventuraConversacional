package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Menu;
import model.Usuario;

public class DaoUsuario {

	private Connection conn = null;
	private static DaoUsuario instance = null;

	public DaoUsuario()  {

		try {
			conn = DbConnection.getConnection();
		} catch (SQLException e) {
			System.out.println("LA BASE DE DATOS ESTA DESCONECTADA, CONECTALA PARA CONTINUAR");
			Menu.menu();
		}

	}

	public static DaoUsuario getInstance() throws SQLException {
		if (instance == null) {

			instance = new DaoUsuario();
		}
		return instance;
	}

	// Crear Usuario//
	public void insert(Usuario usuarioIn) throws SQLException {
		String insertSql = "insert into usuario (nombre, contraseña) values(?,?)";
		PreparedStatement pst = conn.prepareStatement(insertSql);
		pst.setString(1, usuarioIn.getNombre());
		pst.setString(2, usuarioIn.getContrasena());
		if (pst.executeUpdate() > 0) {
			System.out.println("El usuario fue agregado correctamente a la base de datos");
		} else {
			System.out.println("Hubo un error durante el proceso");
			System.out.println("Intentalo mas tarde");

		}

	}
	// buscar Usuario//

	public boolean select(String nombre, String contrasena) throws SQLException {
		String selectSQl = "select * from usuario where nombre =? and contraseña = ?";
		PreparedStatement pst = conn.prepareStatement(selectSQl);
		pst.setString(1, nombre);
		pst.setString(2, contrasena);
		ResultSet rst = pst.executeQuery();
		if (rst.next()) {
			System.out.println("usuario encontrado");
			return true;
		} else {
			System.out.println("usuario no encontrado");
			return false;
		}

	}

	public String selectNombre(String nombre) throws SQLException {
		String selectSQl = "select * from usuario where nombre =?";
		PreparedStatement pst = conn.prepareStatement(selectSQl);
		String variable= "";
		pst.setString(1, nombre);
		ResultSet rst = pst.executeQuery();
		if (rst.next()) {
			variable = rst.getString("nombre");
			return variable;
		}else {
			return variable ="";
		}
	
		
	}

	public void darPuntuacion(int puntuacion, String nombre) throws SQLException {
		String sql = "update usuario set puntuacion = puntuacion + ? where nombre = ?";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1, puntuacion);
		pst.setString(2, nombre);
		if (pst.executeUpdate() > 0) {
			System.out.println("ENHORABUENA EL USUARIO:  " + nombre + " GANO " + puntuacion + " PUNTOS");
		}

	}

	public void selectPuntuacionMasAlta() throws SQLException {
		String selectSQl = "select * from usuario order by puntuacion desc LIMIT 1";
		Statement st = conn.createStatement();
		ResultSet rst = st.executeQuery(selectSQl);
		if (rst.next()) {
			String nombre = rst.getString("nombre");
			int puntuacion = rst.getInt("puntuacion");

			System.out.println(
					"La persona con mas puntuacion es " + nombre + " con una puntuacion de " + puntuacion + "\n");
		}
	}

	public void selectPuntuacionTop() throws SQLException {
		String selectSQl = "select * from usuario order by puntuacion desc LIMIT 5";
		Statement st = conn.createStatement();
		ResultSet rst = st.executeQuery(selectSQl);
		int dato = 1;

		System.out.printf("%-8s %-20s %s%n", "PUESTO", "NOMBRE", "PUNTUACION");
		System.out.println("---------------------------------------------");

		while (rst.next()) {
			String nombre = rst.getString("nombre");
			int puntuacion = rst.getInt("puntuacion");
			// si chat gpt, expresion regular 
			System.out.printf("%-8s %-20s %d%n", "PUESTO " + dato, nombre, puntuacion);
			System.out.println("---------------------------------------------");
			dato++;
		}
	}

}
