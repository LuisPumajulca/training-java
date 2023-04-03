import java.util.Scanner;

public class tarea14C {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Scanner scanner = new Scanner(System.in);

        // Leer 7 números enteros del usuario y agregarlos al arreglo
        for (int i = 0; i < 7; i++) {
            System.out.print("Ingrese el número " + (i + 1) + " (rango 11 a 99): ");
            int num = scanner.nextInt();

            // Verificar si el número está dentro del rango de 11 a 99
            if (num >= 11 && num <= 99) {
                arr[i] = num;
            } else {
                System.out.println("Número inválido. Ingrese un número dentro del rango de 11 a 99.");
                i--; // Decrementar i para leer un número válido en la siguiente iteración
            }
        }

        scanner.close();

        int max = 11; // El valor más bajo en el rango de 11 a 99

        // Iterar sobre el arreglo y encontrar el valor más alto
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num > max) {
                max = num;
            }
        }

        System.out.println("El número más alto es: " + max);
    }

}
