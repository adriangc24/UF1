package BOMBOLLA_RUBEN;

import java.util.Arrays;

public class BOMBOLLA_RUBEN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] table = { 7, 26, 9, 4, 25, 1 }; //
		int x;
		int i=0;
		int j=0;
		
		for ( j = 0; j < table.length ; j++) {
		for ( i = 0; i < table.length-j-1 ; i++) {
			if (table[i] > table[i + 1]) {
				x = table[i];
				table[i] = table[i + 1];
				table[i+1] = x;
				System.out.println(Arrays.toString(table));	//ponemos un chivato, para ver como funciona. Va subiendo al num mas alto que se encuentra.
			}
		}}

		System.out.println(Arrays.toString(table));
	}

}
