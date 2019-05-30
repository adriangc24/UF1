package P13_Exercici_Matrius;

import java.util.Scanner;

public class NUM_POS_CAMBI_FILAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		int[][] ArrayMatriu = new int[3][3];
		int[][] ArrayMatriu2 = new int[3][3];
		String[][] String = new String[3][3];
		int aux = 0;
		System.out.println("Introdueix valor per omplir la matriu: ");
		for(int i=0; i<ArrayMatriu.length; i++) {
			for(int j=0; j<ArrayMatriu[i].length; j++) {
				int valor=lector.nextInt();
				if(valor > 0) {
					ArrayMatriu[i][j] = valor;
				}
				lector.nextLine();
			}
		}
		for(int i=0; i<ArrayMatriu.length; i++) {
			for(int j=0; j<ArrayMatriu[i].length; j++) {
				System.out.print(" " + ArrayMatriu[i][j]);
			}
		}
		//System.out.println(Arrays.toString(ArrayMatriu));
		System.out.println();
		for(int i=2; i>=0; i--) {
			for(int j=0; j<ArrayMatriu[i].length; j++) {
				System.out.print(" " + ArrayMatriu[i][j]);
				ArrayMatriu2[i][j] = ArrayMatriu[i][j];
			}
		}
		
		for(int i=0; i<ArrayMatriu.length; i++) {
			for(int j=0; j<ArrayMatriu[i].length; j++) {
				if(ArrayMatriu[i][j]>aux) {
					aux = ArrayMatriu[i][j];
				}
			}
		}
		System.out.println();
		System.out.println("El numero maxim es: " + aux);
		for(int i=0; i<ArrayMatriu.length; i++) {
			for(int j=0; j<ArrayMatriu[i].length; j++) {
				if(i == 0 && j == 0) {
					aux = ArrayMatriu[i][j];
				}
				else if(ArrayMatriu[i][j]<aux) {
					aux = ArrayMatriu[i][j];
				}
			}
		}
		System.out.println("El numero minim es: " + aux);
	}

}
