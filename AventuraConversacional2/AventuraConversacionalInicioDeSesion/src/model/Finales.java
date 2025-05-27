package model;

public class Finales {
	
	public static void finalRevision(int finalesIn) {
		
		switch (finalesIn) {
	    case 1:
	        System.out.println("La vida de tu personaje es 0 has muerto");
	        
	        break;
	    case 2:
	        System.out.println("Has comprado el billete de ida a la ciudad");
	        Usuario.getInstance().darPuntuacion(50);
	        break;
	    case 3:
	        System.out.println("Has completado el centro civico ");
	        Usuario.getInstance().darPuntuacion(50);
	        break;
	     
	    case 4:
	        System.out.println("Has conseguido 150 euros,has logrado el final financiero ");
	        Usuario.getInstance().darPuntuacion(100);
	        break;
	        
	    case 5:
	        System.out.println("No llegaste a la meta dinero ");
	        break;
	        
	    case 6:
	        System.out.println("Has completado el centro civico ");
	        Usuario.getInstance().darPuntuacion(50);
	        break;
	        
	    case 7:
	        System.out.println("Has encontrado la pepita de oro has ganado el juego  ");
	        Usuario.getInstance().darPuntuacion(50);
	        break;
	        
	    case 8:
	        System.out.println("Has conseguido la piedra luminosa, has ganado el juego  ");
	        Usuario.getInstance().darPuntuacion(50);
	        break;
	    
	    case 9:
	        System.out.println("Has logrado salir de  la mina ganaste,, Fin del juego");
	        Usuario.getInstance().darPuntuacion(50);
	        break;
	        
	    case 10:
	        System.out.println("te has tropezado y te has caido,ten mas suerte la proxima vez. Fin del juego");
	        break;
	        
	    case 11:
	        System.out.println("Debido a tu gusto por los mejores memes de internet ganas el juego felicidades. Fin del juego");
	        Usuario.getInstance().darPuntuacion(50);
	        break;
	        
	        
	    case 12:
	        System.out.println("Debido a tu belleza todas se rinden ante ti.Has ganado guapo");
	        Usuario.getInstance().darPuntuacion(100);
	        break;
	        
	        
	    case 13:
	        System.out.println("Hay posibilidades con la chica pero no te flipes ligon todavia no cantes victoria");
	        break;
	    
	    default:
	        System.out.println("Opción no válida");
	}
		
		Menu.creditos();
		
	}
	
	public static void revisionFinalesEstadisticas() {
		if(Economia.getInstance().getDinero()>=150) {
			Finales.finalRevision(4);
		}else {
			Finales.finalRevision(5);
		}
	}
}
