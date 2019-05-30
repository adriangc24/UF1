package P11_Vector_Aux;

import java.util.Arrays;

public class EJERCICIO_DE_IGUALES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Aleatorio[] = new double[10];

		for (int i = 0; i < Aleatorio.length; i++) {
			double X = (Math.random() * (300));

			Aleatorio[i] = X;

		}
		double gran = 0;
		System.out.println(Arrays.toString(Aleatorio));
		for (int j = 0; j < Aleatorio.length; j++) {
			if (Aleatorio[j] > gran) {
				gran = Aleatorio[j];
			}
		}
		System.out.printf("Valor: %.2f", gran );  // este es el valor mas grande , para truncarlo, lo dividimos entre 70, y dividiendo todos los num por el valor que te de, ninguno pasara de 70
		System.out.println();
		double truncat=gran/70;
		for (int i = 0; i < Aleatorio.length; i++) {
			System.out.printf("Valor: %7.2f", Aleatorio[i]);
			for (int j = 0; j < Aleatorio[i]/truncat; j++) {
				System.out.print("=");
			}
			System.out.print("");
			System.out.println();
		}
	}

}
