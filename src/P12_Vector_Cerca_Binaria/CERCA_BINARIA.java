package P12_Vector_Cerca_Binaria;

public class CERCA_BINARIA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Array =  {10, 25, 31, 46, 52, 63, 71, 84, 91, 92};
		int inf = 0, sup=Array.length-1, med, valor=84;
		boolean trobat = false;
			 
			 med = (sup + inf)/2;
			 if (Array[med] == valor) {
			 trobat = true;
			 }
			 if (valor < Array[med]) {
			 sup = med - 1;
			 }
			 else {
			 inf = med + 1;
			 }
			 med = (sup + inf)/2;
			 if (Array[med] == valor) {
			 trobat = true;
			 }
			 if (valor < Array[med]) {
			 sup = med - 1;
			 }
			 else {
			 inf = med + 1;
			 }
			 
			 if (trobat)
			 System.out.println("S'ha trobat");
			 else
			 System.out.println("No s'ha trobat");
	}

}
