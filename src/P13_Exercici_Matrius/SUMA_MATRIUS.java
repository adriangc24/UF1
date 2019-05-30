package P13_Exercici_Matrius;

public class SUMA_MATRIUS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ArrayMatriu = { {3,6,4}, {8,3,6}, {2,9,12}, {32,12,6} };
		int[][] ArrayMatriu2 = { {2, -1}, {3,4}, {0,1}, {18,2} };
		int[][] ArrayMatriu3 = { {1,3}, {5,7}, {-12,12}, {2,128} };
		int [][] suma = new int[4][2];
		for(int i=0; i<ArrayMatriu.length; i++) {
			for(int j=0; j<ArrayMatriu[i].length; j++) {
				System.out.print(" " + ArrayMatriu[i][j] * 5);
			}
		}
		for(int i=0; i<ArrayMatriu2.length; i++) {
			for(int j=0; j<ArrayMatriu2[i].length; j++) {
				suma[i][j] = ArrayMatriu2[i][j] + ArrayMatriu3[i][j];
			}
		}
		System.out.println();
		for(int i=0; i<ArrayMatriu2.length; i++) {
			for(int j=0; j<ArrayMatriu2[i].length; j++) {
				System.out.print(" " + suma[i][j]);
			}
		}
	}

}
