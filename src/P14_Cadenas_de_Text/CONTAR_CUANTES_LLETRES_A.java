package P14_Cadenas_de_Text;

public class CONTAR_CUANTES_LLETRES_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String CadenaText = "Esto es un string declarada";
		System.out.print("La quantitat de a que conte el string son: ");
		String lletra = "a";
		int contador = 0;
		for(int i=0; i<CadenaText.length(); i++) {
			if(CadenaText.charAt(i) == lletra.charAt(0)) {
				contador++;
			}
		}
		System.out.println(contador);
		
	}

}
