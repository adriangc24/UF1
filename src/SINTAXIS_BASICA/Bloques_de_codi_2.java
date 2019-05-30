package SINTAXIS_BASICA;

public class Bloques_de_codi_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int x=5;
			System.out.println("Variable x bloc 1 " + x); // LA X = 5 SOLO DENTRO DE LOS CORCHETES
		}
		{
			int x=10;
			int y=3;
			System.out.println("Variable x bloc 2 " + x); // LA X = A 10 SOLO DENTRO DE LOS CORCHETES, LA Y = 3 SOLO DENTRO DE LOS CORCHETES
		}
		{
			int x=20;
			System.out.println("Variable x bloc main " + x); // LA X = 20 SOLO DENTRO DE LOS CORCHETES
			System.out.println("Variable x bloc main " + y); // LA Y NO ES DECLARADA A SI QUE DARIA ERROR
		}
	}

}
