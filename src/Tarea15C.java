import java.util.Scanner;

public class Tarea15C {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Scanner scanner = new Scanner(System.in);

        // Leer 7 números enteros del usuario y agregarlos al arreglo
        for (int i = 0; i < 7; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int num = scanner.nextInt();
            arr[i] = num;
        }

        scanner.close();

        int numPos = 0; // contador de números positivos
        int sumPos = 0; // suma de los números positivos
        int numNeg = 0; // contador de números negativos
        int sumNeg = 0; // suma de los números negativos
        int numZeros = 0; // contador de ceros en el arreglo

        // Iterar sobre el arreglo y actualizar las variables según corresponda
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num > 0) {
                numPos++;
                sumPos += num;
            } else if (num < 0) {
                numNeg++;
                sumNeg += num;
            } else {
                numZeros++;
            }
        }

        // Calcular los promedios de los números positivos y negativos
        double promPos = numPos > 0 ? (double) sumPos / numPos : 0;
        double promNeg = numNeg > 0 ? (double) sumNeg / numNeg : 0;

        System.out.println("El promedio de los números positivos es: " + promPos);
        System.out.println("El promedio de los números negativos es: " + promNeg);
        System.out.println("El número de ceros es: " + numZeros);
    }
}
