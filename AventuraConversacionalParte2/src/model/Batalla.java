package model;

import java.util.Random;


public class Batalla {

	public static void iniciarBatalla(Personaje personaje, Personaje enemigo, int numero) {
		Random random = new Random();
		
		int penalizacion =Escenario.elegirEscenarioAleatoreamiente(numero);
		boolean turnoProtagonista = random.nextBoolean();
		System.out.println("¡Comienza la batalla entre " + personaje.getNombre() + " y " + enemigo.getNombre() + "!");
		System.out.println(turnoProtagonista ? personaje.getNombre() + " tiene el primer turno."
				: enemigo.getNombre() + " tiene el primer turno.");

		while (personaje.getVida() > 0 && enemigo.getVida() > 0) {
			if (turnoProtagonista) {

				System.out.println("Turno de " + personaje + ":");
				Batalla.ejecutarAtaque(true, personaje, enemigo, penalizacion);
				

			} else {

				System.out.println("Turno de " + enemigo.getNombre() + ":");
				Batalla.ejecutarAtaque(false,enemigo, personaje, 0);
			}

			System.out.println("Estado actual:");
			personaje.imprimirPersonaje();
			enemigo.imprimirPersonaje();

			turnoProtagonista = !turnoProtagonista;
		}

		if (personaje.getVida() > 0) {
			System.out.println("¡" + personaje.getNombre() + " ha ganado la batalla!");

		} else {
			System.out.println("¡" + enemigo.getNombre() + " ha ganado la batalla!");
			personaje.setVida(0);
			System.out.println("Falleces tras el combate, pierdes");
			Finales.finalRevision(1);
		}
	

	}

	public static int ejecutarAtaque(boolean esJugador, Personaje atacante, Personaje victima, int penalizacion) {
		int indiceAtaque;
		Random random = new Random();
		
		if (esJugador) {

			System.out.println("Selecciona tu ataque:");
			for (int i = 0; i < atacante.getAtaques().length; i++) {
				System.out.println((i + 1) + ": " + atacante.getAtaqueIndice(i) + " (Daño: "
						+ atacante.getDanoAtaqueIndice(i) + ")");
			}
			System.out.print("Introduce 1, 2 o 3: ");
			indiceAtaque = CorrecionErrorInt.getInstance().correcionDeErrores() - 1;

			while (indiceAtaque < 0 || indiceAtaque >= atacante.getAtaques().length) {
				System.out.print("Selección inválida. Introduce 1, 2 o 3: ");
				indiceAtaque = CorrecionErrorInt.getInstance().correcionDeErrores() - 1;
			}
		} else {

			indiceAtaque = random.nextInt(atacante.getAtaques().length);
		}

		String ataque = atacante.getAtaqueIndice(indiceAtaque);
		int daño = atacante.getDanoAtaqueIndice(indiceAtaque)-penalizacion; //aqui penalizacion ataque;

		int resultado = random.nextInt(3);
		System.out.println(atacante.getNombre() + " usa " + ataque + "!");

		switch (resultado) {
		case 0:

			System.out.println("¡Impacto total! " + victima.getNombre() + " pierde " + daño + " puntos de vida.");
			victima.setVida(victima.getVida() - daño);
			break;
		case 1:

			int dañoDisipado = daño / 2;
			System.out.println("¡Impacto parcial! " + victima.getNombre() + " se cubre y pierde " + dañoDisipado
					+ " puntos de vida.");
			victima.setVida(victima.getVida() - dañoDisipado);
			break;
		case 2:

			System.out.println("¡El ataque fue esquivado! " + victima.getNombre() + " no pierde puntos de vida.");
			break;
		}

	

		return victima.getVida();
	}

}
