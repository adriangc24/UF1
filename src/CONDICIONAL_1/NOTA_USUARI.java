package CONDICIONAL_1;

import java.util.Scanner;

public class NOTA_USUARI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		int nota;
		while (true) {
			System.out.println("Introdueix la teva nota: ");
			if(lector.hasNextInt()) {
				nota = lector.nextInt();
				break;
			}
			System.out.println("ERROR!");
			lector.nextLine();
		}
		if (nota >= 5) {
			System.out.println("Has aprobat!");
		}else {
			System.out.println("Has suspes!");
		}
		if (nota == 5) {
			System.out.println("Has tret un suficient.");
		}else if (nota > 5 && nota < 6.5) {
			System.out.println("Has tret un be.");
		}else if (nota > 6.5 && nota < 8.5) {
			System.out.println("Has tret un notable.");
		}else if (nota >= 8.5 && nota < 10.5) {
			System.out.println("Has tret un excelent.");
		}
	}

}
