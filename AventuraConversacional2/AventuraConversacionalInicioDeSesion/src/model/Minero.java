package model;

import java.util.Scanner;

public class Minero extends Personaje {

	public Minero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Minero(String nombre, int vida, int vidaMax, String[] ataques, int[] danoAtaques) {
		super(nombre, vida, vidaMax, ataques, danoAtaques);
		// TODO Auto-generated constructor stub
	}

	public static Minero personajeMinero() {
		
		
		Minero minero = new Minero("Minero",150,150,new String[] { "Martillo Pesado", "Explotar dinamita", "Luz cegadora de la linterna" },
	            new int[] { 25, 40, 10 });
		
		return minero;
	}
	
	public static Personaje enemigo() {
		Personaje enemigo = new Personaje("rata",100,100,new String[] { "Mordisco", "Cavar para sorprender", "Arañar" },
	            new int[] { 15, 25, 35 });
		
		return enemigo;
	}
	public static void iniciarAventuraMinero() {
		Personaje rata=Minero.enemigo();
		Minero mineroProt=Minero.personajeMinero();
		mineroProt.imprimirPersonaje();
		 System.out.println("Has seleccionado: Minero");
         System.out.println("Como minero deberás excavar y recolectar recursos valiosos. Para ganar deberás obtener piedra luminosa, llegar al final del nivel 2 de la mina o salir con una pepita de oro.");
         mineroProt.inicioPelea();
         Batalla.iniciarBatalla(mineroProt, rata);
         mineroProt.buscaTesoros();
         mineroProt.misionEsqueletoMinero();
         mineroProt.finalMina1();
		
	}
	
	public void inicioPelea() {
		 System.out.println("Regresas a tu mina y decides comenzar a excavar.");
         System.out.println("Excavas profundamente y te enfrentas a la rata que acecha el túnel.");
	}
	
	public void buscaTesoros() {
		
		Scanner sc = new Scanner(System.in);
		 int contestar =0;
		System.out.println("Después de la batalla, decides continuar excavando en busca de tesoros.");
        System.out.println("Mientras excavas llegas al primer nivel, donde hay un vendedor un tanto misterioso");
        System.out.println("Vendedor misterioso 👤: Hola minero, ¿te gustaría tomar esta poción?, con ella podrás ver con más claridad");
        System.out.println("1. CLARO");
        System.out.println("2. NO GRACIAS");
         contestar = sc.nextInt();
        while (contestar != 1 && contestar != 2) {
			System.out.println("Opción invalida, introduce 1 si quieres la poción o 2 si no la quieres.");
			
			contestar = sc.nextInt();
        }
		if (contestar == 1) {
			System.out.println("¡El vendedor te la ha jugado!");
			System.out.println("La poción ha hecho que te quedes inconsciente y te ha quitado $50 del monedero");
			Economia.getInstance().añadirDinero(-50);	
			System.out.println("Tu monedero tiene $" +Economia.getInstance().getDinero());
		} else {
			System.out.println("Has sido astuto ya que la poción tendría algun efecto secundario");
		}
	}
	
	
	public void misionEsqueletoMinero() {
		Scanner sc = new Scanner(System.in);
		int actua =0;
		
		System.out.println("Te encuentras un esqueleto el cual era un antiguo minero");
		System.out.println("Tiene en su mano una nota la cual dice:");
		System.out.println("A quien lea esto, he escondido una pepita de oro en la mina. Recuerda:");
		System.out.println("La pepita de oro se encuentra en la caja con una cruz.");
		System.out.println("Recuerda esta dirección para más adelante");
		System.out.println("De repente te encuentras un murciégalo y tienes que actuar rapido, ¿qué haces?");
		System.out.println("1. Esquivar");
		System.out.println("2. Cubrirte");
		 actua = sc.nextInt();
		while (actua != 1 && actua != 2) {
			System.out.println("Opción invalida, introduce 1 si quieres esquivar o 2 si quieres cubrirte");
			
			actua = sc.nextInt();
		} if (actua == 1) {
			System.out.println("¡Bien hecho!, el murciégalo sigue su camino y no os habeis enfrentado");
		 
		} else {
			System.out.println("El murciégalo te ha mordido y te ha quitado 10 de vida.");
			this.setVida(getVida()-10);
			
			System.out.println("Tienes " + this.getVida() + " de vida.");
			if (this.getVida() <= 0) {
			System.out.println("Te han quitado toda la vida, pierdes");
			 Finales.finalRevision(1);
			}
		}
	}
	
	public void finalMina1() {
		
		Scanner sc = new Scanner(System.in);
		int caja = 0;
		
		System.out.println("Llegas al final del nivel 1 de la mina y te encuentras un 2x2 de cajas.");
		System.out.println("");
		System.out.println("—————————— ");
		System.out.println("| ❌ | ☠ |");
		System.out.println("—————————— ");
		System.out.println("| 💲  | 💉 |");
		System.out.println("—————————— ");
		System.out.println("Piensas que en una de las cajas podría estar la pepita de oro que el esqueleto decía en la nota");
		System.out.println("Que caja eliges:");
		System.out.println("1. Caja superior izquierda");
		System.out.println("2. Caja inferior izquierda");
		System.out.println("3. Caja superior derecha");
		System.out.println("4. Caja inferior derecha");
		
		 caja = sc.nextInt();
		
		while (caja < 1 || caja > 4) {
			System.out.println(
					"Opción inválida, introduce entre 1 y 4 para elegir una caja");

			caja = sc.nextInt();
		}
		switch (caja) {

		case 1:

			System.out.println("!Encontraste la pepita de oro¡, ganaste.");
			 Finales.finalRevision(7);
			break;
		case 2:
			
			System.out.println("!Hay $50¡");
			Economia.getInstance().añadirDinero(50);
			break;
		case 3:
			
			System.out.println("Metes la mano en la caja y había una araña y te pica, pierdes 10 de vida");
			this.setVida(getVida()-10);
			System.out.println("Tienes" + this.getVida() + " de vida.");
			if (this.getVida() <= 0) {
    			System.out.println("Te han quitado toda la vida, pierdes");
    			 Finales.finalRevision(1);
    			}
			break;
		case 4:
			
			System.out.println("Te encuentras una venda que te cura 30 de vida");
			this.setVida(getVida()+30);
			break;
		}
	}
	
	public void nivelMina2() {
		
		Scanner sc = new Scanner(System.in);
		int subes = 0;
		
		System.out.println("¿Subes al piso 2 de la mina?");
		System.out.println("1. SI");
		System.out.println("2. NO");
		
		 subes = sc.nextInt();
		
		while (subes != 1 && subes != 2) {
			System.out.println("Elige entre si o no");
			
			subes = sc.nextInt();
		}
		if (subes == 1) {
			System.out.println("¡Perfecto!");
		} else {
			System.out.println("Intentas salir de la mina pero la entrada se ha derrumbado asi que no te queda otra que subir.");
		}
		
		Minero.mensaje1Nivel2();
		
		int pepi = sc.nextInt();
		
		while (pepi != 1 && pepi != 2) {
			System.out.println("Elige una opción");
			
			pepi = sc.nextInt();
		}
		if (pepi == 1) {
			System.out.println("Picas hasta salir fuera de la mina");
			System.out.println("Te llevas la priedra luminosa, ganaste");
			Finales.finalRevision(8);
		} else {
			Minero.mensaje2Nivel2();
			int esca = sc.nextInt();
			if (esca == 3) {
				Minero.mensaje3Nivel2();
				esca = sc.nextInt();
				if (esca == 1) {
					Minero.mensaje4Nivel2();					
					esca = sc.nextInt();
					if (esca == 2) {
						System.out.println("bien ahora sal de la mina");
						System.out.println("saliste de la mina, ganaste");
						Finales.finalRevision(9);
					} else {
						System.out.println("te tropiezas y te caes, pierdes");
						Finales.finalRevision(10);
					}
				} else {
					System.out.println("te tropiezas y te caes, pierdes");
					Finales.finalRevision(10);
				}

			} else {
				System.out.println("te tropiezas y te caes, pierdes");
				Finales.finalRevision(10);
			}
		}
	}
	
	public static void mensaje1Nivel2() {
		System.out.println("Nada más subir te encuentras un minero picando");
		System.out.println("Minero picando ⛏: ¿Me relevas?, tengo que salir fuera de la mina");
		System.out.println("Lo relevas y nada más empezar te encuentras una piedra luminosa, ¿qué haces?");
		System.out.println("1. Te la guardas en el bolsillo");
		System.out.println("2. Te la tragas");
	}
	
	public static void mensaje2Nivel2() {
		System.out.println("Te tragas la pepita de oro pero ya no la puedes sacar");
		System.out.println("Vas camino hasta el final del nivel 2, donde hay una salida de la mina");
		System.out.println("Tienes que subir por unas escaleras de mano para salir");
		System.out.println("aqui tienes las instrucciones de como subir la escalera de mano:");
		System.out.println("-Primer paso agarrarte con las manos a la escalera");
		System.out.println("-Segundo paso poner los pies en el escalon de la escalera");
		System.out.println("-Tercer paso mirar hacia arriba y subir");
		System.out.println("Es importante aclarar que cualquier opcion que no sea en este orden estropeara la subida");
		System.out.println("¿Entendido? ¡Pues empecemos!");
		System.out.println("1:agarrarte con las manos a la escalera");
		System.out.println("2:poner los pies en el escalon de la escalera");
		System.out.println("3:mirar hacia arriba y subir");
	}
	
	public static void mensaje3Nivel2() {
		System.out.println("vas por buen camino");
		System.out.println("1:agarrarte con las manos a la escalera");
		System.out.println("2:poner los pies en el escalon de la escalera");
		System.out.println("3:mirar hacia arriba y subir");
	}
	
	public static void mensaje4Nivel2() {
		System.out.println("vamos no te queda nada");
		System.out.println("1:agarrarte con las manos a la escalera");
		System.out.println("2:poner los pies en el escalon de la escalera");
		System.out.println("3:mirar hacia arriba y subir");
	
}
}