package P12_Vector_Ordenacio;

public class VECTORS2_1VECTOR_ORDENAT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Vector1 = {3, 12, 34, 4, 67, 17, 24, 11, 95, 2};
		int[] Vector2 = {76, 1, 16, 21, 32, 85, 37, 6, 18, 41};
		int[] Vector3 = new int[20];
		int aux;
		System.out.println("Vector1 almacenat en les primeres 10 posicions de Vector3: ");
		for(int i=0; i<Vector3.length/2; i++) {
			Vector3[i] = Vector1[i];
			System.out.print(" " + Vector3[i]);
		}
		System.out.println();
		System.out.println("Vector2 almacenat en la seguens 10 posicions de Vector3:");
		for (int i=10; i<Vector3.length; i++) {
			Vector3[i] = Vector2[i-10];
			System.out.print(" " + Vector3[i]);
		}
		System.out.println();
		for(int i=0; i<Vector3.length; i++) {
			for(int j=i+1; j<Vector3.length; j++) {
				if(Vector3[i] > Vector3[j]) {
					aux = Vector3[i];
					Vector3[i]=Vector3[j];
					Vector3[j]= aux;
				}
			}
		}
		System.out.println("Vector3 ordenat");
		for(int i=0; i<Vector3.length; i++) {
			System.out.print(" " + Vector3[i]);
		}
	}

}
