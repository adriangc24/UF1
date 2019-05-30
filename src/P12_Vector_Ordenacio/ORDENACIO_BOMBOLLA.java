package P12_Vector_Ordenacio;

public class ORDENACIO_BOMBOLLA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Vector = {89, 4, 73, 100, 49, 25, 1, 87, 12};
		int i;
		int j;
		int aux;
		while(Vector[8] != 100 || Vector[0] != 1) {
			i=0; j=i+1;
			if(Vector[i] > Vector[j]) {
				aux = Vector[i];
				Vector[i] = Vector[j];
				Vector[j] = aux;
			}
			i=1; j=i+1;
			if(Vector[i] > Vector[j]) {
				aux = Vector[i];
				Vector[i] = Vector[j];
				Vector[j] = aux;
			}
			i=2; j=i+1;
			if(Vector[i] > Vector[j]) {
				aux = Vector[i];
				Vector[i] = Vector[j];
				Vector[j] = aux;
			}
			i=3; j=i+1;
			if(Vector[i] > Vector[j]) {
				aux = Vector[i];
				Vector[i] = Vector[j];
				Vector[j] = aux;
			}
			i=4; j=i+1;
			if(Vector[i] > Vector[j]) {
				aux = Vector[i];
				Vector[i] = Vector[j];
				Vector[j] = aux;
			}
			i=5; j=i+1;
			if(Vector[i] > Vector[j]) {
				aux = Vector[i];
				Vector[i] = Vector[j];
				Vector[j] = aux;
			}
			i=6; j=i+1;
			if(Vector[i] > Vector[j]) {
				aux = Vector[i];
				Vector[i] = Vector[j];
				Vector[j] = aux;
			}
			i=7; j=i+1;
			if(Vector[i] > Vector[j]) {
				aux = Vector[i];
				Vector[i] = Vector[j];
				Vector[j] = aux;
			}

		}
		for(int h=0; h<Vector.length; h++) {
			System.out.print(" " + Vector[h]);
		}
	}

}
