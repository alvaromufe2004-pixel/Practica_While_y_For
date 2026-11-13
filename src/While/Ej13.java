package While;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int contador = 0;
        int a;
        int suma = 0;
        do {
            System.out.println("Introduzca un numero");
            a = kb.nextInt();
            suma += a;
            if (a != 0){
                contador++;
            }
        } while (a != 0);
        if (contador == 0){
            contador = 1;
        }
            System.out.println("La suma es: " + suma +
                "\n La media es:" + (suma/contador));
    }
}
