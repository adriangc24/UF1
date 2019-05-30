package CALCULO_DE_EXPRESIONES;

import java.util.Scanner;

public class Conversio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int C=0;
		double F;
		while (true) {
			System.out.println("Introdueix el graus Celsius que vols convertir: ");
			if (sc.hasNextInt()) {
				C = sc.nextInt();
				break;
			}
			else {
				System.out.println("Torna a introduir ");
			}
			sc.nextLine();
		}
		F = C*1.8+32;
		System.out.println("La conversio de Celsius a Fahrenheit es: " + F);
	}

}
