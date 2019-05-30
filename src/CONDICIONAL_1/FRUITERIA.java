package CONDICIONAL_1;

import java.util.Scanner;


public class FRUITERIA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		double kilos; // kilos del usuari
		double preu = 2.5; // preu del kilo
		double preuF; // preu final amb el descompte
		double descompte;
		double preuFdesco; // Preu final amb descompte
		while (true) {
			if(lector.hasNextDouble()) {
				System.out.println("Introdueix el kilos que has agafat: ");
				kilos = lector.nextDouble();
				break;
			}
			lector.nextLine();
		}
		if(kilos >= 0 && kilos <=2) {
			System.out.println("El teu descompte es del 0%");
			preuF = kilos * preu;
			System.out.println("El teu cost total es: " + preuF);
		}else if(kilos >= 2.01 && kilos <= 5) {
			System.out.println("El teu descompte sera del 10%");
			preuF = kilos * preu;
			descompte = preuF*0.10;
			preuFdesco = preuF - descompte;
			System.out.println("El preu final amb el descompte sera: " + preuFdesco);
		}else if(kilos >= 5.01 && kilos <= 10) {
			System.out.println("El teu descompte sera del 15%");
			preuF = kilos * preu;
			descompte = preuF*0.15;
			preuFdesco = preuF - descompte;
			System.out.println("El preu final amb el descompte sera: " + preuFdesco);
		}else if(kilos >= 10) {
			System.out.println("El teu descompte sera del 20%");
			preuF = kilos * preu;
			descompte = preuF*0.20;
			preuFdesco = preuF - descompte;
			System.out.println("El preu final amb el descompte sera: " + preuFdesco);
		}
	}

}
