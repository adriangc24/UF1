package CONDICIONAL_1;

import java.util.Scanner;

public class TEMPS_ESTACIONAMENT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		double cost1 = 1.5; //Coste primera hora
		int cost2 = 2; // Coste segunda hora en endavant
		double costF; //Cost final
		double entrada;
		double sortida;
		double horariF;
		while (true) {
			System.out.println("Introdueix la hora de entrada al estacionament:");
			if(lector.hasNextDouble()) {
				entrada = lector.nextDouble();
				break;
			}
			lector.nextLine();
		}
		while (true) {
			System.out.println("Introdueix la hora de sortida al estacionament:");
			if(lector.hasNextDouble()) {
				sortida = lector.nextDouble();
				break;
			}
			lector.nextLine();
		}
		horariF=sortida-entrada;
		if (horariF <= 1) {
			System.out.println("El teu cost del estacionament es: " + cost1);
		}else if(horariF > 1) {
			costF=cost1+(cost2*(horariF-1));
			System.out.println("El teu cost final del estacinament es: " + costF);
		}
	}

}
