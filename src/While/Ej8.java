package While;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner summer = new Scanner(System.in);
        System.out.println("Introuce dos numeros. B tiene que ser mayor que a");
        int a = summer.nextInt();
        int b = summer.nextInt();
        int c = a;
        if (b > a) {
            System.out.println(c);
            do {
                System.out.println(c);
                c += 1;
            } while (c != b);
        } else {
            System.out.println("Valores incorrectos");
        }
    }
}