package P10_Vectors3;

import java.util.Arrays;
import java.util.Scanner;

public class BASES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean opcionvalida = false;
		int N = 0;
		int digitos = 0;
		do {
			System.out.println("Introdueix N");
			if (scanner.hasNextInt()) {
				N = scanner.nextInt();
				if (N >= 0) {
					opcionvalida = true;
				}
			}
			else {
				scanner.next();
			}
		}
		while (opcionvalida != true);
		int x = 0;
		int[] Vector1 = new int[N];
		int[] Vector2 = new int[N];
		int Total = 0;
		boolean validador = false;
		int base = 0;
		do {
			do {
				System.out.println("introdueix num de " + N + " digits");
				if (scanner.hasNextInt()) {
					x = scanner.nextInt();
					int y=x;
					opcionvalida = true;
					digitos=0;							//hay q igualarlo a 0 para que se resetee en cada vuelta
					while (y != 0) {
						y = y / 10; 
						digitos++;            //contador para saber el num de digitos
					}
				} else {
					scanner.next();
				}
				for (int i = Vector1.length - 1; i >= 0; i--) {
					Vector1[i] = x % 10;
					x = x / 10;
				}
				//System.out.println(Arrays.toString(table));
				//System.out.println(Vector1.length);
				//System.out.println(digitos); //
				if (digitos != Vector1.length) {
					opcionvalida = false;
				}
			} while (opcionvalida != true);

			validador = false;
			System.out.println("Introdueix Base");
			if (scanner.hasNextInt()) {
				base = scanner.nextInt();
				validador = true;
				for (int i = 0; i < Vector1.length; i++) {
					if ((Vector1[i] >= base)) {
						validador = false;
						// System.out.println(validador);
					}
				}
				if ((base < 2) || (base > 8)) {
					validador = false;
					// System.out.println(validador);
				}
			} else {
				scanner.next();
			}
		} while (validador != true);
		for (int i = 0; i < Vector2.length; i++) {
			Vector2[i] = (int) (Vector1[i] * Math.pow(base, N - i - 1));
		}
		System.out.println(Arrays.toString(Vector2));
		for (int i = 0; i < Vector2.length; i++) {
			Total = Total + Vector2[i];
		}
		System.out.println(Total);
	}

}
