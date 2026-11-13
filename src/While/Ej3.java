package While;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args){
        Scanner Rico = new Scanner(System.in);
        int[] numeros = new int [9];
        int contador = 10;
        System.out.println("Introduzca 10 numeros");
        int acumlativo = 0;
        while(contador != 0){
            int i = 0;
            numeros[i] = Rico.nextInt();
            acumlativo += numeros[i];
            i ++;
            contador--;
        }
        System.out.println("La suma total es:" + acumlativo);
    }
}
