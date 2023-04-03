import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        String[] productos = new String[2];

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";

        Arrays.sort(productos);

        String prod1 = productos[0];
        String prod2 = productos[1];

        System.out.println("prod1 = " + prod1);
        System.out.println("prod2 = " + prod2);

        int[] numeros = new int[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 35;
        numeros[3] = -1;
//        numeros[4] = 5;


        
        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];
//        int m = numeros[4];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
