package P15_Exercicis_Cadenas_2;

public class REEMPLAZAR_PARAULA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Frase = "Hola estic fent un String";
		String[] ArrayFrase = Frase.split(" ");
		String Frase2;
		for(int i=0; i<ArrayFrase.length; i++) {
			if(ArrayFrase[i].equalsIgnoreCase("hola")) {
				ArrayFrase[i] = "Lola";
			}
		}
		for(int i=0; i<ArrayFrase.length; i++) {
			System.out.print(" " + ArrayFrase[i]);
		}
	}

}
