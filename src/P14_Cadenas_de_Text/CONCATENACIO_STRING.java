package P14_Cadenas_de_Text;

import java.util.Scanner;

public class CONCATENACIO_STRING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		String Frase1;
		String Frase2;
		System.out.println("Escriu una frase: ");
		Frase1 = lector.nextLine();
		System.out.println("Escriu una segona frase: ");
		Frase2 = lector.nextLine();
		
		System.out.println(Frase1.concat(" " + Frase2));
	}

}
