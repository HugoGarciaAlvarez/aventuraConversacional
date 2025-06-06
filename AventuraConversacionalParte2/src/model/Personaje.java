package model;



public class Personaje  {
	private String nombre;
	private int vida;
	private int vidaMax;
	private String ataques [] = {"","",""};
	private int danoAtaques[] = {0,0,0};
	
	
	public Personaje() {
		
	}

	public Personaje(String nombre, int vida, int vidaMax, String[] ataques, int[] danoAtaques) {
	
		this.nombre = nombre;
		this.vida = vida;
		this.vidaMax = vidaMax;
		this.ataques = ataques;
		this.danoAtaques = danoAtaques;
		
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getVidaMax() {
		return vidaMax;
	}

	public void setVidaMax(int vidaMax) {
		this.vidaMax = vidaMax;
	}

	public String[] getAtaques() {
		return ataques;
	}

	public void setAtaques(String[] ataques) {
		this.ataques = ataques;
	}
	
	public String getAtaqueIndice(int i) {
	    if (i < 0 || i >= ataques.length) {
	        throw new IllegalArgumentException("Índice de ataque fuera de rango");
	    }
	    return ataques[i];
	}

	public void setAtaqueIndice(int i, String ataque) {
	    if (i < 0 || i >= ataques.length) {
	        throw new IllegalArgumentException("Índice de ataque fuera de rango");
	    }
	    ataques[i] = ataque;
	}

	public int[] getDanoAtaques() {
		return danoAtaques;
	}

	public void setDanoAtaques(int[] danoAtaques) {
		this.danoAtaques = danoAtaques;
	}
	
	public int getDanoAtaqueIndice(int i) {
	    if (i < 0 || i >= danoAtaques.length) {
	        throw new IllegalArgumentException("Índice de daño de ataque fuera de rango");
	    }
	    return danoAtaques[i];
	}

	public void setDanoAtaqueIndice(int i, int dano) {
	    if (i < 0 || i >= danoAtaques.length) {
	        throw new IllegalArgumentException("Índice de daño de ataque fuera de rango");
	    }
	    danoAtaques[i] = dano;
	}
	
	
	


	@Override
	public String toString() {
	    return "" +
	           "  🔤 Nombre: " + nombre + "\n" +
	           "  ❤️ Vida: " + vida + " / " + vidaMax + "\n" +
	           
	           "";
	}
	
	
	public void imprimirPersonaje() {
		System.out.println(toString());
	}
	
	
	public static void elecionPersonaje() {
		int opcion =0;
		
		
		System.out.println("antes de comenzar con tu aventura selecciona uno de estos tres personajes");
		do {
		System.out.println("1)Granjero");
		System.out.println("2)Minero");
		System.out.println("3)Ligon");
		System.out.println("4)Salir");
		opcion = CorrecionErrorInt.getInstance().correcionDeErrores();
		
		
		}while(opcion<1 || opcion>4);
		
		//Personaje.mensajeComun();
		if(opcion ==1) {
			Granjero.iniciarAventuraGranjero();
		}else if (opcion==2) {
			Minero.iniciarAventuraMinero();
		}else if(opcion ==3) {
			Ligon.iniciarAventuraLigon();
		}
		
		
		
		
	}
	
	
		
		
		
		
	}
	
	

