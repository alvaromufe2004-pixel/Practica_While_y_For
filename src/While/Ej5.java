package While;

public class Ej5 {
    public static void main(String[] args){
        int[] Nethanyahu = {11, 9, 7, 5, 3, 1};
        int[] Israel = new int[Nethanyahu.length];
        int i = 0;
        int o = 5;
        int contador = 6;
        while (contador != 0){
            Israel[o] = Nethanyahu[i];
            i++;
            System.out.println(Israel[o]);
            o--;
            contador--;
        }
    }
}
