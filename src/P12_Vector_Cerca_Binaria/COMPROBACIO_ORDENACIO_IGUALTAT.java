package P12_Vector_Cerca_Binaria;

import java.util.Scanner;

public class COMPROBACIO_ORDENACIO_IGUALTAT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		int MesosTotal=0;
		int[] SouJoan = new int[12];
		int[] SouPere = new int[12];
		System.out.println("Introdueix els sous de Joan");
		for (int i = 0; i < SouJoan.length; i++) {
			System.out.println("Introdueix Sou del Joan");
			if (lector.hasNextInt()) {
				SouJoan[i] = lector.nextInt();
				if (i >= 0) {
					for (int j = 0; j < i; j++) {
						if (SouJoan[j] == SouJoan[i]) {
							System.out.println("Aquest sou ja existeix, torna a introduir un altre");
							i = i - 1;
						}
					}
				}
				else {
					lector.next();
				}
			}
		}
		System.out.println("Ara introdueix els Sous de Pere");
		for (int i = 0; i < SouPere.length; i++) {
			System.out.println("Introdueix Sou del Pere");
			if (lector.hasNextInt()) {
				SouPere[i] = lector.nextInt();
				if (i >= 0) {
					for (int j = 0; j < i; j++) {
						if (SouPere[j] == SouPere[i]) {
							System.out.println("Aquest sou ja existeix, torna a introduir un altre");
							i = i - 1;
						}
					}
				}
				else {
					lector.next();
				}
			}
		}		
		for (int i = 0; i < SouJoan.length - 1; i++) {
			for (int j = i + 1; j < SouJoan.length; j++) {
			if (SouJoan[i] > SouJoan[j]) {
			int aux = SouJoan[i];
			SouJoan[i] = SouJoan[j];
			SouJoan[j] = aux;
			}

			}
		}
		for (int i = 0; i < SouPere.length - 1; i++) {
			for (int j = i + 1; j < SouPere.length; j++) {
			if (SouPere[i] > SouPere[j]) {
			int aux = SouPere[i];
			SouPere[i] = SouPere[j];
			SouPere[j] = aux;
			}

			}
		}
		System.out.println();
		System.out.println("Array Ordenada Joan");
		for(int i=0; i<SouJoan.length; i++) {
			System.out.print(" " + SouJoan[i]);
		}
		System.out.println();
		System.out.println("Array Ordenada Pere");
		for(int i=0; i<SouPere.length; i++) {
			System.out.print(" " + SouPere[i]);
		}
		
		System.out.println();
		for(int i=0; i<SouJoan.length; i++) {
			for(int j=0; j<SouPere.length; j++) {
				if(SouJoan[i] == SouPere[j]) {
					MesosTotal++;
				}
			}
		}
		System.out.println("En Joan i en Pere han cobrat " + MesosTotal + " iguals.");
	}

}
