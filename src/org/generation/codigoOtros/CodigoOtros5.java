//Nombre: Octavio Samuel Esteves Fragoso
//Revisado por: Los mictlanes
//Cal: 
package org.generation.codigoOtros;

// Se importa la sig clase para emplearla en el codigo
import java.util.Scanner;

public class CodigoOtros5 {
	//Se agrega el metodo main
	public static void main(String[] args) {
		//Se utiliza el argumento System.in para leer una entrada desde el tecldo
		Scanner s = new Scanner(System.in);
		//Se modificaron las comillas
    	System.out.print("Introduzca un número: ");
    	//Se cambio la variable por un input
    	String input = s.nextLine();
    	//Se agrega try-catch para la conversion de la entrada de texto a numero entero
    	//y si no es numero entero se muestra un mensaje de error
    	try {
    		int ni = Integer.parseInt(input);
    		int afo = 0;
    		int noAfo = 0;
    		//Bucle while mientras el valor de ni>0
    		while (ni > 0) {
    			int digito = ni % 10;
    			//3,7,8,9 son los numeros afortunados
    		if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
    			afo++;
    		} else {
    			noAfo++;  
    		}
    		ni /= 10;
    		}
    		//muestra mensaje si el numero es o no afortunado
    		if (afo > noAfo) {
    			System.out.println("El " + input + " es un número afortunado.");
    		} else {
    			System.out.println("El " + input + " no es un número afortunado.");
    		}
    		//Se agrega una excepcion para manejar las enradas incorrectas
    	} catch (NumberFormatException e) {
    		System.out.println("Input invalido. Introduce un numero entero");
    	}
    	//se cierra el scanner
    	s.close();
	}
}
