package P14_Cadenas_de_Text;

import java.util.Scanner;

public class CUANTAS_LLETRES_HI_HA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		String CadenaText = lector.nextLine();
		char[] arrayChar = CadenaText.toCharArray();
		String lletra = "v";
		int contador = 0;
		for(int i=0; i<CadenaText.length(); i++) {
			if(CadenaText.charAt(i) == lletra.charAt(0)) {
				contador++;
			}else if(CadenaText.charAt(i) == lletra.charAt(0) && contador <=1) {
				contador=1;
			}
		}
		if(contador == 0) {
			System.out.println("No hi ha cap ve");
		}else if (contador == 1) {
			System.out.println("Nomes hi ha una ve");
		}else if (contador > 1) {
			System.out.println(CadenaText.indexOf("v"));
			System.out.println(CadenaText.lastIndexOf("v"));
		for(int i=CadenaText.indexOf("v"); i<CadenaText.lastIndexOf("v")+1; i++) {
			System.out.print(arrayChar[i]);
		}
			
		}
	}

}
