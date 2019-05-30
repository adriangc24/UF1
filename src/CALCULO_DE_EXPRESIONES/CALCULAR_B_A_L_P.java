package CALCULO_DE_EXPRESIONES;

import java.util.Scanner;

public class CALCULAR_B_A_L_P {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		int b;
		int h;
		int l;
		int s;
		while(true) {
		System.out.println("Intrudeix la base del quadrat: ");
			if(lector.hasNextInt()) {
				b = lector.nextInt();
				break;
			}
			lector.nextLine();
		}
		while(true) {
		System.out.println("Intrudeix l'alçada del quadrat: ");
			if(lector.hasNextInt()) {
				h = lector.nextInt();
				break;
			}
			lector.nextLine();
		}
		l = 2*b+2*h;
		s = b*h;
		System.out.println("El perimetre del quadrat es: " + l + " i la seva area es: " + s);
	}

}*/
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int r;
		double a;
		double pi = 3.1416;
		double p;
		double v;
		while(true) {
			System.out.println("Introdueix un numero enter: ");
			if(lector.hasNextInt()) {
				r = lector.nextInt();
				break;
			}
			lector.nextLine();
		}
		a =pi*Math.pow(r, 2);
		p = 2*pi*r;
		v = r;
		System.out.println("L'area del cercle sera: " + a);
		System.out.println("El perimetre del cercle sera: " + p);
	}
}
