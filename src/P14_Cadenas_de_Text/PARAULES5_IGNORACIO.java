package P14_Cadenas_de_Text;

import java.util.Scanner;

public class PARAULES5_IGNORACIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		String Paraules;
		String[] Array = new String[5];
		String[] ArrayAux = new String[5];
		int contador = Array.length;
		System.out.println("Introdueix 5 paraules: ");
		for(int i=0; i<5; i++) {
			Paraules = lector.next();
			lector.nextLine();
			Array[i] = Paraules;
			System.out.println(Paraules);
		}
		System.out.println("Array normal: ");
		for(int i=0; i<Array.length; i++) {
			System.out.print(" " + Array[i]);
		}
		System.out.println();
		for(int i=0; i<Array.length; i++) {
			ArrayAux[contador-1] = Array[i];
			contador--;
		}
		System.out.println("Array a la inversa: ");
		for(int i=0; i<Array.length; i++) {
			System.out.print(" " + ArrayAux[i]);
		}
	}

}
