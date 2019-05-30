package P15_Exercicis_Cadenas_2;

public class FREQUENCIA_LLETRAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Frase = "pepe luis";
		String ArrayFrase = "abcdefghijklmnopqrstuvwxyz";
		int[] Array = new int[27];
		for(int i=0; i<ArrayFrase.length(); i++) {
			for(int j=0; j<Frase.length(); j++) {
				if(Frase.charAt(j) == ArrayFrase.charAt(i)) {
					Array[i]++;
				}
			}	
		}
		for(int i=0; i<Array.length; i++) {
			if(Array[i] != 0) {
				System.out.println(ArrayFrase.charAt(i) + ": " + Array[i] + " ocurrències");
			}
		}
	}

}
