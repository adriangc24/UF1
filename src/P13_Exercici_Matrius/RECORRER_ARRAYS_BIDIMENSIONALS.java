package P13_Exercici_Matrius;

public class RECORRER_ARRAYS_BIDIMENSIONALS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] ArrayMatriu = { {3,4,5}, {6,7,8},{9,10,11} };
		
		for(int i=0; i<ArrayMatriu.length; i++) {
			System.out.println();
			for (int j=0; j<ArrayMatriu[i].length; j++) {
				System.out.print(" " + ArrayMatriu[i][j]);
			}
		}
		// A
		System.out.println();
		System.out.println("--A--");
		System.out.println(ArrayMatriu[0][2] + " " + ArrayMatriu[1][1] + " " + ArrayMatriu[2][0]);
		System.out.println();
		for(int i=0; i<ArrayMatriu.length; i++) {
			for(int j=0; j<ArrayMatriu[i].length; j++) {
				if(i == 0) {
					j = j+2;
					System.out.print(ArrayMatriu[i][j]);
				}else if(i == j) {
					System.out.print(" " + ArrayMatriu[i][j]);
				}else if(i == 2) {
					j=j+2;
					System.out.print(" " + ArrayMatriu[i][j-2]);
				}
			}
		}
		System.out.println();
		// B
		System.out.print("--B--");
		for(int i=0; i<ArrayMatriu.length; i++) {
			System.out.println();
			for (int j=0; j<ArrayMatriu[i].length; j++) {
				System.out.print(" " + ArrayMatriu[i][j]);
			}
		}
		System.out.println();
		// C
		System.out.println("--C--");
		for(int i=0; i<ArrayMatriu.length; i++) {
			System.out.println();
			for(int j=0; j<ArrayMatriu[i].length; j++) {
				System.out.print(" " + ArrayMatriu[j][i]);
			}
		}
		System.out.println();
		System.out.println("--D--");
		for(int i=0; i<ArrayMatriu.length; i++) {
			for(int j=0; j<ArrayMatriu[i].length; j++) {
				if(i == j) {
					System.out.print(" " + ArrayMatriu[i][j]);
				}
			}
		}
	}

}
