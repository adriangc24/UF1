package P10_Vectors3;

import java.util.Scanner;

public class ESCANYOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		int numEsc; // Cuantitat de Escons a repatir
		int numPartits; // Quantitat de partits
		int contador = 1; // Contador per als escons
		float max = 0; // contador per el mes gran de vots
		while (true) {
			System.out.println("Introdueix el numero de partits que hi ha: ");
			if (lector.hasNextInt()) {
				numPartits = lector.nextInt();
				break;
			}
			lector.nextLine();
		}
		while (true) {
			System.out.println("Introdueix el numero de escons a repartir: ");
			if (lector.hasNextInt()) {
				numEsc = lector.nextInt();
				break;
			}
			lector.nextLine();
		}
		float[] ArrayVots = new float[numPartits];
		int[] ArrayEsc = new int[numPartits];
		float[] ArrayAux = new float[numPartits];
		System.out.println("Introdueix la quantitat de vots de cada partit.");
		for (int i = 0; i < ArrayVots.length; i++) {
			if (lector.hasNextInt()) {
				ArrayVots[i] = lector.nextInt();
			} else {
				i--;
				lector.nextLine();
			}
		}
		for (int i = 0; i < ArrayVots.length; i++) {
			if(ArrayVots[i] > max) {
				max = ArrayVots[i];
			}
			
		}

		System.out.println("El partit amb mes vots es: " + max);
		for(int i=0; i<ArrayVots.length; i++) {
			if(ArrayVots[i] == max) {
				ArrayEsc[i] = ArrayEsc[i] + 1;
			}
		}
		for(int i=0; i<ArrayEsc.length; i++) {
			System.out.print(" " + ArrayEsc[i]);
		}
		System.out.println();
		
		while (contador < numEsc) {
			max = 0;
			for(int i=0; i<ArrayVots.length; i++) {
				ArrayAux[i] = ArrayVots[i]/(ArrayEsc[i]+1);
				System.out.print(" " + ArrayAux[i]);
			}
			System.out.println();
			for(int j=0; j<ArrayAux.length; j++) {
				if(ArrayAux[j] > max) {
					max = ArrayAux[j];
				}
			}
			System.out.println("Aqui maxim " + max);
			for(int k=0; k<ArrayAux.length; k++) {
				if(ArrayAux[k] == max) {
					ArrayEsc[k] = ArrayEsc[k] + 1;
				}
			}
			contador++;
		}
		System.out.println("El numero de escanys asignats als partits son els seguents: ");
		for(int i=0; i<ArrayEsc.length; i++) {
			System.out.print("Escanys Partit: " + " " + ArrayEsc[i] + " ");
		}
	}

}
