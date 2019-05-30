package CALCULO_DE_EXPRESIONES;

import java.util.Scanner;

public class CALCULA_EL_CUADRADO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("Introdueix un numero enter: ");
			if(lector.hasNextInt()) {
				num = lector.nextInt();
				break;
			}
			lector.nextLine();
		}
		System.out.println("El numero al quadrat del numero introduit es: " + num*num);
	}

}
