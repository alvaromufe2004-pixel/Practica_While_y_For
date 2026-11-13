package While;

import java.util.Random;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Introduzca el tamaño del array");
        int tam = kb.nextInt();
        int[] array = new int[tam];
        // 1º bucle: rellenar e imprimir
        for (int k = 0; k < array.length; k++) {
            array[k] = random.nextInt(0, 31);   // de 0 a 30 (Java 17+)
            System.out.println(array[k]);
        }
        // 2º bucle: buscar el mayor
        int mayor = array[0];                   // el primero es el campeón provisional
        for (int k = 1; k < array.length; k++) {
            if (array[k] > mayor) {
                mayor = array[k];               // nuevo campeón
            }
        }
        System.out.println("El mayor es: " + mayor);
    }
}
