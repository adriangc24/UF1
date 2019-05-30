package P12_Vector_Cerca_Binaria;

import java.util.Scanner;

public class COMPROBACIO_NUM_INGRESAT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		int[] Vector1 = new int[10];

		for (int i = 0; i < Vector1.length; i++) {
			System.out.println("Introdueix num");
			if (lector.hasNextInt()) {
				Vector1[i] = lector.nextInt();
				if (i > 0) {
					for (int j = 0; j < i; j++) {
						if (Vector1[j] == Vector1[i]) {
							System.out.println("Aquest numero ja existeix, torna a introduir un altre");
							i = i - 1;
						}
					}
				}
				else {
					lector.next();
				}
			}
		}
		System.out.println();
		for(int i=0; i<Vector1.length; i++) {
		System.out.print(" " + Vector1[i]);
		}
	}

}
