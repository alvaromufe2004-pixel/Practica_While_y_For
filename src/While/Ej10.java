package While;

import java.util.Scanner;

public class Ej10 {
    public static void main (String [] args){
        Scanner disney = new Scanner(System.in);
        int num = 0;
        int contador = 0;
        do {
            System.out.println("Introduzca un numero");
            num = disney.nextInt();
            contador ++;
        } while (num >= 0);
        System.out.println("Introdujo: " + contador + " numeros");
    }
}
