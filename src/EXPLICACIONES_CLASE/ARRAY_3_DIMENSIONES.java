package EXPLICACIONES_CLASE;

import java.util.Arrays;

public class ARRAY_3_DIMENSIONES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] cubo = { {{1,2},{3,4}} , {{5,6},{7,8}} , {{9,10},{11,12}} };
		int[][][] cubocero = new int[3][2][2]; // INICIALIAZAR LO DE ARRIBA A 0
		// piso, filo, columna
		System.out.println(cubo.length); // MIDE LOS TRES BLOQuES
		System.out.println(cubo[1].length); // MIDE LOS DOS BLOQUES DENTRO DE LOS TRES BLOQUES
		System.out.println(cubo[1][1].length); // MIDE EL INTERIOR DE LOS TRES BLOQUES Y LOS DOS BLOQUES DE DENTRO
		System.out.println(Arrays.toString(cubo[0][1])); // PASAR ARRAY A STRING SALE PORQUE ES UNIDIMENSIONAL
		
		for(int i=0; i<cubo.length; i++) {
			for( int j=0; j<cubo[i].length; j++) {
				for( int k=0; k<cubo[i][j].length; k++) {
					System.out.print(cubo[i][j][k]); // PARA IMPRIMIR LOS NUMEROS DENTRO DE LOS BLOQUES
					System.out.print(" ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
		}
	}

}
