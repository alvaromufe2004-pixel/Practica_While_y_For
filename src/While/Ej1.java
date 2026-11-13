package While;

import java.util.Random;

public class Ej1 {
        public static void main(String[] args){
            Random random = new Random();
            int numero = random.nextInt(0, 100);
            int primo = numero%numero;
            if(primo == 0){
                System.out.println("El numero es primo");
            }
        }
    }

