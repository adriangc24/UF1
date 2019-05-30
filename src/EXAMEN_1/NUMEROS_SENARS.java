package EXAMEN_1;

import java.util.Scanner;

public class NUMEROS_SENARS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int contador = 3;
		boolean numValid = true;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introdueix un número i et diré els nombres primers més petits que ell:");
			if (sc.hasNextInt()) {
				num = sc.nextInt();
				System.out.println("Número enter " + num + " llegit.");
				numValid = true;
			} else {
				System.out.println("No es un número enter!");
				numValid = false;
				sc.next();
			}
		} while (numValid == false);
		sc.close();
		System.out.println("Resultat: ");
		for (int i = 0; i <= num; i++) {
			if (contador <= 2) {
				System.out.print(i - 1 + " / ");
			}
			contador = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					contador++;

				}

			}
		}
	}

}
