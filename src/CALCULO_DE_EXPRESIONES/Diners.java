package CALCULO_DE_EXPRESIONES;

import java.util.Scanner;

public class Diners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		int c; // Capital Inicial
		int x; // Tassa de interes
		int n; // Numero de anys
		int cn; // Quantitat de diners a pagar
		while (true) {
			System.out.println("Introdueix la capital inicial: ");
			if (lector.hasNextInt()) {
				c = lector.nextInt();
				break;
			}
			lector.nextLine();
			}
		while (true) {
			System.out.println("Introdueix la tassa de interes: ");
			if (lector.hasNextInt()) {
				x = lector.nextInt();
				break;
			}
			lector.nextLine();
			}
		while (true) {
			System.out.println("Introdueix el numero anys: ");
			if (lector.hasNextInt()) {
				n = lector.nextInt();
				break;
			}
			lector.nextLine();
			}
		cn = c * (1+x/100) ^ n;
		System.out.println("Els diners a pagar seran: " + cn);
	}

}
