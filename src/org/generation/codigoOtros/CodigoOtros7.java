//Nombre: Octavio Samuel Esteves Fragoso
//Revisado por: Los mictlanes
//Cal: 5
package org.generation.codigoOtros;
//Se importa Scanner y HashMap
import java.util.Scanner;
import java.util.HashMap;

public class CodigoOtros7 {

    public static void main(String[] args) {
    	//Se agrega System.in
        Scanner s = new Scanner(System.in);
        
        //Variable que relaciona paises con sus capitales, pro eso se cambia a String
        //y crea un objeto vacio
        HashMap<String, String> ca = new HashMap<>();

        // Se inicia el mapa de capitales
        inicializarCapitales(ca);
        String pais;
        //Muestra el mensaje para que el usuario escriba el nombre de un pais
        do {
            System.out.print("Escribe el nombre de un país y te diré su capital (o escribe 'salir' para salir): ");
            pais = s.nextLine();
            //En caso de que desee salir, entonces escribe 'salir' y sale del programa
            if (!pais.equals("salir")) {
                procesarPais(pais, ca, s);
            }
        } while (!pais.equals("salir"));
    }

    // Se inicializa el mapa de capitales con valores ya de algunos paises
    private static void inicializarCapitales(HashMap<String, String> capitales) {
        capitales.put("Canadá", "Ottawa");
        capitales.put("Estados Unidos", "Washington DC");
        capitales.put("México", "México DF");
        capitales.put("Belice", "Belmopán");
        capitales.put("Costa Rica", "San José");
        capitales.put("El Salvador", "San Salvador");
        capitales.put("Guatemala", "Ciudad de Guatemala");
        capitales.put("Honduras", "Tegucigalpa");
        capitales.put("Nicaragua", "Managua");
        capitales.put("Panamá", "Panamá");
    }

    // Procesa la entrada del usuario para un país dado
    private static void procesarPais(String pais, HashMap<String, String> capitales, Scanner scanner) {
        //Verifica si el pais ingresado por el usuario existe
    	//Si existe, muestra la capital correspondiente
    	//No existe, no se ejecutará nada en este bloque
    	if (capitales.containsKey(pais)) {
            System.out.println("La capital de " + pais + " es " + capitales.get(pais));
        } else {
        	//Aqui se maneja el caso en el que el pais ingresado no se encuentre en el HashMap
        	//y le permite al usuario ingresar una neuva entrada al HashMap
            System.out.print("No conozco la respuesta. ¿Cuál es la capital de " + pais + "?: ");
            String capital = scanner.nextLine();
            capitales.put(pais, capital);
            //Finalmente agradece al usuario.
            System.out.println("Gracias por enseñarme nuevas capitales.");
        }
    }
}
