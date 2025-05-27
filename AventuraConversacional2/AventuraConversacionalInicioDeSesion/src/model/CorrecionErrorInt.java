package model;

import java.util.Scanner;



public class CorrecionErrorInt {
	
	private Scanner sc;
	private static CorrecionErrorInt instance = null;

	public CorrecionErrorInt(Scanner sc) {
		this.sc = sc;
	}
	public CorrecionErrorInt() {
		
	}
	public static CorrecionErrorInt getInstance(){
		
		if(instance == null) {
			
			instance = new CorrecionErrorInt();
		}
		return instance;
	}
	
	public int correcionDeErrores () {
		Scanner sc = new Scanner(System.in);
		int opcionIntroducida =0;
		try {
			opcionIntroducida = sc.nextInt();
			System.out.println(opcionIntroducida);
			
		} catch ( java.util.InputMismatchException e) {
			System.out.println("INTRODUCE UNA OPCION VALIDA, LEE ANTES DE ESCRIBIR");
			sc.nextLine();
			
		}
		return opcionIntroducida;
	}
	

}
