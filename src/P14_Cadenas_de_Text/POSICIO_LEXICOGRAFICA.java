package P14_Cadenas_de_Text;

import java.util.Scanner;

public class POSICIO_LEXICOGRAFICA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		 
		System.out.println("Escriu paraules");
		System.out.println("Per acabar, escriu la paraula fi");
		String darreraParaula = "";
		boolean fi = false;
		do {
		String paraula = lector.next();
		if (paraula.equals("fi")) {
		fi = true;
		} else {
		if (paraula.compareTo(darreraParaula) > 0) {
		darreraParaula = paraula;
		}
		}
		} while (!fi);
		System.out.println("La darrera parala �s \"" + darreraParaula + "\".");
	}

}
