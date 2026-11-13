package While;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("Introduzca un numero");
            num = kb.nextInt();
        } while (num>100);
    }
}