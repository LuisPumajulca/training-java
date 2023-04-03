import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[5];

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Bicicleta Oxford";
        productos[3] = "Disco SSD";
        productos[4] = "Tarjeta de video";

        Arrays.sort(productos);


        int total = productos.length;

        System.out.println("********** USANDO FOR*********");
        for (int i = 0; i < total; i++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        System.out.println("**********USANDO FOREACH******");
        for (String prod: productos) {
            System.out.println("prd = " + prod);
        }

        System.out.println("************ USANDO WHILE **********");
        int i = 0;
        while (i < total) {
            System.out.println("para indice " + i + " : " + productos[i]);
            i++;
        }

        System.out.println("********** USANDO DO WHILE *********");
        int j = 0;
        do {
            System.out.println("para indice " + j + " : " + productos[j]);
            j++;
        }
        while (j < total);


        int[] numeros = new int[10];

        int totalNumeros = numeros.length;
        for (int k = 0; k < totalNumeros; k++){
            numeros[k] = k*3;
        }
        for (int k = 0; k < totalNumeros; k++){
            System.out.println("numeros = " + numeros[k]);
        }
    }
}
