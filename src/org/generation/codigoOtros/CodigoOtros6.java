//Nombre: Octavio Samuel Esteves Fragoso
//Revisado por: Los mictlanes
//Cal: 5
package org.generation.codigoOtros;
//Se importa para utilziar el scanner
import java.util.Scanner;

public class CodigoOtros6 {
	//Agregamos public static void main
	  public static void main(String[] args) {
		  //Se agrega new
		  int[] n = new int[20];
		  //Se declara la variable s para el scanner
		  Scanner s = new Scanner(System.in);
		  
		  //Ciclo for para generar 20 numeros random
		  for (int i = 0; i < 20; i++) {
			  n[i] = (int)(Math.random() * 381) + 20;
			  //Se corrige in por out
			  System.out.print(n[i] + " ");
		  }
		  //Muestra2 opciones para los numeros que se quieren resaltar
		  System.out.println("\n¿Qué números quiere resaltar? ");
		  System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
		  //Se lee la opcion
		  int opcion = s.nextInt();
		  //Se arregla el operador ternario
		  int multiplo = (opcion == 1) ? 5 : 7;
		  //Se cambia ciclo foreach por ciclo for y la variable char por int
		  for (int e : n) {
			  if (e % multiplo == 0) {
				  System.out.print("[" + e + "] ");
			  }else {
				  		//Se corrige in por out
					  System.out.print(e + " ");
				  }
			  }
		  //Se cierra el scanner
		  s.close();
		  }
}