package Ajedrez;

import java.util.Arrays;

public class AJEDREZ_OKEY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] ajedrez = new char[16][16];
		int pos = 0;
		boolean pintar = true;
		for (int i = 0; i < ajedrez.length; i++) {
			for (int j = 0; j < ajedrez.length; j++) {
				if (pintar == true) {
					ajedrez[i][j] = '#';
					if (pos % 2 != 0) {
						pintar = false;
					}
				} else {
					ajedrez[i][j] = ' ';
					if (pos % 2 != 0) {
						pintar = true;
					}
				}
				pos++;
			}
			if (i % 2 != 0) {
				if (pintar == true) {
					pintar = false;
				} else {
					pintar = true;
				}
			}
		}
		for (int i = 0; i < ajedrez.length; i++) {
			for (int j = 0; j < ajedrez[i].length; j++) {
				
			}
			System.out.print(Arrays.toString(ajedrez[i]) + " ");
			System.out.println();
		}
	}

}
