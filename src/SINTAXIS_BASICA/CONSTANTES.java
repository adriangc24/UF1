package SINTAXIS_BASICA;

public class CONSTANTES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor = 12.0;
		System.out.println(valor*1.3656);
		System.out.println(valor*1.3756); // MARGEN DE ERROR
		System.out.println(valor*1.3656);
	
		final double ConversioEuroDolar = 1.3656;

		System.out.println(valor*ConversioEuroDolar);
		System.out.println(valor*ConversioEuroDolar); // MARGEN DE ERROR 0
		System.out.println(valor*ConversioEuroDolar);
	}

}

