package P14_Cadenas_de_Text;

import java.util.Scanner;

public class ARRODONIR_CAP_AMUNT_PARAULES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		System.out.println("Escriu una frase de 5 paraules");
		String[] Frase = new String[5];
		for( int i=0; i<5; i++) {
			Frase[i] = lector.next();
		}
		for(int i=0; i<Frase.length; i++) {
			int meitat = Frase[i].length()/2;
			if(Frase[i].length()%2 != 0) {
				meitat++;
			}
			String meitatCadena = Frase[i].substring(0, meitat);
			System.out.println(meitatCadena);
		}
	}

}
