package P13_Exercici_Matrius;

public class CAMBIAR_FILAS_PER_COLUMNAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ArrayMatriu = { {7,2,8}, {6,1,3}, {12,6,31} };
		for(int i=0; i<ArrayMatriu.length; i++) {
			System.out.println();
			for(int j=0; j<ArrayMatriu[i].length; j++) {
				System.out.print(" " + ArrayMatriu[i][j]);
			}
		}
		System.out.println();
		System.out.println("COLUMNAS Y FILAS");
		for(int i=0; i<ArrayMatriu.length; i++) {
			System.out.println();
			for(int j=0; j<ArrayMatriu[i].length; j++) {
				System.out.print(" " + ArrayMatriu[j][i]);
			}
		}
	}

}
