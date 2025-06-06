package model;


public class Granjero extends Personaje {

	public Granjero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Granjero(String nombre, int vida, int vidaMax, String[] ataques, int[] danoAtaques) {
		super(nombre, vida, vidaMax, ataques, danoAtaques);
		// TODO Auto-generated constructor stub
	}

	public static Granjero personajeGranjero() {

		Granjero granjero = new Granjero("Granjero", 100, 100,
				new String[] { "golde de Azada", "Semillazos", "dar rabano" }, new int[] { 30, 20, -20 });

		return granjero;
	}

	public static Personaje enemigo() {
		Personaje enemigo = new Personaje("pajaro", 100, 100, new String[] { "picotazo", "aletazo", "cagada" },
				new int[] { 20, 25, 10 });

		return enemigo;
	}

	public static void iniciarAventuraGranjero() {
		Economia.resetInstance();
		Personaje enemigoPer = Granjero.enemigo();
		Granjero granjeroPer = Granjero.personajeGranjero();
		granjeroPer.imprimirPersonaje();
		System.out.println(
				"Como granjero deberas cultivar y ganar todo el dinero que puedas para conseguir la meta de dinero en menos de dos dias, \no en su defecto completar el centro civico con las colecciones o mudarte a la ciudad con el billete, solo asi podras ganar el juego");
		System.out.println(
				"si mueres, pierdes. Como estas en primavera los cultivos que creecen en esta epoca es el trigo, deberias comprar el trigo para plantarlo, \nve a la tienda y dile a la tendera que quieres...");
		System.out.println("*vas a la tienda a comprar*");
		Economia.getInstance().Tienda();
		Economia.getInstance().comprobacionTrigo();
		granjeroPer.primeraMisionGranjero();
		Economia.getInstance().verDinero();
		granjeroPer.misionCultivar();
		granjeroPer.misionMadre();
		granjeroPer.ovejitas();
		granjeroPer.misionZanahorias();
		Batalla.iniciarBatalla(granjeroPer, enemigoPer,2);
		granjeroPer.misionTractor();
		Economia.getInstance().Tienda();
		Finales.revisionFinalesEstadisticas();
	}

	public void primeraMisionGranjero() {

		

		System.out.println(
				"ahora es hora de plantar, sin embargo hay un problema, \ntu vecino te cogio la azada prestada, deberas ir a convencerle de que te la devuelva");
		System.out.println("*te dirijes a casa de tu vecino tocandole la puerta y este abria la puerta al rato*");
		System.out.println("hola vecino ¿Que deseas🧑‍🦳?");
		System.out.println("1:disculpa vecino, ¿Tienes mi azada todavia?");
		System.out.println("2:como no me devuelvas la azada te prendo fuego toda la casa");
		System.out.println("3:no, nada (me gastare 50 en una azada nueva)");
		int opcion = CorrecionErrorInt.getInstance().correcionDeErrores();
		switch (opcion) {

		case 1:
			System.out.println("si claro vecino, aqui la tienes... *recibes tu azada de vuelta*");
			break;
		case 2:
			System.out.println(
					"*el vecino cabreado te devolveria la azada en la caveza bajandote la vida 25 puntos de vida, te queda 75");
			this.setVida(getVida() - 25);
			break;
		case 3:
			System.out.println("esta bien, hasta otra vecino *pierdes 50 en comprarte una azada nueva*");
			Economia.getInstance().añadirDinero(-50);
			break;
		default:
			System.out.println(
					"Como no elegiste ninguna opción de las presentes y eres antisocial, \ndecides comprar una azada");
		}
	}

	public void misionCultivar() {

		int opcion = 0;
		

		System.out.println("ahora que vuelves a tener azada puedes empezar a cultivar, aqui tienes las instrucciones:");
		System.out.println("-Primer paso arar la tierra");
		System.out.println("-Segundo paso plantar las semillas");
		System.out.println("-Tercer paso regar la tierra");
		System.out
				.println("Es importante aclarar que cualquier opcion que no sea en este orden estropearan el cultivo");
		System.out.println("¿Entendido? ¡Pues a plantar!");
		System.out.println("1:plantar semillas");
		System.out.println("2:regar la tierra");
		System.out.println("3:arar la tierra");
		opcion = CorrecionErrorInt.getInstance().correcionDeErrores();
		if (opcion == 3) {
			System.out.println("*aras la tierra en el orden correcto");
			System.out.println("1:plantar semillas");
			System.out.println("2:regar la tierra");
			System.out.println("3:arar la tierra");
			opcion = CorrecionErrorInt.getInstance().correcionDeErrores();
			if (opcion == 1) {
				System.out.println("*Despues de arar colocas cuidadosamente las semillas de trigo");
				System.out.println("1:plantar semillas");
				System.out.println("2:regar la tierra");
				System.out.println("3:arar la tierra");
				opcion = CorrecionErrorInt.getInstance().correcionDeErrores();
				if (opcion == 2) {
					System.out.println("terminas de plantar el trigo al regarlo, ganando $100");
					Economia.getInstance().añadirDinero(100);
					Usuario.getInstance().darPuntuacion(50);
				
				} else {
					System.out.println("*estropeaste el cultivo, no ganas dinero*");
				}
			} else {
				System.out.println("*estropeaste el cultivo, no ganas dinero*");
			}

		} else {
			System.out.println("*estropeaste el cultivo, no ganas dinero*");
		}
	}

	public void misionMadre() {

		int opcion = 0;
		

		System.out.println(
				"-Hola hijo, ¿Que tal tu vida por el Campo?, espero que muy bien, \ncomo siempre con mis cartas viene la paga de tu abuela, sin embargo esta vez prefiero complicarte las cosas un poco, solo te mandare el dinero en el caso de que aciertes este acertijo... ");
		System.out.println(
				"\"Nunca soy, pero siempre seré. Nadie me ha visto jamás, pero todos saben que existo. ¿Qué soy?\"");
		System.out.println("1. El orden");
		System.out.println("2. El mañana");
		System.out.println("3. El silencio");
		opcion = CorrecionErrorInt.getInstance().correcionDeErrores();
		if (opcion == 2) {
			System.out.println("*acertas el acertijo ganandote $50*");
			Economia.getInstance().añadirDinero(50);
			Usuario.getInstance().darPuntuacion(50);
			
		} else {
			System.out.println("*fallas el acertijo perdiendo el dinero de tu paga*");

		}
	}

	public void ovejitas() {

		int opcion = 0;
		

		System.out.println(
				"*tras mandarle la carta de respuesta a tu madre te vas a dormir tras ese dia largo, metiendote en la cama listo para contar ovejitas*");
		System.out.println("*una ovejita mas otra ovejita son...");
		opcion = CorrecionErrorInt.getInstance().correcionDeErrores();
		if (opcion == 2) {
			System.out.println(" y ∫ " + "(1+ln(x)/" + "xsin(x))" + " dx ¿Cuantas ovejitas son?");
			System.out.println("1. 10");
			System.out.println("2. 37");
			System.out.println("3. 5");
			opcion = CorrecionErrorInt.getInstance().correcionDeErrores();
			if (opcion == 1) {
				System.out.println("*consigues dormirte con exito");
				Usuario.getInstance().darPuntuacion(10);
				
			} else {
				System.out.println("*eran 10 ovejitas, duermes mal por lo que se te baja la vida*");
				this.setVida(getVida() - 20);
			}
		} else {
			System.out.println("*eran 2 ovejitas, duermes mal por lo que se te baja la vida*");
			this.setVida(getVida() - 20);
		}
	}

	public void misionZanahorias() {

		System.out.println(
				"*Pasa el dia y vas a la tienda a comprar, como ya esta empezando verano comprar zanahorias es lo que mas dinero te daria");
		Economia.getInstance().Tienda();
		System.out.println(
				"*al volver a tu campo a plantar te encuentras con unos pajaros que estan estropeando tus cultivos, decides armarte e ir a combatirlos*");
	}

	public void misionTractor() {

		int opcion = 0;
		

		System.out.println(
				"*tras la ardua pelea decides tomarte un descanso de la plantacion, pues tu campo habia sido arrollado por la epica pelea \nentre el mamifero y el oviparo, por lo que sigues trabajando en tus otros planes como seria modificar tu tractor*");
		System.out.println("*vas al corral donde lo tienes y empiezas a modificarlo a tu gusto*");
		System.out.println("¿Que color le pones al tractor?");
		System.out.println("1.rojo");
		System.out.println("2.verde");
		System.out.println("3.amarillo");
		String Colortractor = "descolorido";
		String ruedastractor = "rotas";

		opcion = CorrecionErrorInt.getInstance().correcionDeErrores();
		if (opcion == 1) {
			System.out.println("*pintas el cambion de color rojo*");
			Colortractor = "rojo";
		}
		if (opcion == 2) {
			System.out.println("*pintas el cambion de color verde*");
			Colortractor = "verde";
		}
		if (opcion == 3) {
			System.out.println("*YO TENGO UN TRACTOR AMARILLOOOO*");
			Colortractor = "amarillo";
		} else {
			System.out.println("eso no es un color");
		}

		System.out.println("¿Que ruedas quieres para tu tractor?");
		System.out.println("1. Ruedas grandes");
		System.out.println("2. Ruedas pequeñas");

		opcion = CorrecionErrorInt.getInstance().correcionDeErrores();
		if (opcion == 1) {
			System.out.println("*Le colocas ruedas grandes a tu tractor*");
			ruedastractor = "grandes";
		}
		if (opcion == 2) {
			System.out.println("*Le colocas ruedas pequeñas a tu tractor*");
			ruedastractor = "pequeñas";

		} else {
			System.out.println("eso no es un tamaño");
		}

		System.out.println("*Terminas de modificar tu tractor, observando el precioso tractor de color " + Colortractor
				+ " con sus ruedas " + ruedastractor);
		System.out.println(
				"*por ultimo decides pasarte una vez mas por la tienda para ver cuantos ahorros tienes o si puedes comprarte algo chulo*");
		System.out.println("*si alcanzaste $150 al salir de la tienda ganaras con el final financiero");

	}

}
