package P15_Exercicis_Cadenas_2;

public class CERCAR_UNA_PARAULA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Frase = "Hola estic fent un String. Hola aixo es un altre String";
		System.out.println("--A--");
		System.out.println(Frase.indexOf("Hola"));
		String[] FraseArray = Frase.split(" ");
		int contador = 0;
		for(int i=0; i<FraseArray.length; i++) {
			if(FraseArray[i].equalsIgnoreCase("hola")) {
				contador++;
			}
		}
		System.out.println("--B--");
		System.out.println("La paraula Hola sortit: " + contador);
	}

}
