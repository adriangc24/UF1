package P15_Exercicis_Cadenas_2;

public class PARAULES_ORDRE_ALFABETIC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Frase1 = ("Estic fent un String");
		String Frase2 = ("Aixo es un String");
		
		int comparacio = Frase1.compareToIgnoreCase(Frase2);
		if(comparacio < 0) {
			System.out.println("Fras1 es primera per ordre alfabetic " + Frase1);
		}
		else if (comparacio > 0) {
		System.out.println("Frase2 es primera per ordre alfabetic: " + Frase2);	
		}else {
			System.out.println("Les dues paraules son iguals");
		}
	}

}
