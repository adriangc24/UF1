package CONDICIONAL_1;

import java.util.Scanner;

public class GRAU_EDIFICIENCIA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		int Cdefect; // Cargols defectuosos
		int Cpro; // Cargols produits
		while (true) {
			System.out.println("Intrudeix el numero de cargols defectuosos: ");
			if(lector.hasNextInt()) {
				Cdefect = lector.nextInt();
				break;
			}
			lector.nextLine();
		}
		while (true) {
			System.out.println("Introdueix el numero de cargols produits: ");
			if(lector.hasNextInt()) {
				Cpro = lector.nextInt();
				break;
			}
			lector.nextLine();
		}
		if (Cdefect > 200 && Cpro < 1000) {
			System.out.println("El teu grau de eficiencia es 5");
		}else if (Cdefect < 200 && Cpro < 1000) {
			System.out.println("El teu grau de eficiencia es 6");
		}else if (Cdefect > 200 && Cpro > 1000) {
			System.out.println("El teu grau de eficiencia es 7");
		}else if (Cdefect < 200 && Cpro > 1000) {
			System.out.println("El teu grau de eficiencia es 8");
		}
	}

}
