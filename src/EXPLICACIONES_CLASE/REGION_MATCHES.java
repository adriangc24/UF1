package EXPLICACIONES_CLASE;

public class REGION_MATCHES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// AQUI APRENDEREMOS A USAR EL METODO REGIONMATCHES, PARA ELLA LO HAREMOS CON UNA EXPLICACION PREVIA Y UNOS EJEMPLOS
		// REGION MATCHES LO QUE HACES ES COMPARARTE UNA REGION DE UNA FRASE CON OTRA, ES DECIR, UN TROZO DE UNA FRASE CON OTRA. O UNA FRASE ENTERA CON UN TROZO DE UNA FRASE MAS EXTENSA
		// EL METODO REGION MATCHES ES UN METODO BOOLEANO ES DECIR QUE TE DEVOLVERA UN TRUE O UN FALSE
		// EL METODO ESTA COMPUESTO POR DISTINTAS PARTES A RELLENAR DENTRO DE SU PARENTESIS: TOFFSET, OTHER, OFFSEET, LEN
		// TOFFSET AQUI SE PONDRA EL PUNTO DE LA PRIMERA CADENA DE TEXT DONDE QUIERES QUE EMPIECE A COMPARAR
		// EL OTHER PONDRAS LA CADENA QUE SE COMPARA CON LA OTRA CADENA DE TEXTO
		// OFFSET PONDRAS EL INICIO DEL TROZO DE LA CADENA QUE SE COMPARARA CON LA PRIMERA
		// LEN PONDRAS EL FINAL DEL TROZO DONDE QUIERES QUE SE ACABE LA COMPARACION
		// ES DECIR LO QUE HARAS SERA DE UNA CADENA DE TEXTO EMPEZANDO DESDE UN PUNTO EN CONCRETO DE ELLA (TOOFSET), QUEREMOS COMPARARLA CON OTRA CADENA (OTHER), DESDE EL PUNTO (OFFSET) HASTA EL PUNTO (LEN)
		
		//EJEMPLO
		//DECLARAMOS TRES VARIABLES STRING
		String Str1 = new String("Welcome to Tutorialspoint.com");
		String Str2 = new String("Tutorials");
		String Str3 = new String("TUTORIALS");
		
		// UNA VEZ DECLARADAS USAREMOS EL METODO REGIONMATCHES PARA COMPARAR PARTES EN CONCRETO DE LA FRASE
		System.out.println("RETORNO DE VALOR");
		System.out.println(Str1.regionMatches(11, Str2, 0, 9)); // DEVUELVE VALOR TRUE
		//System.out.println(TABLA A COMPARAR.METODO(POSICION TABLA DONDE EMPEZA A COMPARAR,TABLA CON LA QUE LA COMPARAMOS,INICIO DONDE EMPEZARA A COMPARAR,FINAL DONDE ACABA EL TROZO A COMPARAR)); 
		//System.out.println("Tutoriales");
		//System.out.println("0123456789"); POSICIONES DE TUTORIALES 0 AL 9
		System.out.println("RETORNO DE VALOR");
		System.out.println(Str1.regionMatches(11, Str3, 0, 9)); // DEVUELVE FALSE
		// PORQUE EN EL SEGUNDA PRINT DEVUELVE UN FALSE? PORQUE EL METODO DETECTA LAS MAYUSCULAS Y LAS TIENE EN CUENTA POR ESO PARA EL, LAS FRASES NO SON IGUALES
	}

}
