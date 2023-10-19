//EJERCICIO REALIZADO INDIVIDUALMENTE

package org.generation.codigoOtros;
import java.util.Scanner;

public class CodigoOtros4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String jugador1 = scanner.nextLine();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String jugador2 = scanner.nextLine();

        int resultado = determinarResultado(jugador1, jugador2);

        if (resultado == 0) {
            System.out.println("Empate");
        } else if (resultado == 1) {
            System.out.println("Gana jugador 1");
        } else {
            System.out.println("Gana jugador 2");
        }
    }

    public static int determinarResultado(String jugador1, String jugador2) {
        if (jugador1.equals(jugador2)) {
            return 0; // Empate
        } else {
            if ((jugador1.equals("piedra") && jugador2.equals("tijeras")) ||
                (jugador1.equals("papel") && jugador2.equals("piedra")) ||
                (jugador1.equals("tijeras") && jugador2.equals("papel"))) {
                return 1; // Gana jugador 1
            } else {
                return -1; // Gana jugador 2
            }
        }
    }
}
