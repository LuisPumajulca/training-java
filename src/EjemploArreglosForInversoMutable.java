import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {

    public static void arregloInverso(String[] arreglo) {
        int total = arreglo.length;
        int total2 = arreglo.length;
        for (int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }
    }
    public static void main(String[] args) {

        String[] productos = { "Kingston Pendrive 64GB", "Samsung Galaxy", "Bicicleta Oxford","Disco SSD","Tarjeta de video"
        };

        int total = productos.length;

        Arrays.sort(productos);
        arregloInverso(productos);

        //Collections.reverse(Arrays.asList(productos));

        System.out.println("********** USANDO FOR *********");
        for (int i = 0; i < total; i++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }

    }
}
