package EXAMEN_1;

import java.util.Scanner;

public class DNI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dni = 0;
		int posLletra = 0;
		boolean dniValid = true;
		char[] arrayLletres = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
				'V', 'H', 'L', 'C', 'K', 'E' };
		do {
			System.out.println(
					"Introdueix un DNI i et diré la lletra que li correspon.\n(Tingues en compte que un DNI està format només per números enters).");
			if (sc.hasNextInt()) {
				dni = sc.nextInt();
				posLletra = dni % 23;
				dniValid = true;
			} else {
				System.out.println("No és un DNI vàlid.");
				dniValid = false;
				sc.next();
			}
		} while (dniValid == false);
		sc.close();
		System.out.println("El NIF resultant és: " + dni + arrayLletres[posLletra]);
	}

}
