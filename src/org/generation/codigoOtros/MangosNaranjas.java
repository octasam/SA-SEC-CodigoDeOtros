//Nombre: Octavio Samuel Esteves Fragoso
//Revisado por: Los Mictlanes
//Retroalimentacion: Me tarde mas tiempo del establecido y revise documentacion para el funcionamiento optimo.

package org.generation.codigoOtros;

public class MangosNaranjas {
    //Se definen las variables
	private int mangos;
    private int naranjas;
    
    //Constructor para crear el objeto de la clase MangosNaranjas
    public MangosNaranjas(int mangos, int naranjas) {
        this.mangos = mangos;
        this.naranjas = naranjas;
    }
    //se tienen las variables cajas, que calcula las cajas y mangos por caja asi como naranjas por caja
    //Imprime el mensaje de cuantas cajas son, y cuantos mangos y naranjas por caja
    public void imprimir() {
        int cajas = calcularCajas();
        int mangosPorCaja = mangos / cajas;
        int naranjasPorCaja = naranjas / cajas;

        System.out.println("El número de cajas es: " + cajas);
        System.out.println("El número de mangos en una caja es: " + mangosPorCaja);
        System.out.println("El número de naranjas en una caja es: " + naranjasPorCaja);
    }
    //Este metodo nos sirve para determinar el numero de cajas de manera que haya la misma cantidad en cada caja
    private int calcularCajas() {
    	//Calculando el minimo de mangos y naranjas
    	int minFrutas = Math.min(mangos, naranjas);
    	//cajas=1 porque se asume que todo se empaquetara en 1 sola caja de inicio
        int cajas = 1;
        //el cliclo empieza en 2 porque siempre habra al menos 1 caja
        for (int i = 2; i <= minFrutas; i++) {
        	// Verifica si son divisibles por 'i'
        	// Se va actualizando la cantidad de cajas
            if (mangos % i == 0 && naranjas % i == 0) {
                cajas = i;
            }
        }
        return cajas;
    }
}
