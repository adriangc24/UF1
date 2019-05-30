package EXAMEN_1;

import java.util.Scanner;

public class NUM_SUMATS_NUM_NOSUMATS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int suma = 0;
		int contador = 0;
		int contadorNums = 0;
		int resultat = 0;
		String continuar = "S";
		int[] numsNoComptats = new int[20];
		
		do {
			for (int i = 0; i < numsNoComptats.length; i++) {
				numsNoComptats[i] = -1;
			}
			contadorNums = 0;
			do {
				
				System.out.println("Introdueix 20 números enters, pot ser en la mateixa línia separats per un espai. ("
						+ contadorNums + " / 20)");
				System.out
						.println("Els números compressos entre 0 i 10 (ambdòs no incluits) te'ls sumaré i faré mitja.");
				if (sc.hasNextInt()) {
					contadorNums++;
					num = sc.nextInt();
					if (num > 0 && num < 10) {
						suma = suma + num;
						contador++;
					} else {
						numsNoComptats[contadorNums] = num;
					}
				} else {
					sc.next();
					
				}
				
				
			} while (num != -1 && contadorNums < 20);
			if (contador != 0) {
				resultat = suma / contador;
				System.out.println(
						"La mitjana dels números compressos entre 0 i 10 sense incluir aquests és: " + resultat);

			} else {
				System.out.println("No s'ha introduït cap número vàlid.");
			}
			System.out.print("Els números que no s'han tingut en compte a la suma són: ");
			for (int j = 0; j < numsNoComptats.length; j++) {
				if (numsNoComptats[j] != -1) {
					System.out.print(numsNoComptats[j] + " / ");
				}
			}
			System.out.println();
			do {
				System.out.println("Vols continuar? (S/N) (Distingueix majúscules i minúscules).");
				if (sc.hasNext()) {
					continuar = sc.next();
				}
			} while (!continuar.equals("S") && !continuar.equals("N"));
		} while (continuar.equals("S"));
		sc.close();
	}

}
