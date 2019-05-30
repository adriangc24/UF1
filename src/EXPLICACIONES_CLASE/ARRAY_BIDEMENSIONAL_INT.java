package EXPLICACIONES_CLASE;

public class ARRAY_BIDEMENSIONAL_INT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//puede ser declarado de las dos maneras
		int[][] /* [] son coordenadas */a = {{1,2,3},{4,5,6},{7}};
		int[][] b = {{1,2,3}, 
					{4,5,6},
					{7}};
		// manera de imprimir una posicion de un array bidemensional
		System.out.println(a[1][2]); // = 5 El 1 es grupo array 1 i 2 del grupo la posicion 2
		System.out.println(a[2][1]); // = 7 Error te sales de los limites del array
		
	}

}
