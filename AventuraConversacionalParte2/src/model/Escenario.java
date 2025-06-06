package model;

public class Escenario {
	
	
	public static int elegirEscenarioAleatoreamiente(int numero) {
		if(numero==1) {
			System.out.println("Parece ser que hoy es soleado, no hay penalización");
		}else if(numero ==2) {
			System.out.println("Oh no esta lloviendo y se esta embarrando el terreno, hay penalización");
		}else if(numero ==3) {
			System.out.println("Al estar en una cueva y no saber de tu exterior, hay penalización multiple");
		}
		return numero;
		
	}
	public static int penalizacion (int numero) {
		int penalizacion =0;
		if(numero ==1) {
			penalizacion = 0;
		}else if(numero ==2) {
			penalizacion = 5;
		}else if(numero ==3) {
			penalizacion =10;
		}
		return penalizacion;
	}	
}


