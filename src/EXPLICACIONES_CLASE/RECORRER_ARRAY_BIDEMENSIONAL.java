package EXPLICACIONES_CLASE;

public class RECORRER_ARRAY_BIDEMENSIONAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { {2,7,9},{3,6,1},{7,4,2} };
		int arrx[][] = new int[3][3]; // INICIAR A 0 LO DE ARRIBA
		System.out.println(arr.length); // = 3, SI QUITAMOS {7,4,2} SERIA =2COGE LA LONGITUD DE LAS ARRAY {}
		System.out.println(arr[0].length); // = 3 COGE LA LONGITUD DENTRO DEL ARRAY
		for (int i=0; i <= 2; i++) { // RECORRER LAS FILAS
			for( int j=0; j<3; j++) { // RECORRER COLUMNAS
				System.out.print(" " + arr[i][j]);
			}
			System.out.println(); // SALTA DE LINEA LA FILA
			
		}
		int[][] a = { {1,2,3}, {4,5,6,9},{7} };
		System.out.println(a.length); // IMPRIMERO EL NUMEROD FILAS = ·
		System.out.println(a[0].length); // IMPRIME LONGITUD COLUMNAS = 3
		System.out.println(a[1].length); // IMPRIME LONGITUD COLUMNAS = 4
		System.out.println(a[2].length); // IMPRIME LONGITUD COLUMNAS = 1
		
		for ( int i = 0; i<a.length; i++) { //LONGITUD DE LAS FILAS
			for(int j=0; j<a[i].length; j++) { //LONGITUD DE LAS COLUMNAS DENTRO DE LAS FILAS i
				System.out.println(a[i][j] + " ");	
			}
			System.out.println();
		}
	}

}
