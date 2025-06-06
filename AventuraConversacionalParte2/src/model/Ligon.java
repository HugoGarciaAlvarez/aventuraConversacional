package model;



public class Ligon extends Personaje {

	public Ligon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ligon(String nombre, int vida, int vidaMax, String[] ataques, int[] danoAtaques) {
		super(nombre, vida, vidaMax, ataques, danoAtaques);
		// TODO Auto-generated constructor stub
	}
	
	public static Ligon personajeCarmela() {
		
		
		Ligon carmela = new Ligon("ligon",50,200,new String[] { "Piropo", "Rompe Corazones", "Rechazo" },
	            new int[] { 20, 30, 50 });
		
		return carmela;
	}
	
	public static Personaje enemigo() {
		Personaje enemigo = new Personaje("chica",100,100,new String[] { "Amarre", "Bofetada", "Amenaza" },
	            new int[] { 30, 30, 10 });
		
		return enemigo;
	}
	
	public static void iniciarAventuraLigon() {
	Personaje chica=Ligon.enemigo();
	Ligon ligonProt=Ligon.personajeCarmela();
		ligonProt.imprimirPersonaje();
		System.out.println("Has seleccionado Ligón tu reputación(vida) inicial es de " + ligonProt.getVida());
		ligonProt.conquistarCorazones();
		ligonProt.comprobacionReputacion();
		ligonProt.minijuegos();
		ligonProt.comprobacionFinalReputacion();
		 Batalla.iniciarBatalla(ligonProt, chica, 1);
		
			
	}
	
	public void conquistarCorazones() {
		
		
		
		System.out.println("Como ligón tendrás que conquistar el corazón de una chica, y a través de ello aumentar tu reputación hasta 100");
		System.out.println("Te acercas a una persona atractiva... ¿Qué haces?");
		System.out.println("1: Halagar con un cumplido ingenioso.");
		System.out.println("2: Presumir de tus logros.");
		System.out.println("3: Mostrarte tal cual eres, la vulnerabilidad y con sinceridad.");
		int opcion = CorrecionErrorInt.getInstance().correcionDeErrores();
		switch (opcion) {
		    case 1:
		        System.out.println("Tu cumplido le ha sonrojado y se ha reído. ¡Bien jugado!");
		        this.setVida(getVida()+10);
		        break;
		    case 2: 
		        System.out.println("Parece que le da completamente igual y te ha pillado asco. Acéptalo, no eres Mario Casas...(te hizo daño -20)");
		        this.setVida(getVida()-20);
		        break;
		    case 3:
		        System.out.println("Aprecia tu honestidad y se interesa más en ti (le pareces mono).");
		        this.setVida(getVida()+10);
		        break;
		        
		    default:
		        System.out.println("No has tenido valor ni de acercarte, tu reputuación sigue igual pringado");
		        this.setVida(getVida()-20);
	}
	}
	
	public void comprobacionReputacion() {
		
		System.out.println("Tu reputación es de " + this.getVida());
		if ( this.getVida() >= 70) {
		    System.out.println("Enhorabuena! Has aumentado tu reputación! Pero todavía no es de un ligón");
		} else if ( this.getVida() <= 30) {
		    System.out.println("Lo siento, has sido rechazado.");
		} else {
		    System.out.println("Las cosas quedaron algo indefinidas... Tendrás que jugar a los minijuegos.");
		}

		

		
	}
	
	
	public void minijuegos() {
        
        int Minijuego = 0;
        System.out.println("Deberás escoger entre estos 5 minijuegos que te darán la posibilidad de aumentar tu reputación, \nde lo contrario te mirarán mal todos");
        System.out.println("Minijuego 1: Adivina el Cumplido Correcto");
        System.out.println("Minijuego 2: Verdad o Reto");
        System.out.println("Minijuego 3: Plan de Cita Perfecta");
        System.out.println("Minijuego 4: Adivinanza Romántica");
        System.out.println("Minijuego 5: Decisiones Rápidas");

        Minijuego = CorrecionErrorInt.getInstance().correcionDeErrores();

        switch (Minijuego) {
            case 1:
                this.minijuego1();
                break;
            case 2:
                this.minijuego2();
                break;
            case 3:
                this.minijuego3();
                break;
            case 4:
                this.minijuego4();
                break;
            case 5:
                this.minijuego5();
                break;
            default:
                System.out.println("Respuesta no válida.");
                minijuegos();
        }
    }
	
	 public void minijuego1() {
	        
	        int opcionmini;
	        System.out.println("Minijuego 1: ¿Cuál es el mejor cumplido para una cita?");
	        System.out.println("1. Tienes una sonrisa encantadora.");
	        System.out.println("2. ¿Te gustan los memes de gatos?");
	        System.out.println("3. Eres como la chancla de mi madre: te veo venir y se me acelera el corazón.");
	        opcionmini = CorrecionErrorInt.getInstance().correcionDeErrores();

	        if (opcionmini == 1) {
	            System.out.println("La vieja confiable, No está mal...");
	            Usuario.getInstance().darPuntuacion(10);
	            this.setVida(this.getVida() + 15);
	        } else if (opcionmini == 2) {
	            System.out.println("La chica se enamora locamente de ti, te dice que te va a presentar a su familia y que mañana os casais(final perfecto, vivan los memes de gatos)");
	            System.out.println("Eres el DIOS DEL LIGUE. Terminas");
	            Usuario.getInstance().darPuntuacion(20);
	            Finales.finalRevision(11);
	        } else if (opcionmini == 3) {
	            System.out.println("Se ha reido, le has parecido único y le has causado buena impresión. ganas 20 puntos");
	            this.setVida(this.getVida() + 20);
	            Usuario.getInstance().darPuntuacion(10);
	        } else {
	            System.out.println("Opción no válida");
	            minijuego1();
	        }
	    }

	    public void minijuego2() {
	  
	        int opcionmini2;
	        System.out.println("Minijuego 2: Te preguntan: ¿Qué harías para impresionar a tu cita?");
	        System.out.println("1. Cantar su canción favorita en público.");
	        System.out.println("2. Preparar una cena romántica en casa.");
	        System.out.println("3. Contarle un chiste terrible.(El chiste: Tengo un amigo otaku que estaba triste, así que lo animé)");
	        opcionmini2 = CorrecionErrorInt.getInstance().correcionDeErrores();

	        if (opcionmini2 == 1) {
	            System.out.println("La vieja confiable, No está mal...");
	            this.setVida(this.getVida() + 15);
	            System.out.println("Tu reputación es de " + this.getVida());
	            Usuario.getInstance().darPuntuacion(10);
	        } else if (opcionmini2 == 2) {
	            System.out.println("Le has preparado unos macarrones y se te han quemado en el horno, están malísimos... liadón histórico. pierdes -20 puntos");
	            this.setVida(this.getVida() - 20);
	            System.out.println("Tu reputación es de " + this.getVida());
	        } else if (opcionmini2 == 3) {
	            System.out.println("Se ha reido, le has parecido único y le has causado buena impresión. ganas 20 puntos");
	            this.setVida(this.getVida() + 20);
	            System.out.println("Tu reputación es de " + this.getVida());
	            Usuario.getInstance().darPuntuacion(10);
	        } else {
	            System.out.println("Opción no válida");
	            minijuego2();
	        }
	    }

	    public void minijuego3() {
	       
	        int opcionmini3;
	        System.out.println("Minijuego 3: Plan de Cita Perfecta");
	        System.out.println("Planeas una cita sorpresa. ¿Qué eliges?");
	        System.out.println("1. Picnic bajo las estrellas.");
	        System.out.println("2. Llevarla a tu casa y enseñarle la colección completa de warhammers");
	        System.out.println("3. Llevarla a cenar a un sitio elegante");
	        opcionmini3 = CorrecionErrorInt.getInstance().correcionDeErrores();

	        if (opcionmini3 == 1) {
	            System.out.println("¡Qué detallista! Es un plan único, bonito, y tranquilo, Es perfecto. Ganas 30 puntos.");
	            this.setVida(this.getVida() + 30);
	            Usuario.getInstance().darPuntuacion(10);
	            System.out.println("Tu reputación es de " + this.getVida());
	        } else if (opcionmini3 == 2) {
	            System.out.println("Se ve que eres majo pero lo de ligar no es lo tuyo, ha puesto una excusa mala y se ha ido... pierdes -80 puntos");
	            this.setVida(this.getVida() - 80);
	            System.out.println("Tu reputación es de " + this.getVida());
	        } else if (opcionmini3 == 3) {
	            System.out.println("Podría funcionar... Ganas 10 puntos.");
	            this.setVida(this.getVida() + 10);
	            Usuario.getInstance().darPuntuacion(10);
	            System.out.println("Tu reputación es de " + this.getVida());
	        } else {
	            System.out.println("Opción no válida");
	            minijuego3();
	        }
	    }

	    public void minijuego4() {
	       
	        int opcionmini4;
	        System.out.println("Minijuego 4: Adivinanza Romántica(en verdad es una pregunta trampa camuflada, ten cuidad...)");
	        System.out.println("¿Qué es lo que más te gusta de mi?");
	        System.out.println("1. El físico");
	        System.out.println("2. La personalidad");
	        System.out.println("3. El culo");
	        opcionmini4 = CorrecionErrorInt.getInstance().correcionDeErrores();

	        if (opcionmini4 == 1) {
	            System.out.println("Que materialista... Te dice que eres como su ex y se va... pierdes -30 puntos");
	            this.setVida(this.getVida() - 30);
	            System.out.println("Tu reputación es de " + this.getVida());
	        } else if (opcionmini4 == 2) {
	            System.out.println("La vieja confiable, no ha quedado mal pero había mejores respuestas... ganas 5 puntos");
	            this.setVida(this.getVida() + 5);
	            System.out.println("Tu reputación es de " + this.getVida());
	            Usuario.getInstance().darPuntuacion(10);
	        } else if (opcionmini4 == 3) {
	            System.out.println("Sorprendentemente se ha reído y dice que le encanta tu sinceridad... ganas 80 puntos");
	            this.setVida(this.getVida() + 80);
	            System.out.println("Tu reputación es de " + this.getVida());
	            Usuario.getInstance().darPuntuacion(10);
	        } else {
	            System.out.println("Opción no válida");
	            minijuego4();
	        }
	    }

	    public void minijuego5() {
	
	        int opcionmini5;
	        System.out.println("Minijuego 5: Decisiones Rápidas");
	        System.out.println("Al ver a tu cita en la distancia, ¿qué haces?");
	        System.out.println("1. Sonreír y saludar.");
	        System.out.println("2. Ignorarla y mirar el móvil.");
	        System.out.println("3. Correr hacia ella con entusiasmo.");
	        opcionmini5 = CorrecionErrorInt.getInstance().correcionDeErrores();

	        if (opcionmini5 == 1) {
	            System.out.println("Te devuelve una sonrisa y te saluda, bien hecho... ganas 20 puntos");
	            this.setVida(this.getVida() + 20);
	            System.out.println("Tu reputación es de " + this.getVida());
	            Usuario.getInstance().darPuntuacion(10);
	        } else if (opcionmini5 == 2) {
	            System.out.println("Has quedado como un soso, borde y tímido... pierdes -15 puntos");
	            this.setVida(this.getVida() - 15);
	            System.out.println("Tu reputación es de " + this.getVida());
	        } else if (opcionmini5 == 3) {
	            System.out.println("Has quedad como un intenso y encima resulta que te has confundido y no era ella, y justo ella que estaba al lado te ha visto como vas a abrazarla con entusiasmo a otra chica y se ha pensado que estás con otra, cagadón histórico... pierdes -100 puntos");
	            this.setVida(this.getVida() - 100);
	            System.out.println("Tu reputación es de " + this.getVida());
	        } else {
	            System.out.println("Opción no válida");
	            minijuego5();
	            
	        }
	    }
	    
	   public void comprobacionFinalReputacion() {
		   if (this.getVida() >= 100) {
			    System.out.println("Eres un auténtico ligón. Todas se rinden ante ti ");
			    Finales.finalRevision(12);
			} else if (this.getVida() >= 30 && this.getVida() <100) {
			    System.out.println("La chica se ha quedado contenta, puede que salga una relación de aqui...");
			    Finales.finalRevision(13);
	   }
	
	   }
	   }


