package model;

import java.util.Scanner;

public class Economia extends Personaje {
	private String[] productos = { "1. Trigo ($50)", "2. Zanahoria ($50)", "3. Algodón ($50)",
			"4. Colección de piedras ($50)", "5. Colección de plantas ($50)", "6. Colección de pescados ($50)",
			"7. Anillo de boda ($50)", "8. Ramo de flores ($50)", "9. Billete de ida a la ciudad ($50)", "10. Salir" };
	private int[] inventario = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	private int[] precios = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 0 };
	private int dinero = 50;
	private static Economia instance = null;

	// Patron SingleTon
	public static Economia getInstance() {
		if (instance == null) {
			instance = new Economia();
		}

		return instance;
	}

	public Economia() {

	}

	public String getProducto(int i) {
		if (i < 0 || i >= productos.length) {
			throw new IllegalArgumentException("Índice de producto fuera de rango");
		}
		return productos[i];
	}

	public void setProducto(int i, String producto) {
		if (i < 0 || i >= productos.length) {
			throw new IllegalArgumentException("Índice de producto fuera de rango");
		}
		productos[i] = producto;
	}

	public int getInventario(int i) {
		if (i < 0 || i >= inventario.length) {
			throw new IllegalArgumentException("Índice de inventario fuera de rango");
		}
		return inventario[i];
	}

	public void setInventario(int i, int cantidad) {
		if (i < 0 || i >= inventario.length) {
			throw new IllegalArgumentException("Índice de inventario fuera de rango");
		}
		inventario[i] = cantidad;
	}

	public int getPrecio(int i) {
		if (i < 0 || i >= precios.length) {
			throw new IllegalArgumentException("Índice de precio fuera de rango");
		}
		return precios[i];
	}

	public void setPrecio(int i, int precio) {
		if (i < 0 || i >= precios.length) {
			throw new IllegalArgumentException("Índice de precio fuera de rango");
		}
		precios[i] = precio;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public void Tienda() {
		Scanner scanner = new Scanner(System.in);
		boolean continuar = true;
		while (continuar) {
			System.out.println("Tendera 🙋: Hola bienvenido de vuelta a mi tienda, ¿Que deseas comprar hoy?");
			System.out.println("--- MENÚ DE TIENDA ---");
			System.out.println("1. Comprar producto");
			System.out.println("2. Consultar monedero");
			System.out.println("3. Salir");
			System.out.print("Selecciona una opción: ");
			int opcion = scanner.nextInt();

			switch (opcion) {
			// Mostrar tienda
			case 1:

				Economia.getInstance().mostrarTienda();
				Economia.getInstance().selecionarProducto();

				// Seleccionar numero del producto

				break;

			case 2:
				Economia.getInstance().verDinero();
				break;

			case 3:
				continuar = false;
				System.out.println("Tendera 🙆‍♀️:¡Gracias por visitar la tienda! Hasta luego.");
				break;

			default:
				System.out.println("Opción no válida. Intenta nuevamente.");
			}

		}

	}

	public void mostrarTienda() {

		System.out.println("Tendera 🤷‍♀️:¿Qué producto deseas comprar?");
		for (int i = 0; i < productos.length; i++) {
			System.out.println(productos[i]);
		}
	}

	public void selecionarProducto() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Selecciona el número del producto: ");
		int productoSeleccionado = scanner.nextInt();
		if (productoSeleccionado > 0 && productoSeleccionado <= productos.length) {
			int precio = precios[productoSeleccionado - 1];
			if (dinero >= precio) {
				dinero -= precio;
				System.out.println("Has comprado " + productos[productoSeleccionado - 1] + ". Nuevo saldo: $" + dinero);
				inventario[productoSeleccionado-1] =1;
			} else {
				System.out.println("No tienes suficiente saldo en el monedero.");
			}
		} else {
			System.out.println("Selección inválida.");
		}
		Economia.getInstance().revisionItems();
	}

	public void verDinero() {
		System.out.println("Saldo actual en el monedero: $" + dinero);
	}

	public void añadirDinero(int dineroIma) {
		dinero = dinero + dineroIma;
	}

	public void comprobacionTrigo() {
		if (Economia.getInstance().getInventario(0) == 0) {
			System.out.println(
					"se te olvido comprar el trigo, no pasa nada esta vez invito yo por ser tu primer dia,\n no queremos que te estanques el primer dia, te lo descuento de la cuenta");
			dinero -= 50;
		}

	}
	
	public void revisionItems() {
		if(Economia.getInstance().getInventario(8)==1) {
			Finales.finalRevision(2);
		}else if(Economia.getInstance().getInventario(3)==1 && Economia.getInstance().getInventario(4)==1 && Economia.getInstance().getInventario(5)==1) {
			Finales.finalRevision(6);
		}
	}
	
	
}
