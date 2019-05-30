package EXAMEN_1;

public class MITJANES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayNumerosAleatorios = new int[20];
		int[] contador = new int[12];
		int[] arrayMitjanaPosicions = new int[12];
		for (int m = 0; m < ((int) (Math.random() * 11) + 5); m++) {
			for (int i = 0; i < arrayNumerosAleatorios.length; i++) {
				arrayNumerosAleatorios[i] = (int) (Math.random() * 12);
			}

			for (int j = 0; j < arrayMitjanaPosicions.length; j++) {
				for (int k = 0; k < arrayNumerosAleatorios.length; k++) {
					if (arrayNumerosAleatorios[k] == j) {
						arrayMitjanaPosicions[j] = arrayMitjanaPosicions[j] + k;
						contador[j]++;
					}

				}
				
			}
		}
		for(int o = 0; o < arrayMitjanaPosicions.length; o++) {
			if (contador[o] != 0) {
				arrayMitjanaPosicions[o] = arrayMitjanaPosicions[o] / contador[o];
			}
		}
		System.out.print("arrayNumerosAleatorios: { ");
		for (int l = 0; l < arrayNumerosAleatorios.length; l++) {
			System.out.print(arrayNumerosAleatorios[l] + ", ");
		}
		System.out.println(" }");
		System.out.print("arrayMitjanaPosicions: { ");
		for (int p = 0; p < arrayMitjanaPosicions.length; p++) {
			System.out.print(arrayMitjanaPosicions[p] + ", ");
		}
		System.out.println(" }");
	}

}
