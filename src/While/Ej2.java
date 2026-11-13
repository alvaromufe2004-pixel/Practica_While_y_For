package While;

import java.util.Scanner;

public class Ej2 {
    public static void main (String [] args){
        Scanner kb = new Scanner(System.in);
        int numero = 10;
        while (numero!=0){
            System.out.println("Introduzca un numero");
            numero = kb.nextInt();
        }
    }
}
