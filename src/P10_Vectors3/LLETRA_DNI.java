package P10_Vectors3;

import java.util.Scanner;

public class LLETRA_DNI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ArrayLletres = {"T", "R", "W", "A", "G", "H", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
		Scanner lector = new Scanner(System.in);
		int DNI;
		int posicio;
		while(true) {
			System.out.println("Introdueix el numero de DNI per saber la teva lletra: ");
			if(lector.hasNextInt()) {
				DNI = lector.nextInt();
				break;
			}
		System.out.println("Has posat malament el teu numero de DNI.");
		lector.nextLine();
		}
		posicio = DNI%23;
		System.out.println("El teu DNI complet amb la seva lletra es: " + DNI + " - " + ArrayLletres[posicio]);
	}

}
