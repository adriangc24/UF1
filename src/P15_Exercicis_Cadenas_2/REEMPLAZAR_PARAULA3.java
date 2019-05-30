package P15_Exercicis_Cadenas_2;

public class REEMPLAZAR_PARAULA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Frase = "Hola aixo es un String";
		String[] ArrayFrase = Frase.split(" ");
		for(int i=0; i<ArrayFrase.length; i++) {
			if(ArrayFrase[i].equalsIgnoreCase("hola")) {
				ArrayFrase[i] = "bye";
			}
		}
		for(int i=0; i<ArrayFrase.length; i++) {
			System.out.print(" " + ArrayFrase[i]);
		}
	}

}
