package P15_Exercicis_Cadenas_2;

import java.util.Arrays;
import java.util.Scanner;

public class CONCATENACIO_DUES_FRASES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		System.out.println("Introdueix una frase: ");
		String Frase1 = lector.nextLine();
		String[] ArrayFrase1 = new String[1];
		ArrayFrase1[0] = Frase1;
		System.out.println("Introdueix una altre frase: ");
		String Frase2 = lector.nextLine();
		String[] ArrayFrase2 = new String[1];
		ArrayFrase2[0] = Frase2;
		String[] ArrayFrases = new String[1];
		ArrayFrases[0] = ArrayFrase1[0] + " " + ArrayFrase2[0];
		System.out.println(Arrays.toString(ArrayFrases));
	}

}
