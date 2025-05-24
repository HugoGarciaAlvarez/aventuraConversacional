package controller;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// VARIABLES

		String clave = "";

		String personajes[] = { "Carmela", "Paco", "Matias" };
		String personajesCarmela[] = { "Mohamed", "Moshé", "Yosef" };

		int moneda = 0;
		// CARMELA//
		int vida = 100;
		int vidaMax = vida;
		int AtaqueNormal = 0;
		int GolpEdeSuerte = 0;
		int PactoDemonio = 0;
		int suerte = 0;
		// FIN CARMELA//
		// Bandido//
		int vidaBandido = 100;
		int vidaBandidoMax = vidaBandido;
		int escudo = 50;
		int GolpeNormal = suerte(10, 20);
		int GolpeSuperior = suerte(10, 50);

		int accionEnemiga = 0;
		// Fin Bandido//

		// DIOS//
		int vidaDios = 1000;
		int vidaDiosMax = vidaDios;
		int GolpeDeDios = 0;
		int ataqueDiosSuperior = 0;
		int ataqueSupremo = 0;
		int escudoDiosAngelical = 1000;

		// FIN DE DIOS//

		// PACO//
		int seguimientoPaco = 0;
		int respuestaMatematica = 0;
		int contadorMatematico = 0;
		int interaccionPersonajes = 0;

		int manotazo = 0;
		int pocionVeneno = 0;
		int cableTrampa = 0;
		int equipoDaño = 0;
		// FIN PACO//
		// Alien//
		int vidaAlien = 100;
		int VidaAlienMax = vidaAlien;

		// Fin alien//

		// MATIAS//

		int accionMatias = 0;
		String accionMatiasEscribir = "";
		int seguimientoMatias = 0;
		int Hostion = 0;
		int PatadaLigera = 0;
		int GolpeMarcial = 0;
		int contadorGolpeMarcial = 0;
		// FIN MATIAS//
		// EnemigoMatias//
		int vidaEnemigoMatias = 150;
		int vidaEnemigoMatiasMax = vidaEnemigoMatias;
		// Fin EnemigoMatias//
		int eleccionPersonaje = 0;
		String nombrePersonaje = "";
		int accion = 0;
		int accionCombate = 0;
		int respuesta = 0;
		String acertijo = "";
		int acertijoNumeros = 0;
		int SeguimientoRuta = 0;
		int final1 = 0;
		int Cucaracha = 0;
		int CucarachaMax = 25;

		System.out.println("VIAJES EN EL TIEMPO");

		System.out.println("Creado por:");

		System.out.println("HUGO GARCÍA ÁLVAREZ");
		System.out.println("ALEJANDRO GARCÍA ÁLVAREZ");
		System.out.println("SERGIO MATESANZ");

		System.out.println("Introduce la clave para continuar");

		clave = sc.nextLine();

		while (!clave.equalsIgnoreCase("jugones")) {

			System.out.println("Mal introduce de nuevo la contraseña");

			clave = sc.nextLine();
		}

		/* AQUI EMPIEZA LA SELECCION DE PERSONAJES */

		System.out.println(
				"Te doy la bienvenida a el multiverso de la locura antes de comenzar con tu aventura selecciona uno de estos tres personajes");

		for (int i = 0; i < personajes.length; i++) {
			System.out.println(i + 1 + ".  " + personajes[i]);
		}

		do {
			eleccionPersonaje = sc.nextInt();

			if (eleccionPersonaje == 1) {
				nombrePersonaje = personajes[0];
				System.out.println("Has seleccionado a " + nombrePersonaje);

			} else if (eleccionPersonaje == 2) {

				nombrePersonaje = personajes[1];
				System.out.println("Has seleccionado a " + nombrePersonaje);

			} else if (eleccionPersonaje == 3) {

				nombrePersonaje = personajes[2];
				System.out.println("Has seleccionado a " + nombrePersonaje);
			}

			if (eleccionPersonaje < 1 || eleccionPersonaje > 3) {
				System.out.println("mal introduce un numero del 1-3");

			}

		} while (eleccionPersonaje < 1 || eleccionPersonaje > 3);

		/* AQUI TERMINA LA SELECCION DEL PERSONAJE */
		System.out.println("Os dirigís hacia la máquina del tiempo, mama dijo que era mala idea jugar con la máquina");
		System.out.println("'Tocamos la máquina y cuando nos dimos cuenta ya no estabamos en el laboratorio'");
		System.out.println("'Cuando recupere la visión me di cuenta de que estaba en...'");

		/* AQUI EMPIEZA CARMELA */
		if (eleccionPersonaje == 1) {
			System.out.println(
					"Te encuentras en un lugar desconocido, das vueltas a tu alrededor, observas que es un lugar desertico y sin vida");
			System.out.println("Observas una aldea a la lejania, decides acercarte");

			System.out.println("¿Quieres preguntar? (elige 1 o 2 ) ");
			System.out.println("1) Si");
			System.out.println("2) No");

			accion = sc.nextInt();

			while (accion != 1 && accion != 2) {
				System.out.println("Respuesta mal introducida");
				System.out.println("1) Si");
				System.out.println("2) No");
				accion = sc.nextInt();
			}

			if (accion == 1) {
				do {
					System.out.println("Te acercas a preguntar y se te presentan tres personajes ");

					System.out.println("Pregunta a uno de estos tres ");
					for (int i = 0; i < personajesCarmela.length; i++) {
						System.out.println(i + 1 + ".  " + personajesCarmela[i]);
					}
					respuesta = sc.nextInt();
					if(respuesta != 1 && respuesta != 2 && respuesta != 3) {
						System.out.println("Respuesta mal introducida");
					}
				} while (respuesta != 1 && respuesta != 2 && respuesta != 3);

				if (respuesta == 1 || respuesta == 2 || respuesta == 3) {
					System.out.println("'Donde estoy'");
					System.out.println(personajesCarmela[respuesta - 1] + ": ستجد نفسك في القدس (Estas en Jerusalen)");
					System.out.println(personajesCarmela[respuesta - 1]
							+ "توجه نحو روما، وسوف يساعدونك هناك (Marcha hacia roma ahi te ayudaran)");
					SeguimientoRuta = 1;
				}

			} else if (accion == 2) {

				System.out.println("No quisiste socializar por lo que te adentras por una ubicación desconocida");
				System.out.println("Por curiosidad de la vida acabas en un campamento bandido");
				System.out.println("Quieres enfrentarte a ellos, puede que te quieran matar sin razón  (elige 1 o 2)");
				System.out.println("1) Si");
				System.out.println("2) No");

				respuesta = sc.nextInt();

				if (respuesta == 1) {
					System.out.println("Luchas contra los bandidos");

					// AQUI HAY UN COMBATE//

					System.out.println("Se lanza la moneda");
					moneda = suerte(1, 2);
					if (moneda == 1) { // AQUI EMPIEZAS TU//
						System.out.println("Empiezas tu");
						do {
							do {
								System.out.println("1) Ataque normal");
								System.out.println("2) Golpe de suerte");
								System.out.println(
										"3) Suerte angelical(este habilidad lanza un ataque aleatorio entre  1 a 3 posibilidades)");

								if (vida > 0) {
									accionCombate = sc.nextInt();
								}

								if (accionCombate == 1 && vida > 0) {
									AtaqueNormal = suerte(10, 50);
									System.out.println(
											"Es un golpe normal, tampoco esperes tanto del él o no, pero tranquila, la suerte siempre te acompañara");
									if (escudo > 0) {
										System.out.println("El bandido se cubre con el escudo");
										escudo = escudo - AtaqueNormal;
										if (escudo <= 0) {
											escudo = 0;
										}
										System.out.println("Le quedan " + escudo + " puntos de vida al escudo");

									} else if (escudo <= 0) {
										vidaBandido = vidaBandido - AtaqueNormal;
										System.out.println("Le quitas " + AtaqueNormal + "puntos de vida al bandido");
										if (vidaBandido <= 0) {
											vidaBandido = 0;
										}
										System.out.println("le quedan" + vidaBandido + "/" + vidaBandidoMax);
									}

								} else if (accionCombate == 2 && vida > 0) {
									GolpEdeSuerte = suerte(10, 15);
									System.out.println("Tu suerte hace traspasar el escudo y le quitas " + GolpEdeSuerte
											+ " puntos de vida");
									vidaBandido = vidaBandido - GolpEdeSuerte;
									if (vidaBandido <= 0) {
										vidaBandido = 0;
									}
									System.out.println("le quedan" + vidaBandido + "/" + vidaBandidoMax);

								} else if (accionCombate == 3 && vida > 0) {

									suerte = suerte(1, 3);
									if (suerte == 1) {
										System.out.println("Fortuna:MUERE, MUERE, MUERE ");
										vidaBandido = 0;

									} else if (suerte == 2) {
										System.out.println("Fortuna: NO ME MERECES MORTAL, MUERE");
										vida = vida / 2;
										System.out.println("Te han quitado algunos puntos de vida" + vida);

										System.out.println("Te quedan " + vida);
									} else if (suerte == 3) {
										System.out.println("Fortuna: NO ME MERECES MORTAL, MUERE");
										vida = 0;
									}
								}

							} while (accionCombate != 1 && accionCombate != 2 && accionCombate != 3 || vida < 0);

							// LE TOCA AL BANDIDO//

							if (vidaBandido > 0) {
								System.out.println("Empieza el enemigo");
							}

							accionEnemiga = suerte(1, 3);

							if (accionEnemiga == 1 && vidaBandido > 0) {
								GolpeNormal = suerte(10, 20);
								System.out.println("Te pegan un puñetazo de " + GolpeNormal + " de daño");
								vida = vida - GolpeNormal;
								if (vida <= 0) {
									vida = 0;
								}
								System.out.println("Te han quitado " + GolpeNormal + " puntos de salud, te quedan "
										+ vida + "/" + vidaMax + "puntos de vida");
							} else if (accionEnemiga == 2 && vidaBandido > 0) {
								GolpeSuperior = suerte(10, 50);
								System.out.println("Cuidado, que esa navaja te pega la rabia (-" + GolpeSuperior + ")");
								vida = vida - GolpeSuperior;
								if (vida <= 0) {
									vida = 0;
								}
								System.out.println("Te han quitado " + GolpeSuperior + " puntos de salud, te quedan "
										+ vida + "/" + vidaMax + "puntos de vida");
							} else if (accionEnemiga == 3 && vidaBandido > 0) {
								System.out.println("El bandido encuentra algunas hierbas en el suelo y se las come");
								System.out.println("Ha recuperado 10 puntos de salud");
								vidaBandido += 10;
							}

							// TERMINA EL TURNO DEL BANDIDO//

						} while (suerte != 3 && vidaBandido != 0 && vida != 0); // Mueres tu o el bandido//

					}
					if (moneda == 2) { // AQUI EMPIEZA EL ENEMIGO//
						System.out.println("Empieza el bandido");
						do {

							if (vidaBandido > 0) {
								System.out.println("Empieza el enemigo");
							}

							accionEnemiga = suerte(1, 3);

							if (accionEnemiga == 1 && vidaBandido > 0) {
								GolpeNormal = suerte(10, 20);
								System.out.println("Te pegan un puñetazo de " + GolpeNormal + " de daño");
								vida = vida - GolpeNormal;
								if (vida <= 0) {
									vida = 0;
								}
								System.out.println("Te han quitado " + GolpeNormal + " puntos de salud, te quedan "
										+ vida + "/" + vidaMax + "puntos de vida");
							} else if (accionEnemiga == 2 && vidaBandido > 0) {
								GolpeSuperior = suerte(10, 50);
								System.out.println("Cuidado, que esa navaja te pega la rabia (-" + GolpeSuperior + ")");
								vida = vida - GolpeSuperior;
								if (vida <= 0) {
									vida = 0;
								}
								System.out.println("Te han quitado " + GolpeSuperior + " puntos de salud, te quedan "
										+ vida + "/" + vidaMax + "puntos de vida");
							} else if (accionEnemiga == 3 && vidaBandido > 0) {
								System.out.println("El bandido encuentra algunas hierbas en el suelo y se las come");
								System.out.println("Ha recuperado 10 puntos de salud");
								vidaBandido += 10;
							}
							// AQUI TERMINA//

							// AQUI EMPIEZAS TU//
							do {
								System.out.println("1) Ataque normal");
								System.out.println("2) Golpe de suerte");
								System.out.println(
										"3) Suerte angelical(este habilidad lanza un ataque aleatorio entre  1 a 3 posibilidades)");

								if (vida > 0) {
									accionCombate = sc.nextInt();
								}

								if (accionCombate == 1 && vida > 0) {
									AtaqueNormal = suerte(10, 50);
									System.out.println(
											"Es un golpe normal, tampoco esperes tanto del él o no, pero tranquila, la suerte siempre te acompañara");
									if (escudo > 0) {
										System.out.println("El bandido se cubre con el escudo");
										escudo = escudo - AtaqueNormal;
										if (escudo <= 0) {
											escudo = 0;
										}
										System.out.println("Le quedan " + escudo + " puntos de vida al escudo");

									} else if (escudo <= 0) {
										vidaBandido = vidaBandido - AtaqueNormal;
										System.out.println("Le quitas " + AtaqueNormal + "puntos de vida al bandido");
										if (vidaBandido <= 0) {
											vidaBandido = 0;
										}
										System.out.println("le quedan" + vidaBandido + "/" + vidaBandidoMax);
									}

								} else if (accionCombate == 2 && vida > 0) {
									GolpEdeSuerte = suerte(10, 15);
									System.out.println("Tu suerte hace traspasar el escudo y le quitas " + GolpEdeSuerte
											+ " puntos de vida");
									vidaBandido = vidaBandido - GolpEdeSuerte;
									if (vidaBandido <= 0) {
										vidaBandido = 0;
									}
									System.out.println("le quedan" + vidaBandido + "/" + vidaBandidoMax);

								} else if (accionCombate == 3 && vida > 0) {

									suerte = suerte(1, 3);
									if (suerte == 1) {
										System.out.println("Fortuna:MUERE, MUERE, MUERE ");
										vidaBandido = 0;

									} else if (suerte == 2) {
										System.out.println("Fortuna: NO ME MERECES MORTAL, MUERE");
										vida = vida / 2;
										System.out.println("Te han quitado algunos puntos de vida" + vida);

										System.out.println("Te quedan " + vida);
									} else if (suerte == 3) {
										System.out.println("Fortuna: NO ME MERECES MORTAL, MUERE");
										vida = 0;
									}
								}

							} while (accionCombate != 1 && accionCombate != 2 && accionCombate != 3 || vida < 0);
							// AQUI TERMINAS TU//

						} while (suerte != 3 && vidaBandido != 0 && vida != 0);

					}

					// AQUI TERMINA EL COMBATE//
					System.out.println("El campamentoe esta vacio");
					System.out.println("¿Quieres lutearlo?");
					System.out.println("1)Si");
					System.out.println("2)No");
					accion = sc.nextInt();

					do {
						if (accion == 1) {
							System.out.println(
									"Te encuentras un cofre pero tiene un candado,este cuenta con una convinación de numeros ");
							SeguimientoRuta = 1;

							do {

								System.out.println("Soy un numero de cuatro cifras ");
								System.out.println("Mi primera cifra es el doble de la ultima");
								System.out.println("La segunda cifra es un numero impar");
								System.out.println("La tercera cifra es el resultado de sumar la primera y la segunda");
								System.out.println("Si sumas todas mis cifras obtienes 16");
								acertijoNumeros = sc.nextInt();

								if (acertijoNumeros != 4372) {
									System.out.println("Te has equivocado intentalo de nuevo");
									System.out.println("pista:contiene un 4 y un 7");
								}

							} while (acertijoNumeros != 4372);

							System.out.println("Te encuentras un mapa y lo lees y sigues la ruta del mapa");

						} else if (accion == 2) {

							System.out.println("Te dejas de tonterias y te adentras por territorio desconocido");
							SeguimientoRuta = 1;

						}

					} while (accion != 1 && accion != 2);

				} else {
					System.out.println("Los bandidos te interceptaron, ven una presa facil");
					System.out.println("Mueres de una pedrada");
					final1 = 1;
				}

			}

			// HACÍA ROMA//

			if (SeguimientoRuta == 1) {
				System.out.println("##GENERANDO TERRENO ROMANO##");

				System.out.println(
						"Por casualidad de la vida, en la entrada esta Tontin y no te dejara pasar hasta que no aciertes un acertijo");

				System.out.println("Tontin: ");
				sc.nextLine();

				do {

					System.out.println(" Cinco más uno y quininetos te dará,querido amigo, una planta y no te miento");

					acertijo = sc.nextLine();

					if (!acertijo.equalsIgnoreCase("VID")) {
						System.out.println("Te equivocaste vuelve a intentarlo");
					}

				} while (!acertijo.equalsIgnoreCase("vid"));

			}

			if (acertijo.equalsIgnoreCase("VID")) {
				SeguimientoRuta = 2;
			}

			do {
				if (SeguimientoRuta == 2) {
					System.out.println("Empiezas a tener visiones entre cristianos y romanos, debes elegir un bando:");
					System.out.println("1)Cristianos");
					System.out.println("2)Romanos");
					System.out.println("3)Seguir con tu vida ");
					accion = sc.nextInt();
					if (accion == 1) {
						// Cristianos
						sc.nextLine();
						System.out.println("Antes de unirte a los cristianos debes resolver una adivinanza:");
						do {
							System.out.println(
									"¿Qué es algo pequeño como un grano de mostaza, pero puede crecer y llenar todo un jardín?");
							acertijo = sc.nextLine();

							if (!acertijo.equalsIgnoreCase("fe")) {
								System.out.println("Vuelve a intentarlo de nuevo hijo mio");
							}

						} while (!acertijo.equalsIgnoreCase("fe"));

						SeguimientoRuta = 3;

					} else if (accion == 2) {
						sc.nextLine();
						System.out.println("Antes de unirte a los romanos debes resolver una adivinanza");
						do {

							System.out.println(
									"Soy largo cuando soy joven y corto cuando soy viejo. Respiro sin pulmones, y mi alimento me consume. ¿Qué soy?");
							acertijo = sc.nextLine();

							if (!acertijo.equalsIgnoreCase("vela")) {
								System.out.println("Vuelve a intentarlo de nuevo futuro romano");
							}

						} while (!acertijo.equalsIgnoreCase("vela"));

						SeguimientoRuta = 4;
					} else if (accion == 3) {
						final1 = 2;
					}

				}
			} while (accion != 1 && accion != 2 && accion != 3);

			if (SeguimientoRuta == 3) { // SI ELIGES CRISTIANOS//
				System.out.println("Ves visiones de donde esta el HIJO DE DIOS");
				System.out.println("vas hacia su presencia ");
				System.out.println("Estas ante JESUS DE NAZARET HIJO DE DIOS");
				System.out.println("Quieres ayudarle");
				System.out.println("1)Si");
				System.out.println("2)No");
				accion = sc.nextInt();
				do {

					if (accion == 1) {
						System.out.println("Observas a los apostoles ");
						System.out
								.println("Tu suerte dice que hay un traidor entre ellos pero no logras identificarlos");
						System.out.println("El traidor Judas se escapa y le sigues hasta dejarlo sin salida");
						System.out.println("Es tu turno, por arriconarle");
						System.out.println(
								"Derrepente ves una sombra detras tuya, te giras y es Dios este te otorga una poderosa habilidad para este combate");
						System.out.println("'HAS RECIBIDO LA GRACÍA DIVINA'");
						System.out.println();

						do {

							System.out.println("1) GRACIA DIVINA");
							accion = sc.nextInt();
							if (accion != 1) {
								System.out.println("ES INEVITABLE");
							}
						} while (accion != 1);

						System.out.println(" NO NOS DEJES CAER EN EL MAL Y LÍBRANOS DEL MAL AMÉN");

						final1 = 3;

					} else if (accion == 2) {
						final1 = 4;

					}

				} while (accion != 1 && accion != 2);
			}

			if (SeguimientoRuta == 4) {
				System.out.println();
				System.out.println("Te unes al ejercito romano, se te invoca a una audiencia ante el emperador");
				System.out.println("Conoces al emperador");
				System.out.println("Hay tiranía, te obligan a tomar una decisión");
				System.out.println("Realmente quieres estar aqui");

				do {
					System.out.println("1) Si");
					System.out.println("2) No");
					accion = sc.nextInt();

					if (accion == 1) {
						final1 = 5;
					}

				} while (accion != 1 && accion != 2);

				if (accion == 2) {

					System.out
							.println("De un momento para otro, te ponen unos grilletes y te convierten en un esclavo");

					System.out.println();

					System.out.println("Una semana despues");

					System.out.println(

							"Estas en una celda esperando, tu compañero para matar el timepo, te propone una adivinanza");
					sc.nextLine();

					do {

						System.out.println(
								"A todos asusto, pero no soy nada. Sin carne ni hueso, ni sombra ni alma. Habito en la mente y no tengo calma");
						System.out.println("¿Quien soy?");
						acertijo = sc.nextLine();
						if (!acertijo.equalsIgnoreCase("diablo")) {
							System.out.println("Vuelve a intentarlo, tiene algo que ver con el demonio");
						}
					} while (!acertijo.equalsIgnoreCase("diablo"));
					// SEGUIMOS POR AQUI//

					System.out.println("El diablo esta de tu parte toma la decisión correcta");
					System.out.println(
							"Has obtenido una nueva habilidad ,está es muy poderosa descubriras el poder de esta en tu proximo combate");
					System.out.println();
					System.out.println("Una semana despues ");
					System.out.println(
							"Esclavos hoy es el día que dareis vuestra alma por Roma ,destruyendo la plaga del cristianismo como la primera fila en combate,os encargareis del hijo de Dios.Estareis junto al equipo de elite ");
					System.out.println("Es momento del combate ");
					System.out.println("Empieza el Hijo de Dios como ser superior");
					// PELEA DE DIOS
					do {

						if (vidaDios > 0) {
							System.out.println("Es el turno del Hijo de Dios como ser superior");
						}

						accionEnemiga = suerte(1, 3);

						if (accionEnemiga == 1 && vidaDios > 0) {
							GolpeDeDios = suerte(10, 20);
							System.out.println("Te pegan un puñetazo divino de " + GolpeDeDios + " puntos de daño");
							vida = vida - GolpeDeDios;
							if (vida <= 0) {
								vida = 0;
							}
							System.out.println("Te han quitado " + GolpeDeDios + " puntos de salud, te quedan " + vida
									+ "/" + vidaMax + "puntos de vida");
						}
						if (accionEnemiga == 2 && vidaDios > 0) {
							ataqueDiosSuperior = suerte(10, 50);
							System.out.println("Dios lanza un ataque muy poderoso te quita " + ataqueDiosSuperior
									+ " puntos de vida ");
							vida = vida - ataqueDiosSuperior;
							if (vida <= 0) {
								vida = 0;
							}
							System.out.println("Te han quitado " + ataqueDiosSuperior + " puntos de salud, te quedan "
									+ vida + "/" + vidaMax + "puntos de vida");
						}

						if (accionEnemiga == 3 && vidaDios > 0) {
							ataqueSupremo = vida / 2;
							System.out
									.println("Dios se enfada contigo y te quita " + ataqueSupremo + " puntos de vida ");
							vida = vida - ataqueSupremo;
							if (vida <= 0) {
								vida = 0;
							}
							System.out.println("Te han quitado " + ataqueSupremo + " puntos de salud, te quedan " + vida
									+ "/" + vidaMax + "puntos de vida");
						}

						// AQUI TERMINA//

						// AQUI EMPIEZAS TU//

						do {
							System.out.println("1) Ataque normal");
							System.out.println("2) Golpe de suerte");
							System.out.println(
									"3) Suerte angelical(este habilidad lanza un ataque aleatorio entre  1 a 3 posibilidades)");
							System.out.println("4) Pacto del Demonio");

							accionCombate = sc.nextInt();

							if (accionCombate == 1 && vida > 0) {
								AtaqueNormal = suerte(10, 50);
								System.out.println(
										"Es un golpe normal, tampoco esperes tanto del él o no, pero tranquila, la suerte siempre te acompañara");
								if (escudoDiosAngelical > 0) {
									System.out.println("Dios se cubre con el manto angelical");
									escudoDiosAngelical = escudoDiosAngelical - AtaqueNormal;
									if (escudo <= 0) {
										escudo = 0;
									}
									System.out.println(
											"Le quedan " + escudoDiosAngelical + " puntos de vida al manto angelical");

								} else if (escudoDiosAngelical <= 0) {
									vidaDios = vidaDios - AtaqueNormal;
									System.out.println("Le quitas " + AtaqueNormal + "puntos de vida Dios");
									if (vidaDios <= 0) {
										vidaDios = 0;
									}
									System.out.println("le quedan" + vidaDios + "/" + vidaDiosMax);
								}

							} else if (accionCombate == 2 && vida > 0) {
								GolpEdeSuerte = suerte(10, 15);
								System.out.println("Tu suerte hace traspasar el escudo y le quitas " + GolpEdeSuerte
										+ " puntos de vida");
								vidaDios = vidaDios - GolpEdeSuerte;
								if (vidaDios <= 0) {
									vidaDios = 0;
								}
								System.out.println("le quedan" + vidaDios + "/" + vidaDiosMax);

							} else if (accionCombate == 3 && vida > 0) {

								suerte = suerte(1, 3);
								if (suerte == 1) {
									System.out.println("Fortuna:MUERE, MUERE, MUERE ");
									vidaDios = 0;

								} else if (suerte == 2) {
									System.out.println("Fortuna: NO ME MERECES MORTAL, MUERE");
									vida = vida / 2;
									System.out.println("Te han quitado algunos puntos de vida" + vida);

									System.out.println("Te quedan " + vida);
								} else if (suerte == 3) {
									System.out.println("Fortuna: NO ME MERECES MORTAL, MUERE");
									vida = 0;
								}
							} else if (accionCombate == 4 && vida > 0) { // HAY QUE ARREGLAR ESTO//
								PactoDemonio = suerte(700, 900);
								System.out.println(
										"Tu Pacto con el demonio, invoca su poder, y traspasas sus defensas, y le quitas "
												+ PactoDemonio + " puntos de vida");
								vidaDios = vidaDios - PactoDemonio;
								if (vidaDios <= 0) {
									vidaDios = 0;
								}
								System.out.println("le quedan" + vidaDios + "/" + vidaDiosMax);
							}

						} while (accionCombate != 1 && accionCombate != 2 && accionCombate != 3 && accionCombate != 4
								&& vida != 0);
						// AQUI TERMINAS TU//

					} while (suerte != 3 && vidaDios != 0 && vida != 0);

					sc.nextLine();

					if (vidaDios == 0) {
						System.out.println("Ante ti el Hijo de Dios cae derrotado");
						System.out.println("Se te presentan tres opciones");

						do {
							System.out.println("1) Salvar");
							System.out.println("2) Diablo");
							System.out.println("3) Absorver poder");
							accion = sc.nextInt();

							if (accion == 1) {
								final1 = 6;
							}
							if (accion == 2) {
								final1 = 7;
							}
							if (accion == 3) {
								final1 = 8;
							}

						} while (accion != 1 && accion != 2 && accion != 3);
					} else if (vida == 0) {
						final1 = 9;
					}

				}
			}

			/* AQUI TERMINA CARMELA */

			// AQUI EMPIEZA PACO//
		} else if (eleccionPersonaje == 2) {

			System.out.println("América 1940");
			System.out.println(
					"Estas en algun lugar de América, te encuentras con las autoridades locales y despues de tanto papeleo acabas en un orfanato");
			System.out.println();
			System.out.println("3 meses despues");
			System.out.println();
			System.out.println(
					"A pesar de tus amistades hechas en el orfanato, quieres escapar y intentar volver a tu época");
			System.out.println("Cuando te disponias a irte se te presenta un peligro");
			System.out.println(
					"Se te acerca una chica llamada Zaphirélia, que te gusta mucho y te dice: Paco estas pacomerte");
			System.out.println("¿Seguro que quieres escaparte?");

			System.out.println();

			do {
				System.out.println("1) Si");
				System.out.println("2) No");

				accion = sc.nextInt();
				if (accion != 1 && accion != 2) {
					System.out.println("Accion incorrecta, 1 para Si y 2 para no");
				}

				if (accion == 1) {
					seguimientoPaco = 1;
				} else if (accion == 2) {
					final1 = 10;
				}
			} while (accion != 1 && accion != 2);

			if (seguimientoPaco == 1) {
				System.out.println("Te ibas y de un momento para otro te capturan los ovnis");
				System.out.println("Como eres un ser superior, van a poner a prueba tu inteligencia ");

				System.out.println("Primera pregunta: ¿ cuanto es 2+2 ?");
				respuestaMatematica = sc.nextInt();

				if (respuestaMatematica == 4) {
					contadorMatematico++;
					System.out.println("Acertaste ");
				} else {
					System.out.println("Fallaste ");
				}

				System.out.println("Segunda pregunta:¿ Cuanto es (5*3)/5 ?");
				respuestaMatematica = sc.nextInt();

				if (respuestaMatematica == 3) {
					contadorMatematico++;
					System.out.println("Acertaste ");
				} else {
					System.out.println("Fallaste ");
				}

				System.out.println("Última pregunta: ¿ Cuanto es la raiz cuadrada de 169  ?");
				respuestaMatematica = sc.nextInt();
				if (respuestaMatematica == 13) {
					contadorMatematico++;
					System.out.println("Acertaste ");
				} else {
					System.out.println("Fallaste ");
				}

				if (contadorMatematico == 3) {
					System.out.println("Tienes la misma inteligencia que un hominido");

				} else {
					System.out.println("Tienes la mimsa inteligencia que el kakopo");
				}
				System.out.println(

						"Independientemente de tu inteligencia te encarcelan con otros tres personajes, un samurai, un espía ruso y alguien de un futuro lejano");
				System.out.println("Paco es momento de socializar");
				System.out.println("Se te presentan tres posibilidades(Elije un número del 1 al 3):");
				System.out.println("1) Samurai");
				System.out.println("2) Espía ruso");
				System.out.println("3) Viajero");
				do {

					interaccionPersonajes = sc.nextInt();
					if (interaccionPersonajes == 1 || interaccionPersonajes == 2) {
						System.out.println("No los entiendes");
						System.out.println("Prueba a hablar con otro");

						System.out.println("1) Samurai");
						System.out.println("2) Espía ruso");
						System.out.println("3) Viajero");

					} else if (interaccionPersonajes == 3) {
						System.out.println("Ayudemonos entre todos, sé como puedes volver a tu época");
					} else {
						System.out.println("Numero incorrecto, vuelve a intentarlo, elige una opción entre 1 y 3");
						System.out.println("1) Samurai");
						System.out.println("2) Espía ruso");
						System.out.println("3) Viajero");
					}

				} while (interaccionPersonajes != 3);

				do {
					System.out.println("¿Quieres ayudarlo?");
					System.out.println("1) Si");
					System.out.println("2) No");

					interaccionPersonajes = sc.nextInt();

					if (interaccionPersonajes != 1 && interaccionPersonajes != 2) {
						System.out.println("Vuelve a intentarlo, recuerda pon 1 o 2");
					}
					if (interaccionPersonajes == 2) {
						final1 = 11;
					} else if (interaccionPersonajes == 1) {
						seguimientoPaco = 2;
					}
				} while (interaccionPersonajes != 1 && interaccionPersonajes != 2);

			} // FIN SEGUMINETO RUTA PACO 1//

			if (seguimientoPaco == 2) { // INICIO SEGUIMIENRO RUTA PACO 2//
				System.out.println("buena elección");
				System.out.println("Estos seres son muy debiles. Ten estas armas: ");
				System.out.println();
				System.out.println("Has obtenido: Cable trampa y pociones de veneno");
				System.out.println("Para abrir esa puerta solo tienes que hacer matemática simple");
				System.out.println();
				System.out.println("'Estas ante la puerta'");

				do {
					do {
						if (vida <= 0) {
							vida = 100;
							System.out.println("EL alien te cura las heridas y eres enviado a la celda");
							System.out.println("'Estas ante la puerta otra vez'");
						}
						System.out.println("(5+2)+(-3)");
						respuestaMatematica = sc.nextInt();
						if (respuestaMatematica != 4) {
							System.out.println("ERROR, ERROR VUELVE A INTENTARLO");
						}
					} while (respuestaMatematica != 4);

					System.out.println("Abriste la puerta con exito");
					System.out.println("Ves un alien en tu camino");
					System.out.println("Que empiece la batalla");

					System.out.println("Se lanza la moneda");
					moneda = suerte(1, 2);
					if (moneda == 1) { // Aqui empiezas tu//
						System.out.println("Empiezas tu");
						do {
							do {
								System.out.println("1) Manotazo");
								System.out.println("2) Pocion de veneno");
								System.out.println("3) Cable trampa");

								if (vida > 0) {
									accionCombate = sc.nextInt();
								}
								;

								if (accionCombate == 1 && vida > 0) {
									manotazo = suerte(10, 20);
									System.out.println("Un golpecito 'normal'");
									if (vidaAlien > 0) {
										vidaAlien = vidaAlien - manotazo;
										System.out.println("Le quitas " + manotazo + "puntos de vida al alien");
										if (vidaAlien <= 0) {
											vidaAlien = 0;
										}
										System.out.println("le quedan" + vidaAlien + "/" + VidaAlienMax);
									}

								} else if (accionCombate == 2 && vida > 0) {
									pocionVeneno = suerte(30, 50);
									System.out.println("Le tiras un frasco de veneno");
									vidaAlien = vidaAlien - manotazo;
									if (vidaAlien <= 0) {
										vidaAlien = 0;
									}
									System.out.println("Le quitas " + pocionVeneno + "puntos de vida al aien");
									vidaAlien = vidaAlien - pocionVeneno;
									if (vidaAlien <= 0) {
										vidaAlien = 0;
									}
									System.out.println("le quedan" + vidaAlien + "/" + VidaAlienMax);

								} else if (accionCombate == 3 && vida > 0) {
									System.out.println("Pones un cable trampa");
									cableTrampa = suerte(1, 2);
									if (cableTrampa == 1) {
										System.out.println("No consigues atraparlo");

									} else if (cableTrampa == 2) {
										System.out.println("Lo atrapas con exito, ya no es una amenaza");
										vidaAlien = 0;
									}
								}

							} while ((accionCombate != 1 && accionCombate != 2 && accionCombate != 3) || vida < 0);

							// LE TOCA AL ALIEN//

							if (vidaAlien > 0) {
								System.out.println("Empieza el enemigo");
							}

							accionEnemiga = suerte(1, 2);

							if (accionEnemiga == 1 && vidaAlien > 0) {
								GolpeNormal = suerte(20, 30);
								System.out.println("Te pegan un puñetazo de " + GolpeNormal + " de daño");
								vida = vida - GolpeNormal;
								if (vida <= 0) {
									vida = 0;
								}
								System.out.println("Te han quitado " + GolpeNormal + " puntos de salud, te quedan "
										+ vida + "/" + vidaMax + "puntos de vida");
							} else if (accionEnemiga == 2 && vidaAlien > 0) {
								GolpeSuperior = suerte(10, 50);
								System.out.println("El Alien te suelta un manotazo superior (-" + GolpeSuperior + ")");
								vida = vida - GolpeSuperior;
								if (vida <= 0) {
									vida = 0;
								}
								System.out.println("Te han quitado " + GolpeSuperior + " puntos de salud, te quedan "
										+ vida + "/" + vidaMax + "puntos de vida");
							}

							// TERMINA EL TURNO ALIEN//

						} while (vidaAlien != 0 && vida != 0); // Mueres tu o el Alien//

					}
					if (moneda == 2) { // AQUI EMPIEZA EL ENEMIGO//

						do {

							if (vidaAlien > 0) {
								System.out.println("Empieza el enemigo");
							}

							accionEnemiga = suerte(1, 2);

							if (accionEnemiga == 1 && vidaAlien > 0) {
								GolpeNormal = suerte(20, 30);
								System.out.println("Te pegan un puñetazo de " + GolpeNormal + " de daño");
								vida = vida - GolpeNormal;
								if (vida <= 0) {
									vida = 0;
								}
								System.out.println("Te han quitado " + GolpeNormal + " puntos de salud, te quedan "
										+ vida + "/" + vidaMax + "puntos de vida");
							} else if (accionEnemiga == 2 && vidaAlien > 0) {
								GolpeSuperior = suerte(10, 50);
								System.out.println("El Alien te suelta un manotazo superior (-" + GolpeSuperior + ")");
								vida = vida - GolpeSuperior;
								if (vida <= 0) {
									vida = 0;
								}
								System.out.println("Te han quitado " + GolpeSuperior + " puntos de salud, te quedan "
										+ vida + "/" + vidaMax + "puntos de vida");
							}

							// AQUI TERMINA//

							// AQUI EMPIEZAS TU//
							do {
								System.out.println("1) Manotazo");
								System.out.println("2) Pocion de veneno");
								System.out.println("3) Cable trampa");

								if (vida > 0) {
									accionCombate = sc.nextInt();
								}
								;

								if (accionCombate == 1 && vida > 0) {
									manotazo = suerte(10, 20);
									System.out.println("Un golpecito 'normal'");
									if (vidaAlien > 0) {
										vidaAlien = vidaAlien - manotazo;
										System.out.println("Le quitas " + manotazo + "puntos de vida al alien");
										if (vidaAlien <= 0) {
											vidaAlien = 0;
										}
										System.out.println("le quedan" + vidaAlien + "/" + VidaAlienMax);
									}

								} else if (accionCombate == 2 && vida > 0) {
									pocionVeneno = suerte(30, 50);
									System.out.println("Le tiras un frasco de veneno");
									vidaAlien = vidaAlien - manotazo;
									if (vidaAlien <= 0) {
										vidaAlien = 0;
									}
									System.out.println("Le quitas " + pocionVeneno + "puntos de vida al alien");
									vidaAlien = vidaAlien - pocionVeneno;
									if (vidaAlien <= 0) {
										vidaAlien = 0;
									}
									System.out.println("le quedan" + vidaAlien + "/" + VidaAlienMax);

								} else if (accionCombate == 3 && vida > 0) {
									System.out.println("Pones un cable trampa");
									cableTrampa = suerte(1, 2);
									if (cableTrampa == 1) {
										System.out.println("No consigues atraparlo");

									} else if (cableTrampa == 2) {
										System.out.println("Lo atrapas con exito, ya no es una amenaza");
										vidaAlien = 0;
									}
								}

							} while ((accionCombate != 1 && accionCombate != 2 && accionCombate != 3) || vida < 0);
							// AQUI TERMINAS TU//

						} while (vidaAlien != 0 && vida != 0);

					}

				} while (vidaAlien != 0);
				System.out.println("Tras derrotar al alien, vuelves a la celda a avisar a tus compañeros");
				System.out.println("El viajero te dice:");
				System.out.println("Para volver a nuestros tiempos, devemos tomar la nave");
				System.out.println("Ten esta maya de protección, te ayudara a sobrevivir");
				System.out.println("Intenta convencer al samurai y al espía ruso");

				do {
					sc.nextLine();
					System.out.println("Como se llama la señal para pedir ayuda (Pon los puntos)");
					acertijo = sc.nextLine();

					if (!acertijo.equalsIgnoreCase("S.O.S")) {
						System.out.println("Vuelve a intentarlo");
					}

				} while (!acertijo.equalsIgnoreCase("S.O.S"));

				System.out.println("El samurai y el espía ruso se han unido a tu equipo");
				System.out.println("Hos adentrais por el pasillo, veis un gran grupo de aliens");
				System.out.println("El samurai ha acabado con varios, pero queda el lider");

				System.out.println("Que empieze el combate");
				System.out.println("Gracias al samurai, empiezas tu");
				vidaAlien = 1000;
				vida = 1000;
				vidaMax = vida;
				do {
					do {
						System.out.println("1) Manotazo");
						System.out.println("2) Pocion de veneno");
						System.out.println("3) Cable trampa");
						System.out.println("4) Llamar al equipo");

						if (vida > 0) {
							accionCombate = sc.nextInt();
						}
						;

						if (accionCombate == 1 && vida > 0) {
							manotazo = suerte(10, 20);
							System.out.println("Un golpecito 'normal'");
							if (vidaAlien > 0) {
								vidaAlien = vidaAlien - manotazo;
								System.out.println("Le quitas " + manotazo + "puntos de vida al alien");
								if (vidaAlien <= 0) {
									vidaAlien = 0;
								}
								System.out.println("le quedan" + vidaAlien + "/" + VidaAlienMax);
							}

						} else if (accionCombate == 2 && vida > 0) {
							pocionVeneno = suerte(30, 50);
							System.out.println("Le tiras un frasco de veneno");
							vidaAlien = vidaAlien - manotazo;
							if (vidaAlien <= 0) {
								vidaAlien = 0;
							}
							System.out.println("Le quitas " + pocionVeneno + "puntos de vida al alien");
							System.out.println("le quedan" + vidaAlien + "/" + VidaAlienMax);

						} else if (accionCombate == 3 && vida > 0) {
							System.out.println("Pones un cable trampa");
							cableTrampa = suerte(1, 2);
							if (cableTrampa == 1) {
								System.out.println("No consigues atraparlo");

							} else if (cableTrampa == 2) {
								System.out.println("Lo atrapas con exito, ya no es una amenaza");
								vidaAlien = 0;
							}
						} else if (accionCombate == 4) {
							equipoDaño = suerte(300, 500);
							System.out.println("Tus compañeros atacan ");
							vidaAlien = vidaAlien - equipoDaño;
							if (vidaAlien <= 0) {
								vidaAlien = 0;
							}
							System.out.println("Le quitas " + equipoDaño + "puntos de vida al alien");
							System.out.println("le quedan" + vidaAlien + "/" + VidaAlienMax);
						}

					} while ((accionCombate != 1 && accionCombate != 2 && accionCombate != 3 && accionCombate != 4)
							|| vida < 0);

					// LE TOCA AL ALIEN//

					if (vidaAlien > 0) {
						System.out.println("Empieza el enemigo");
					}

					accionEnemiga = suerte(1, 2);

					if (accionEnemiga == 1 && vidaAlien > 0) {
						GolpeNormal = suerte(40, 50);
						System.out.println("Te pegan un puñetazo superior de " + GolpeNormal + " de daño");
						vida = vida - GolpeNormal;
						if (vida <= 0) {
							vida = 0;
						}
						System.out.println("Te han quitado " + GolpeNormal + " puntos de salud, te quedan " + vida + "/"
								+ vidaMax + "puntos de vida");
					} else if (accionEnemiga == 2 && vidaAlien > 0) {
						GolpeSuperior = suerte(20, 50);
						System.out.println("El Alien te suelta un manotazo superior (-" + GolpeSuperior + ")");
						vida = vida - GolpeSuperior;
						if (vida <= 0) {
							vida = 0;
						}
						System.out.println("Te han quitado " + GolpeSuperior + " puntos de salud, te quedan " + vida
								+ "/" + vidaMax + "puntos de vida");
					}

					// TERMINA EL TURNO ALIEN//

				} while (vidaAlien != 0 && vida != 0); // Mueres tu o el Alien//

				if (vidaAlien <= 0) {
					System.out.println("Lo derrotaste");
					seguimientoPaco = 3;
				} else if (vida <= 0) {
					final1 = 12;
				}
			}
			if (seguimientoPaco == 3) {
				System.out.println();
				System.out.println("Hay que abrir esa puerta, para llegar a los mandos ");
				System.out.println("Ante ti hay un panel");
				do {
					System.out.println("Soy un número de 4 cifras.");
					System.out.println("Mi primera cifra es el doble de la tercera.");
					System.out.println("La segunda cifra es igual a la cuarta.");
					System.out.println("La suma de todas mis cifras es 14.");
					System.out.println("");
					System.out.println("Introduzca la clave . . . .");

					respuestaMatematica = sc.nextInt();

				} while (respuestaMatematica != 4424);

				System.out.println("correr, necesitamos tomar el control, lo mas rápido posible ");

				System.out.println("Esperate, necesitamos una clave");

				sc.nextLine();
				do {

					System.out.println("Cual fue tu primer amor ");

					acertijo = sc.nextLine();

					if (acertijo.equalsIgnoreCase("Zaphirelia")) {
						final1 = 14;
					} else if (!acertijo.equalsIgnoreCase("Zaphirelia")) {
						final1 = 13;
					}

				} while (!acertijo.equalsIgnoreCase("Zaphirelia") && acertijo.equalsIgnoreCase("Zaphirelia"));
			}
			/* AQUI TERMINA PACO */

			/* AQUI EMPIEZA MATIAS */
		} else if (eleccionPersonaje == 3) {
			System.out.println();
			System.out.println("Inspirado en la saga Wolfesteín");
			System.out.println();
			System.out.println(
					"De un momento para otro te encuentras en una bañera, levantandote ves a un conocido personaje con bigote ");
			System.out.println("BIENVENIDO AL CASTILLO WOLFESTEÍN");
			System.out.println();
			System.out.println(
					"Despues de comprender la situación te pones a correr como loco, el conocido pintor austriaco esta llamando a los guardias  ");
			sc.nextLine();

			System.out.println("//ACERTIJO//");
			System.out.println(
					"Aunque no tengo puertas, en mí puedes entrar; largo y estrecho soy, y a las habitaciones suelo llevar. ¿Qué soy?");

			accionMatiasEscribir = sc.nextLine();

			if (!accionMatiasEscribir.equalsIgnoreCase("Pasillo")) {
				final1 = 15;
			} else if (accionMatiasEscribir.equalsIgnoreCase("Pasillo")) {
				seguimientoMatias = 1;
			}

			if (seguimientoMatias == 1) {
				System.out.println(
						"Vas por el pasillo y ves una ventana, la inquietud recorre tu cuerpo, decides saltar la ventana");
				System.out.println("Caes hacia el mar y quedas inconsciente ");
				System.out.println();
				System.out.println("TIEMPO DESPUES....");
				System.out.println();
				System.out.println(
						"Recuperas el conocimiento, te encuentras en  una casa, ves a una  persona a tu alrededor");
				do {

					System.out.println("¿Quieres hablar con él?");
					System.out.println("1) Si");
					System.out.println("2) No");
					accionMatias = sc.nextInt();

					if (accionMatias == 2) {
						System.out.println("Recuerda que mama decia que era importante socializar");
					}

				} while (accionMatias != 1);

				System.out.println(
						"Se que eres del futuro, como antiguo científico, puedo ayudarte a volver a tu época pero antes, debes traerme tres piezas para arreglar mi máquina del tiempo ");
				System.out.println(
						"Las dos primeras, las encontrarás en el castillo Wolfestein, de donde vienes, la primera en el laboratorio, y la segunda en el desguaze. ");
				System.out
						.println("La otra la conseguiré yo, ten este disfraz nazi para poder entrar y estos papeles.");
				System.out.println(
						"Este traje es un camuflaje del futuro del año 2200 que se adapta a cualquier época por eso no me han descubierto todavía");

				System.out.println("");
				System.out.println("Estás ante el castillo Wolfestein, te dispones a entrar.");
				System.out.println("");

				System.out.println("Guardia: Papiere bitte (Papeles por favor)");
				sc.nextLine();
				System.out.println("un mometo respondeme esto para ver que no eres un intruso");
				System.out.println(
						"Herr tu nombre como puedo ver es Matias,pero no tienes mucho aspecto de aleman podrias almenos decirme ");
				System.out.println("como se dice pasaporte en aleman ");
				do {
					accionMatiasEscribir = sc.nextLine();

					if (!accionMatiasEscribir.equalsIgnoreCase("Reisepass")) {
						System.out.println("versuchen Sie es erneut");
						System.out.println("¿pasaporte en aleman?");
					}
				} while (!accionMatiasEscribir.equalsIgnoreCase("Reisepass"));
				System.out.println("Adelante");
				System.out.println();
				System.out.println(
						"Siguiendo las señales, encuentras el laboratorio, cuando te disponias a buscar la pieza, se te acerca un científico, preguntando que haces aquí.");
				System.out.println("Al no saberle responder en aleman, coge un bisturi, y se pone a la defensiva");
				System.out.println();
				System.out.println("Que empieze la batlla");

				System.out.println("Se lanza la moneda");
				moneda = suerte(1, 2);
				if (moneda == 1) { // AQUI EMPIEZAS TU//
					System.out.println("Empiezas tu");
					do {
						do {
							System.out.println("1) Hostión alivia la tontería");
							System.out.println("2) Patada Ligera");
							System.out.println("3) Golpe marcial");

							if (vida > 0) {
								accionCombate = sc.nextInt();
							}

							if (accionCombate == 1 && vida > 0) {
								Hostion = suerte(50, 60);
								System.out.println("Le pegas tan fuerte, que no le dejas opción de defensa");
								vidaEnemigoMatias = vidaEnemigoMatias - Hostion;
								System.out.println("Le quitas " + Hostion + "puntos de vida al científico");
								if (vidaEnemigoMatias <= 0) {
									vidaEnemigoMatias = 0;
								}
								System.out.println("le quedan " + vidaEnemigoMatias + "/" + vidaEnemigoMatiasMax);

							} else if (accionCombate == 2 && vida > 0) {
								PatadaLigera = suerte(10, 15);
								System.out.println(" Le rompes la defensa al oponente");
								vidaEnemigoMatias = vidaEnemigoMatias - PatadaLigera;
								if (vidaEnemigoMatias <= 0) {
									vidaEnemigoMatias = 0;
								}
								System.out.println("le quedan " + vidaEnemigoMatias + "/" + vidaEnemigoMatiasMax);

							} else if (accionCombate == 3 && vida > 0) {

								GolpeMarcial = suerte(10, 30);
								System.out.println(GolpeMarcial);
								if (contadorGolpeMarcial == 0) {
									GolpeMarcial = suerte(10, 20);
								} else if (contadorGolpeMarcial == 1) {
									GolpeMarcial = GolpeMarcial + 10;

								} else if (contadorGolpeMarcial == 2) {
									GolpeMarcial = GolpeMarcial + 20;

									System.out.println("Te quedan " + vida);
								} else if (contadorGolpeMarcial >= 3) {
									GolpeMarcial = GolpeMarcial + 30;
								}
								vidaEnemigoMatias = vidaEnemigoMatias - GolpeMarcial;
								System.out.println("Sueltas una patada");
								System.out.println("Le quitas " + GolpeMarcial + "puntos de vida al científico");

								if (vidaEnemigoMatias <= 0) {
									vidaEnemigoMatias = 0;
								}
								contadorGolpeMarcial = +1;
								System.out.println("le quedan " + vidaEnemigoMatias + "/" + vidaEnemigoMatiasMax);
							}

						} while (accionCombate != 1 && accionCombate != 2 && accionCombate != 3 || vida < 0);

						// LE TOCA AL cientifico//

						if (vidaEnemigoMatias > 0) {
							System.out.println("Empieza el enemigo");
						}

						accionEnemiga = suerte(1, 2);

						if (accionEnemiga == 1 && vidaEnemigoMatias > 0) {
							GolpeNormal = suerte(20, 30);
							System.out.println("Te pegan un puñetazo " + GolpeNormal + " de daño");
							vida = vida - GolpeNormal;

							if (vida <= 0) {
								vida = 0;
							}
							System.out.println("Te han quitado " + GolpeNormal + " puntos de salud, te quedan " + vida
									+ "/" + vidaMax + "puntos de vida");
						}
						if (accionEnemiga == 2 && vidaEnemigoMatias > 0) {
							GolpeSuperior = suerte(10, 30);
							System.out.println(" Te clavan el bisturi (-" + GolpeSuperior + ")");
							vida = vida - GolpeSuperior;

							if (vida <= 0) {
								vida = 0;
							}
							System.out.println("Te han quitado " + GolpeSuperior + " puntos de salud, te quedan " + vida
									+ "/" + vidaMax + "puntos de vida");
						}

						// TERMINA EL TURNO DEL CIENTIFICO//

					} while (suerte != 3 && vidaEnemigoMatias != 0 && vida != 0); // Mueres tu o el cientifico//

				}
				if (moneda == 2) { // AQUI EMPIEZA EL ENEMIGO//
					System.out.println("turno del enemigo");
					do {

						if (vidaEnemigoMatias > 0) {
							System.out.println("Empieza el enemigo");
						}

						accionEnemiga = suerte(1, 2);

						if (accionEnemiga == 1 && vidaEnemigoMatias > 0) {
							GolpeNormal = suerte(20, 30);
							System.out.println("Te pegan un puñetazo " + GolpeNormal + " de daño");
							vida = vida - GolpeNormal;

							if (vida <= 0) {
								vida = 0;
							}
							System.out.println("Te han quitado " + GolpeNormal + " puntos de salud, te quedan " + vida
									+ "/" + vidaMax + "puntos de vida");
						}
						if (accionEnemiga == 2 && vidaEnemigoMatias > 0) {
							GolpeSuperior = suerte(10, 30);
							System.out.println(" Te clavan el bisturi (-" + GolpeSuperior + ")");
							vida = vida - GolpeSuperior;

							if (vida <= 0) {
								vida = 0;
							}
							System.out.println("Te han quitado " + GolpeSuperior + " puntos de salud, te quedan " + vida
									+ "/" + vidaMax + "puntos de vida");
						}
						// AQUI TERMINA//

						// AQUI EMPIEZAS TU//
						do {
							System.out.println("1) Hostión alivia la tontería");
							System.out.println("2) Patada Ligera");
							System.out.println("3) Golpe marcial");

							if (vida > 0) {
								accionCombate = sc.nextInt();
							}

							if (accionCombate == 1 && vida > 0) {
								Hostion = suerte(50, 60);
								System.out.println("Le pegas tan fuerte, que no le dejas opción de defensa");
								vidaEnemigoMatias = vidaEnemigoMatias - Hostion;
								System.out.println("Le quitas " + Hostion + "puntos de vida al científico");
								if (vidaEnemigoMatias <= 0) {
									vidaEnemigoMatias = 0;
								}
								System.out.println("le quedan " + vidaEnemigoMatias + "/" + vidaEnemigoMatiasMax);

							} else if (accionCombate == 2 && vida > 0) {
								PatadaLigera = suerte(10, 15);
								System.out.println(" Le rompes la defensa al oponente");
								vidaEnemigoMatias = vidaEnemigoMatias - PatadaLigera;
								if (vidaEnemigoMatias <= 0) {
									vidaEnemigoMatias = 0;
								}
								System.out.println("le quedan " + vidaEnemigoMatias + "/" + vidaEnemigoMatiasMax);

							} else if (accionCombate == 3 && vida > 0) {

								GolpeMarcial = suerte(10, 30);
								System.out.println(GolpeMarcial);
								if (contadorGolpeMarcial == 0) {
									GolpeMarcial = suerte(10, 20);
								} else if (contadorGolpeMarcial == 1) {
									GolpeMarcial = GolpeMarcial + 10;

								} else if (contadorGolpeMarcial == 2) {
									GolpeMarcial = GolpeMarcial + 20;

									System.out.println("Te quedan " + vida + "puntos de vida");
								} else if (contadorGolpeMarcial >= 3) {
									GolpeMarcial = GolpeMarcial + 30;
								}
								vidaEnemigoMatias = vidaEnemigoMatias - GolpeMarcial;

								System.out.println("Le quitas " + GolpeMarcial + "puntos de vida al científico");

								if (vidaEnemigoMatias <= 0) {
									vidaEnemigoMatias = 0;
								}
								contadorGolpeMarcial = +1;
								System.out.println("le quedan" + vidaEnemigoMatias + "/" + vidaEnemigoMatiasMax);
							}

						} while (accionCombate != 1 && accionCombate != 2 && accionCombate != 3 || vida < 0);
						// AQUI TERMINAS TU//

					} while (suerte != 3 && vidaEnemigoMatias != 0 && vida != 0);

				}
				if (vida <= 0) {
					final1 = 16;
				} else if (vidaEnemigoMatias <= 0) {
					seguimientoMatias = 2; // MATAS AL ENEMIGO//

				}
			} ////
			if (seguimientoMatias == 2) {
				vida = 100;
				System.out.println();
				System.out.println("Recoges la pieza, consigues  una de las piezas tienes 1/2  ");
				System.out.println();
				System.out.println("Sales del laboratorio, y te diriges a buscar el desguaze");
				System.out.println("Deberias preguntar a alguien");
				System.out.println("1)Interactuar");

				do {

					accionMatias = sc.nextInt();

					if (accionMatias != 1) {
						System.out.println("Deberias pensar en socializar si no quieres morir");
					}

				} while (accionMatias != 1);

				System.out.println(
						"Preguntas a un guardia  con aspecto un tanto Americano y te dice donde esta el desguace ");
				System.out.println(
						"Te diriges al desguace, cuando veias la pieza, ves un gran grupo de cucarachas, es momento del exterminador");
				System.out.println("Mata 25 cucarachas para seguir adelante y conseguir la pieza");
				do {

					System.out.println("Da a uno para Matar a la cucaracha ");

					accionMatias = sc.nextInt();
					if (accionMatias == 1) {
						Cucaracha += 1;
						System.out.println("Te quedan por matar " + Cucaracha + "/" + CucarachaMax);
					}

					if (accionMatias != 1) {
						vida -= 5;
						System.out.println(
								"Tienes que matarlas, una de ellas se avalanza sobre ti" + vida + "/" + vidaMax);
						if (vida <= 0) {
							vida = 0;
							final1 = 17;
						}
					}

				} while (Cucaracha != 25 && vida != 0);

			}
			if (Cucaracha == 25) {
				seguimientoMatias = 3;
			}
			if (seguimientoMatias == 3) {
				System.out.println("Consigues la segunda pieza");
				System.out.println("Para no ser visto por la puerta principal, decides salir por una verja ");
				System.out.println("Es hora de un minijuego ");
				sc.nextLine();
				do {
					System.out.println("Como se dice tenazas en aleman");
					accionMatiasEscribir = sc.nextLine();

					if (!accionMatiasEscribir.equalsIgnoreCase("Zange")) {
						System.out.println("versuchen Sie es erneut");
						System.out.println("ZANGE?");
					}

				} while (!accionMatiasEscribir.equalsIgnoreCase("Zange"));
				System.out.println("Consiges, salir del castillo");
				System.out.println("Te diriges a la casa del cientifico");
				System.out.println("Tienes visiones, y recuerdas la parodoja de la mariposa");
				System.out.println("¿Como quieres entrar a la casa, por la puerta o por la ventana?");
				do {
					System.out.println("1) Puerta");
					System.out.println("2) ventana");
					accionMatias = sc.nextInt();
					if (accionMatias != 1 && accionMatias != 2) {
						System.out.println("Te quedas mirando a casa, elige una opción");
					}
				} while (accionMatias != 1 && accionMatias != 2);

				if (accionMatias == 1) {
					System.out.println("Decides entrar como una persona normal");
					System.out.println("No habra cambios en tu futuro, la mariposa esta tranquila");
					final1 = 18;

				} else if (accionMatias != 2) {
					System.out.println("Entras como los monos");
					System.out.println("Habra cambios en tu futuro, la mariposa no esta tranquila");
					final1 = 19;
				}
				System.out.println("Le llevas las piezas al científico");
			}
		}

		/* AQUI TERMINA MATIAS */

		if (final1 == 1)

		{
			System.out.println("##FIN DEL JUEGO##");
		} else if (final1 == 2) {
			System.out.println("Te dejas de rollos religiosos y vives como un campesino");
			System.out.println("##FIN DEL JUEGO##");
		} else if (final1 == 3) {
			System.out.println("Has ganado para nada programado, Jesus te devuelve a tu mundo");
			System.out.println("##FIN DEL JUEGO##");
		} else if (final1 == 4) {

			System.out.println(
					"Jesus se enfada contigo, como castigo te convierte en una paloma de la fe, enviandote a predicar el evangelio por todo el mundo");
			System.out.println("##FIN DEL JUEGO##");
		} else if (final1 == 5) {
			System.out.println("Te compromenten para casarte con el hijo del emperador");
			System.out.println("##FIN DEL JUEGO##");
		} else if (final1 == 6) {
			System.out.println(
					"Te arrepientes de último momento de hacer algo malo, eres perdonado y devuelto a tu época ");
			System.out.println("##FIN DEL JUEGO##");
		} else if (final1 == 7) {
			System.out.println(
					"Llamas al diablo, como parte de tu trato, el Diablo absorve su esenceia y eres enviado a tu época, no ves cambios significativos.");
			System.out.println("##FIN DEL JUEGO##");
		} else if (final1 == 8) {
			System.out.println("Te acercas y absorves la esencia del Hijo de Dios");
			System.out.println("Es momento de hacerse con el mundo");
			System.out.println("##FIN DEL JUEGO##");
		} else if (final1 == 9) {
			System.out.println("Mueres por la mano de Dios");
			System.out.println("##FIN DEL JUEGO##");
		} else if (final1 == 10) {
			System.out.println("Te quedas con la chica, podría ocurrir algo");
			System.out.println("##FIN DEL JUEGO##");
		} else if (final1 == 11) {
			System.out.println("Al no querer ayudar, pasa el tiempo y mueres disepcionado");
			System.out.println("##FIN DEL JUEGO##");
		} else if (final1 == 12) {
			System.out.println("Mueres por el Alien lider, seras un gran espécimen");
			System.out.println("##FIN DEL JUEGO##");
		} else if (final1 == 13) {
			System.out.println("INCORRECTO, LA NAVE VA A EXPLOTAR");
			System.out.println("##FIN DEL JUEGO##");
		} else if (final1 == 14) {
			System.out.println("CORRECTO");
			System.out.println("El viajero, cogio los mandos de la nave, te devolvio a tu época");
			System.out.println("##FIN DEL JUEGO##");
		} else if (final1 == 15) {
			System.out.println("INCORRECTO");
			System.out.println("Eres capturado ......");
			System.out.println("##FIN DEL JUEGO##");
		} else if (final1 == 16) {
			System.out.println("Mueres por las manos del científico, seras un grán espécimen");
			System.out.println("##FIN DEL JUEGO##");
		} else if (final1 == 17) {
			System.out.println(
					"Por no querer enfrentarte a unas inofensivas cucharachas mueres entre terribles sufrimientos y mordisquitos");
			System.out.println("##FIN DEL JUEGO##");
		} else if (final1 == 18) {
			System.out.println(
					"El cientifico activa la máquina del tiempo, descubriendo que eres tu el cientifico, segundos despues eres devuelto a tu época");
			System.out.println("##FIN DEL JUEGO##");
		} else if (final1 == 19) {
			System.out.println(
					"El cientifico activa la máquina del tiempo, te empuja y te quedas atrapado en este pasado, despues de varios segundos, escuchas golpes en la puerta");
			System.out.println("##FIN DEL JUEGO##");
		}
		sc.close();
	}

	public static int suerte(int minimo, int maximo) {
		Random suerte = new Random();
		int resultado = suerte.nextInt(maximo - minimo + 1) + minimo;

		return resultado;
	}

}
