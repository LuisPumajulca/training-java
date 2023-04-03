import java.util.Scanner;

public class tarea17C {

    public static void main(String[] args) {
        int[] numeros = {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1};
        int[] frecuencia = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            frecuencia[numeros[i] - 1]++;
        }

        for (int i = 0; i < 6; i++) {
            System.out.print((i + 1) + ": ");
            for (int j = 0; j < frecuencia[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
