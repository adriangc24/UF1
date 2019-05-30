package P12_Vector_Ordenacio;

import java.util.Scanner;

public class DEMANAR_ORDENAR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		int[] Array = new int[10];
		int contador = 0;
		while ( contador < Array.length ) {
			System.out.println("Introdeuix numero per el array: ");
			if(lector.hasNextInt()) {
				Array[contador] = lector.nextInt();
				contador++;
			}else {
				System.out.println("Error!!");
				lector.nextLine();
			}
		}
		System.out.println("Numero de array introduits");
		for(int i=0; i<Array.length; i++) {
			System.out.print(" " + Array[i]);
		}
		System.out.println();
		for (int i = 0; i < Array.length - 1; i++) {
			for (int j = i + 1; j < Array.length; j++) {
			if (Array[i] > Array[j]) {
			int aux = Array[i];
			Array[i] = Array[j];
			Array[j] = aux;
			}

			}
		}
		System.out.println("Array Ordenada: ");
		for( int i=0; i<Array.length; i++) {
			System.out.print(" " + Array[i]);
		}
	}

}
