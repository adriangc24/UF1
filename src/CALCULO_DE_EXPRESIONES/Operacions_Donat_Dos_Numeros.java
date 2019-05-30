package CALCULO_DE_EXPRESIONES;

import java.util.Scanner;

public class Operacions_Donat_Dos_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		int numA;
		int numB;
		int s; //suma
		int r; //resta
		int d; //divisio
		int m;	//multiplicacio
		while (true) {
			System.out.println("Introdueix el primer numero: ");
			if (lector.hasNextInt()) {
				numA = lector.nextInt();
				break;
			}
			lector.nextLine();
		}
		while (true) {
			System.out.println("Introdueix el segon numero: ");
			if (lector.hasNextInt()) {
				numB = lector.nextInt();
				break;
			}
			lector.nextLine();
		}
		s=numA+numB;
		r=numA-numB;
		d=numA/numB;
		m=numA*numB;
		System.out.println("La seva suma sera: " + s);
		System.out.println("La seva resta sera: " + r);
		System.out.println("La seva divisio sera: " + d);
		System.out.println("La seva multiplicacio sera: " + m);
	}

}
