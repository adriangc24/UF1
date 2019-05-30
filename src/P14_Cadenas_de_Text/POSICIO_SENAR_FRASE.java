package P14_Cadenas_de_Text;

import java.util.Scanner;

public class POSICIO_SENAR_FRASE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		System.out.println("Escriu una frase de diverses paraules:");
		String Frase = lector.nextLine();
		 
		String[] Paraules = Frase.split(" ");
		for(int i = 0; i < Paraules.length; i = i + 2) {
		System.out.print (Paraules[i] + " ");
		}
	}

}
