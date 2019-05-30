package P12_Vector_Ordenacio;

public class VECTOR1_VECTORS2_ORDENATS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Vector1 = {1, 23, 45, 15, 2, 54, 4, 67, 3, 9, 21, 42, 28, 31, 39, 62, 71, 26, 17, 11};
		int[] Vector2 = new int[10];
		int[] Vector3 = new int[10];
		
		for (int i = 0; i < Vector1.length; i++) {
			for (int j = i + 1; j < Vector1.length; j++) {
			if (Vector1[i] > Vector1[j]) {
			int aux = Vector1[i];
			Vector1[i] = Vector1[j];
			Vector1[j] = aux;
			}

			}
		}
		System.out.println("Vector Ordenado");
		for(int i=0; i<Vector1.length; i++) {
			System.out.print(" " + Vector1[i]);
		}
		System.out.println();
		System.out.println("Vector 1 Ordenado");
		for(int i=0; i<Vector1.length/2; i++) {
			Vector2[i] = Vector1[i];
			System.out.print(" " + Vector2[i]);
		}
		System.out.println();
		System.out.println("Vector 2 Ordenado");
		for(int i=0; i<Vector3.length; i++) {
			Vector3[i] = Vector1[i+10];
			System.out.print(" " + Vector3[i]);
		}
	}

}
