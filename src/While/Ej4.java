package While;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args){
        Scanner Rico = new Scanner(System.in);
        System.out.println("Introduzca dos numeros");
        int[] array = new int [2];
        array[0]= Rico.nextInt();
        array[1]= Rico.nextInt();
        while(array[0] != array[1]){
            System.out.println("Introduceslos de nuevo pichon");
            array[0]= Rico.nextInt();
            array[1]= Rico.nextInt();
        }
    }
}
