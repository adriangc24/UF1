package EXPLICACIONES_CLASE;

import java.util.Arrays;
import java.util.Scanner;

public class USOS_DEL_STRING {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String a = "Esto es mi primer String sdndf dfdnfn";
		String cadena = "Esto es un String";
		String CadenaVacia = "";
		String cadena2 = "Esto es un String";
		System.out.println(a);
		System.out.println(cadena);
		System.out.println(CadenaVacia);
		String[] arrayStrings = {"String 1", "String 2", "String 3"};
		
		System.out.println(arrayStrings[2]);// IMPRIMERA LA POSICION 2 DEL ARRAY
		
		for(int i=0; i<arrayStrings.length; i++) {
			for(int j=0; j<arrayStrings[i].length(); j++) {
				System.out.print(arrayStrings[i].charAt(j)+"--"); // IMPRIME LA ARRAY ENTRE GUIONES
			}
		}
		System.out.println();
		String[] arrayStringVacio = new String[10];
		System.out.println(arrayStringVacio[1]); // IMPRIME LA POSICION NULL PORQUE LA CADENA NO CONTIENE NADA
		
		
		// TODOS ESTOS OPERADORES CON CADENAS NO FUNCIONAN
		/*!cadena1;
		cadena1 / cadena2;
		cadena1 * cadena2;
		cadena1 && cadena2;
		cadena1 < cadena2;
		cadena1 == cadena2;*/
		
		int dobleMidaMenysUn = 2 * cadena.length() - 1;
		System.out.println(dobleMidaMenysUn);
		
		System.out.println(cadena.charAt(5)); // MUESTRA LA E
		System.out.println(cadena.length()); // MUESTRA EL NUMERO DE CARACTERES
		for (int i=0; i<cadena.length(); i++) {
			System.out.println(cadena.charAt(i));// MUESTRA TODOS LOS CARACTERES DELA CADENA
		}
		String resultado = cadena+a;// TE JUNTA LAS DOS CADENAS
		System.out.println(resultado);
		String cad1="Hola";
		String cad2="Mon";
		cad1.concat(cad2);
		System.out.println(cad1.concat(cad2)); // TE IMPRIME LA CONCATENACION COMO un + PERO NO TE GUARDA EL RESULTADO
		System.out.println("Observacio: " + cad1);
		
		String[][] aaa = { {"string1"}, {"string2", "string3", "string4"} };
		
		System.out.println(aaa[0][0].length()); // ESTO MOSTRARA EL CONTEINDO DE LA CADENA 0 0
		System.out.println(aaa[1].length); // ESTO MOSTRARA EL NUMERO COLuMNAS QUE HAY EN LA FILA 1
		
		String entradaDades;
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce una cadena de texto: ");
		entradaDades = lector.nextLine(); // CON EL NEXT LINE TE LO COGE TODO y el next hasta que acaba la palabra
		aaa[0][0] = entradaDades;
		System.out.println(aaa[0][0].length()); // TE IMPRIMIERA EL ELEMENTO CAMBIADO
		
		while(lector.hasNext()) { // NUNCA SALES DEL WHILE HASTA QUE NO PONGA UN BREAK
			entradaDades = lector.next();
			System.out.println(entradaDades); // IMPRIME TODO LO QUE ESCRIBAS POR SEPARADO CUANDO LLEGA AL ESPACIO, TU PUEDES ESCRIBIR TODO SEGUIDO PERO DONDE HAYA UN ESPACIO SALTARA
		break;
		}
		System.out.println(entradaDades); // SOLO IMPRIMIRIA LA PRIMERA PALABRAYA QUE ROMPES EL WHILE YA QUE EL NEXT SALTA
		
		String entrada;
		char opcion;
		System.out.println("CAJERO BANCAMAR/n" + "Retirar Efectivo/n" + "Ingresar/n" + "Conultar el Saldo/n" + "Salir/n");
		
		entrada = lector.next();
		opcion = entrada.charAt(0);
		System.out.println("Opcion = " + opcion); // PUEDES ELEGIR LA OPCION SOLO INGRESANDO LA PIMERA LETRA
		
		
		System.out.println(cadena.indexOf("un")); // IMPRIMERA LAPRIMERA POsICION DONDE ENCUENTRA EL UN SI NO Lo ENCUENTRA ES -1
		System.out.println(cadena2.lastIndexOf("un")); // TE IMPRIME LA ULTIMA VEZ QUE ENCONTRO EL UN
		System.out.println(cadena.equals("Esto Es Un String")); // TE DARA FALSE PORQUE NO ES LO MISMO POR LAS MAYUSCULAS
		System.out.println(cadena.equalsIgnoreCase("Esto Es Un String")); // TE DICE TRUE PORQUE  IGNORA SI HAY MAYUSCULAS O MINUSCULAS
		System.out.println(cadena.compareTo("pepe")); // COMPARACION ENTRE CARACTERES ALFABETICAMENTE CARACTER A CARACTER
		System.out.println(cadena.compareToIgnoreCase("Esto Es Un String")); // LO MISMO PERO TE LAS TRANSFORMA EN MINUSCULAS
		
		//cadena.regionMatches(toffset, other, ooffset, len) // HACER MANUAL
		
		String subcadena = cadena.substring(2, 8);
		System.out.println(subcadena); // TE IMPRIME  LOS CARACTERES CONTENIDOS ENTRE LAS POSICIONES 2 i 8 EL PRIMERO SIN CONTENIDO PERO EL ULTIMO NO
		
		String[] cadenatoString = cadena.split(" "); // TE CORTA POR ESPACIOS, PERO SI PONES LA LETRA HE TE CORTA LA LETRA E QUE CONTENGA
		System.out.println(Arrays.toString(cadenatoString)); // TE TRANSFORMA LA CADENA EN un ARRAY RESULTADO = [Esto, es, un, String]
		
		int v=5;
		String aaab = "Esto-es-una-cadena-de-texto";
		String[] palabras = aaab.split("-"); // TRANSFORMA EL STRING DE ARRIBA EN UNA ARRAY SEPARADA POR LOS GUIONES
		System.out.println(Arrays.toString(palabras));// IMPRIME LA ARRAY COMO CADENA DE TEXTO SEPARADA POR COMAS
		String va = String.valueOf(v);// TRANSFORMA EL NUMERO ENTERO EN UNA CADENA DE TEXTO
		System.out.println(va.length()); // TE IMPRIME LA LONGITUD, SI FUERA UN NUMERO ENTERO NO TE LA IMPRIMIRIA PORQUE LOS ENTEROS SON PRIMITIMOS
		System.out.println(va); // TE IMPRIME LA V
		
		
		String aaac = "Esto es un String";
		System.out.println(aaac); // IMPRIMIRA EL STRING
		String[] bbb = {"aaaa aaaa" , "acsdcvs"}; // ARRAY DE STRING
		String ccc = new String(); // ESTO ES UN STRING VACIO ( DEFINIDO)
		System.out.println(ccc);
		String ddd = new String("HOLA"); // ESTO ES UN STRING 
		System.out.println(ddd);
		String eee = new String("HOLA");
		
		if(ddd == eee) { // NO IMPRIME PORQUE EL == FUNCIONA DE FORMA OCASIONAL CON LOS STRING
			System.out.println("Son Iguales");
		}else if(ddd.equals(eee)) { // ESTE SI QUE FUNCIONA PARA SABER SI SON IGUALES
			System.out.println("ESTO SI QUE COMPARA");
		}
		System.out.println(aaa.equals(ddd)); // FALSE
		System.out.println(eee.equalsIgnoreCase(ddd)); // TRUE
		System.out.println(aaac.compareTo(ddd)); // COMPARA LOS CARACTERES UNICOIDE
		
		
		
		
		Byte.parseByte(a); //BYTE
		Integer.parseInt(a); // INT
		Double.parseDouble(a); // DOUBLE
		Float.parseFloat(a); // FLOAT
		Long.parseLong(a); // LONG
		Short.parseShort(a); //SHORT
		
		String numero = "25";
		int numero1 = Integer.parseInt(numero); // DECLARANDO UN NUEVO NUMERO ENTERO PODEMOS PASAREL 25 A UN INT
		System.out.println(v*numero1);
	}

}
