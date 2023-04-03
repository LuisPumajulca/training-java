import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        String[] productos = { "Kingston Pendrive 64GB", "Samsung Galaxy", "Bicicleta Oxford","Disco SSD","Tarjeta de video"
        };

        Arrays.sort(productos);

        int total = productos.length;

        System.out.println("********** USANDO FOR *********");
        for (int i = 0; i < total; i++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        System.out.println("********** USANDO FOR INVERSA *********");
        for (int i = 0; i < total; i++){
            System.out.println("para indice " + (total-1-i) + " : " + productos[total-1-i]);
        }

        System.out.println("********** USANDO FOR INVERSA 2 *********");
        for (int i = total - 1; i >= 0 ; i--){
            System.out.println("para i " + i + " : " + productos[i]);
        }

    }
}
