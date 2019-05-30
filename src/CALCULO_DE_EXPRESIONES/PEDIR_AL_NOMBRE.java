package CALCULO_DE_EXPRESIONES;

import java.util.Scanner;

public class PEDIR_AL_NOMBRE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		int num1;
		int num2;
		System.out.println("Introduce tu nombre: ");
		String nombre = lector.next();
		System.out.println("Hola " + nombre);
		while (true) {
			System.out.println("Introdueix un numero: ");
			if(lector.hasNextInt()) {
				num1 = lector.nextInt();
				break;
			}
			lector.nextLine();
			}
		while (true) {
			System.out.println("Introdueix un numero: ");
			if(lector.hasNextInt()) {
				num2 = lector.nextInt();
				break;
			}
			lector.nextLine();
			}
		System.out.println("El producte del numero1 i el numero2 es = " + num1*num2);
	}

}
