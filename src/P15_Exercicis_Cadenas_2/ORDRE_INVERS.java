package P15_Exercicis_Cadenas_2;

public class ORDRE_INVERS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Frase = "Estic fent un String";
		for(int i=Frase.length()-1; i>=0; i--) {
			System.out.print(Frase.charAt(i));
		}
	}

}
