package While;

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num;
        int contadorG1 = 0;
        int contadorG2 = 0;
        int contadorG3 = 0;
        do {
            System.out.println("Introduce un numero");
            num = kb.nextInt();
            if (num >= 5 && num <= 10) {
                contadorG1 += 1;
            } else {
                if (num >= 11 && num <= 15) {
                    contadorG2 += 1;
                } else {
                    if (num >= 0) {
                        contadorG3 += 1;
                    }
                }
            }
        } while (num >= 0) ;
        System.out.println("Entre 5 y 10 hay:" + contadorG1);
        System.out.println("Entre 11 y 15 hay:" + contadorG2);
        System.out.println("Fuera de estos intervalos hay:" + contadorG3);
    }
}