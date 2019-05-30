package P14_Cadenas_de_Text;

import java.util.Scanner;

public class SUMA_VALORS_INDIVIDUALS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		 
		System.out.println("Escriu un text de numeros separats per comas:");
		String Text = lector.nextLine();
		 
		String[] ArrayNums = Text.split(",");
		int Suma = 0;
		for(int i = 0; i < ArrayNums.length; i++) {
		int valor = Integer.parseInt(ArrayNums[i]);
		Suma = Suma + valor;
		}
		System.out.println("La suma de tots el numeros separats es igual a " + Suma);
	}

}
