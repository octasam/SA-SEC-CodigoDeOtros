package org.generation.codigoOtros;

import java.util.Scanner;

//Se crea la clase MainMN para crar un objeto de dicha clase e imprimir el resultado
public class MainMN {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        	//Se obtiene el numero de frutas correspondientes
            int mangos = obtenerNumeroFrutas(scanner, "mangos");
            int naranjas = obtenerNumeroFrutas(scanner, "naranjas");

            MangosNaranjas cajas = new MangosNaranjas(mangos, naranjas);
            cajas.imprimir();
        } catch (Exception e) {
            //Excepcion en caso de que haya error y muestra mensaje
        	System.out.println("Error al leer la entrada del usuario: " + e.getMessage());
        }
    }
    //Solicita el numero de frutas y valida las entradas sean numero valido
    private static int obtenerNumeroFrutas(Scanner scanner, String tipo) {
        int numero = 0;
        boolean entradaValida = false;
        //Se ejecuta el ciclo while mientras la entrada sea valida
        while (!entradaValida) {
        	//Introduce el numero 
            System.out.print("Introduce el número de " + tipo + ": ");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                entradaValida = true;
            } else {
            	//Valida que la entrada sea un numero valido
                System.out.println("Entrada no válida. Por favor, ingrese un número válido.");
                // Limpiar la entrada incorrecta
                scanner.next();
            }
        }
        return numero;
    }
}