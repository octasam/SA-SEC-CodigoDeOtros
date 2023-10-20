//Nombre: Octavio Samuel Esteves Fragoso
//Revisado por: Los Mictlanes
//Califiacion: 4
//Retroalimentacion: El programa funciono adecuadamente pero fue mas tiempo del esperado 
package org.generation.codigoOtros;

public class LiveCoding4 {
	public void imprimir() {
		//Ciclo para contar numero de 1 al 100
        for (int i = 1; i <= 100; i++) {
        	//Valida si el numero es divisible entre 3 y 5
            if (i % 3 == 0 && i % 5 == 0) {
            	//Muetsra mensaje de FizzBuzz
                System.out.println("FizzBuzz");
                //Valida si es divisible entre 3
            } else if (i % 3 == 0) {
            	//Muestra mensaje de Fizz
                System.out.println("Fizz");
                //Valida si es divisible entre 5
            } else if (i % 5 == 0) {
            	//Muestra mensaje de Buzz
                System.out.println("Buzz");
            } else {
            	//En caso de que no sea divisible entre 3,5 muestra los numeros
                System.out.println(i);
            }
        }
    }
}