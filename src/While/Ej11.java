package While;

import java.util.Scanner;

public class Ej11 {
    public static void main (String [] args) {
        Scanner kb = new Scanner(System.in);
        int a = 1;
        int b = 1;
        while (a > 0 && b > 0){
            System.out.println("Introduzca dos numeros");
            a = kb.nextInt();
            b = kb.nextInt();
        }
        System.out.println((a + b));
    }
}
