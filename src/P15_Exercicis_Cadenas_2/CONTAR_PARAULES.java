package P15_Exercicis_Cadenas_2;

import java.util.Scanner;

public class CONTAR_PARAULES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		String Frase = lector.nextLine();
		String[] Frase1 = Frase.split(" ");
		System.out.println(Frase1.length);
	}

}
