package SINTAXIS_BASICA;

public class CAMBIO_DE_VALORES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numA = 2;
		int numB = 5;
		int numC;
		
		numC = numA;
		numA = numB;
		numB = numC;
		System.out.println(numA);
		System.out.println(numB);
	}

}
