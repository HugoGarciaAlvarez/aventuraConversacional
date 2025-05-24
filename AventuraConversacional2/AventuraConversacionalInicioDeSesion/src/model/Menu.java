package model;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

	public static void menu() {
		Scanner sc = new Scanner(System.in);

		int opcion = 0;
		System.out.println(
				"BIENVENIDO USUARIO ANTES DE COMENZAR ESTA AVENTURA ES NECESARIO INCIAR SESION O CREAR UNA CUENTA");

		// MENU
		while (opcion != 3) {
			System.out.println("INTRODUZCA UNA OPCION NUMÉRICA DE 1 A 3");
			System.out.println("1)INICIAR SESION");
			System.out.println("2)CREAR CUENTA");
			System.out.println("3)SALIR DEL PROGRAMA");
			opcion = CorrecionErrorInt.getInstance().correcionDeErrores();

			if (opcion == 1) {
				System.out.println("METODO ELEGIDO INICIO DE SESION");
				Menu.iniciarSesion();

			} else if (opcion == 2) {
				System.out.println("METODO ELEGIDO CREACION DE CUENTA");
				Menu.crearCuenta();
			}else if(opcion ==3) {
				System.exit(0); //bombocat
			}
		}

	}

	public static void iniciarSesion() {
		Scanner sc = new Scanner(System.in);
		// Creacion objeto usuario
		Usuario usuario = new Usuario();
		// Valores que se van a pedir
		String nombre = "";
		String contraseña = "";
		boolean usuarioEncontrado = false;
		while (!usuarioEncontrado) {

			System.out.println("RECUERDA QUE EL SISTEMA ES SENSIBLE A LAS MAYUSCULAS Y MINUSCULAS");
			System.out.println("INTRODUZCA A CONTINUACIÓN SU NOMBRE Y CONTRASEÑA");
			System.out.println("NOMBRE:");
			nombre = sc.nextLine();
			System.out.println("CONTRASEÑA");
			contraseña = sc.nextLine();

			// Buscar nombre y usuario en la base de datos
			try {
				usuarioEncontrado = usuario.buscarUsuarioPorNombreComtraseña(nombre, contraseña);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		Menu.inicarJuego();

	}

	public static void crearCuenta() {
		Scanner sc = new Scanner(System.in);
		// Creacion objeto usuario
		String nombre;
		String contrasena;
		int opcion = 0;

		boolean creacionDeUsuario = false;
		while (!creacionDeUsuario) {
			System.out.println("INTRODUZCA A CONTINUACIÓN SU NOMBRE Y CONTRASEÑA");
			System.out.println("NOMBRE: ");
			nombre = sc.nextLine();
			if(Menu.verificarNombre(nombre) == false){
				Menu.volverAlMenu();
			}else{
			
				System.out.println("CONTRASEÑA");
				contrasena = sc.nextLine();

				while ( opcion != 1 && opcion != 2) {
					System.out.println("LA INFORMACIÓN ES CORRECTA?");
					System.out.println("INTRODUZCA UNA OPCION NUMÉRICA DE 1 A 2");
					System.out.println("1)SI");
					System.out.println("2)NO");
					opcion = CorrecionErrorInt.getInstance().correcionDeErrores();
					if (opcion == 1) {
						Usuario usuario = new Usuario(nombre, contrasena);
						System.out.println("USUARIO CREADO CORRECTAMENTE");
						try {
							usuario.crearNuevoUsuario();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						creacionDeUsuario = true;
					} else if (opcion == 2) {
						System.out.println("CREACION DE USUARIO CANCELADA");
						creacionDeUsuario = true;
					}
				}
			}
			

		}

	}
	public static void volverAlMenu() {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		while (opcion != 1 && opcion != 2) {
			System.out.println("LE GUSTARIA VOLVER AL MENU PRINCIPAL");
			System.out.println("INTRODUZCA UNA OPCION NUMÉRICA DE 1 A 2");
			System.out.println("1)SI");
			System.out.println("2)NO");
			opcion = CorrecionErrorInt.getInstance().correcionDeErrores();
			if (opcion == 1) {
				Menu.menu();
			}
		}
	}
	public static boolean verificarNombre(String nombre) {
		String nombreDB = "";
		try {
		 nombreDB = Usuario.getInstance().buscarUsuarioPorNombre(nombre);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(nombreDB.equals(nombre)) {
			System.out.println("ESTE NOMBRE YA ESTA REGISTRADO, ELIGE OTRO");
			return false;
		}else {
			System.out.println("ESTE NOMBRE NO ESTA REGISTRADO");
			return true;
		}
		
	}

	public static void inicarJuego() {
		//crear sentencia para poner nombre
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		System.out.println("BIENVENIDO ");
		while (opcion != 4) {
			System.out.println("INTRODUZCA UNA OPCION NUMÉRICA DE 1 A 3");
			System.out.println("1) INCIAR AVENTURA");
			System.out.println("2) VER LA PERSONA CON MAYOR PUNTUACIÓN");
			System.out.println("3) VER PUNTUACION GLOBAL");
			System.out.println("4) CERRAR SESION");

			opcion = CorrecionErrorInt.getInstance().correcionDeErrores();
			if (opcion == 1) {
				Personaje.elecionPersonaje();
			} else if (opcion == 2) {
				try {
					Usuario.getInstance().buscarPorPuntuacionMasAlta();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (opcion == 3) {
				try {
					Usuario.getInstance().buscarPorPuntuacionMasAltaTOP();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (opcion == 4) {
				System.out.println("CIERRE DE SESION CORRECTO EN TU CUENTA");
				Menu.menu();
			} else {
				System.out.println("OPCION INCORRECTA \n");
			}
		}

	}
	public static void creditos() {
		System.out.println("Este es el final de la aventura, pero todavia queda mucho mas");
		System.out.println("VOLVIENDO AL MENU");
		Menu.inicarJuego();
		
	}
}
