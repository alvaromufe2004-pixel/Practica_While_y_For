package While;

import java.util.Scanner;

public class Ej9 {
    public static void main (String[] args){
        Scanner cloudePeorQueChadGPT = new Scanner(System.in);
        int a = 2;
        int b = 1;
        while (a != b && a != 0 && b != 0){
            System.out.println("Introduzca dos numeros");
            a = cloudePeorQueChadGPT.nextInt();
            b = cloudePeorQueChadGPT.nextInt();
        }
    }
}
