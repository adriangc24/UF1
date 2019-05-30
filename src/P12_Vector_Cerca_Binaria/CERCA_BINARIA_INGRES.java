package P12_Vector_Cerca_Binaria;

import java.util.Scanner;

public class CERCA_BINARIA_INGRES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		String[] Mesos = {"Gener", "Febrer", "Mar�", "Abril", "Maig", "Juny", "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Desembre"};
		int[] Sou = new int[12];
		int[] SouCopi = new int[12];
		int contador = 0;
		int x=0;
		while (contador < 12) {
			System.out.println("Intrudeix el sou que has cobrat cada mes de l'any " + Mesos[x] + " :");
			if(lector.hasNextInt()) {
				Sou[contador] = lector.nextInt();
				contador++;
				x++;
			}
			lector.nextLine();
		}
		for(int i=0; i<SouCopi.length; i++) {
			SouCopi[i] = Sou[i];
		}
		for(int i=0; i<SouCopi.length; i++) {
			for(int j=i+1; j<SouCopi.length; j++) {
				if(SouCopi[i]>SouCopi[j]) {
					int aux = SouCopi[i];
					SouCopi[i] = SouCopi[j];
					SouCopi[j] = aux;
				}
			}
		}
		for(int i=0; i<Sou.length; i++) {
			System.out.print(" " + SouCopi[i]);
		}
		System.out.println();
		System.out.println("Intrudeix el Sou a trobar: ");
		int inf = 0, sup = SouCopi.length - 1, med, valor = lector.nextInt();
		 boolean trobat = false;
		 while ((inf <= sup) && !trobat) {
		 med = (sup + inf) / 2;
		 if (SouCopi[med] == valor)
		 trobat = true;
		 if (valor < SouCopi[med])
		 sup = med - 1;
		 else
		 inf = med + 1;
		 }
		 if (trobat) {
		 System.out.println("S'ha trobat");
		 }
		 else {
		 System.out.println("No s'ha trobat aquest sou en cap mes"); 
		 }
		 if (trobat == true) {
			 for(int i=0; i<Sou.length; i++) {
				 if(Sou[i] == valor) {
					 System.out.println("Aquest sou l'has cobrat el mes de: " + Mesos[i]);
				 }
			 }
		 }
	}

}
