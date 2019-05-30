package Ajedrez;

import java.util.Arrays;

public class AJEDREZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] Tablero = new String[16][16];
		boolean x = false;
		for(int i=0; i<Tablero.length; i++) {
			for(int j=0; j<Tablero[i].length; j=j+2) {
				if(i%2 == 0) {
					Tablero[i][j] = "##";
					Tablero[i][j+1] = " ";
				}else if(i%2 != 0) {
					Tablero[i][j] = " ";
					Tablero[i][j+1] = "##";
				}
		}
		}
		for(int i=0; i<Tablero.length; i++) {
				System.out.println(Arrays.toString(Tablero[i]));
		}
	}

}
