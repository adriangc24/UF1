package Algorisme_Bombolla_String;

public class Algorisme_Bombolla_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] aaa = {"aaa", "ccc", "bbb"};
		String aux;
		System.out.println("Array aaa desordenada: ");
		for(int i=0; i<aaa.length; i++) {
			  System.out.print(" " + aaa[i]);
		  }
		  for(int i=1; i<=aaa.length; i++) {  
	            for(int j=0; j<aaa.length-i; j++) { 
	                if( aaa[j].compareTo( aaa[j+1] ) > 0 ) { 
	                    aux   = aaa[j]; 
	                    aaa[j]  = aaa[j+1]; 
	                    aaa[j+1]= aux; 
	                }    
	            } 
	        }
		  System.out.println();
		  System.out.println("Array Ordenada de aaa");
		  for(int i=0; i<aaa.length; i++) {
			  System.out.print(" " + aaa[i]);
		  }
	}

}
