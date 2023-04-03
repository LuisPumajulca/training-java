import java.util.Scanner;

public class tarea13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        // Leer 10 números enteros del usuario
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número entero: ");
            arr[i] = sc.nextInt();
        }
        sc.close();

        // Mostrar los elementos en el orden especificado
        int i = 9; // Índice del último elemento
        int j = 0; // Índice del primer elemento
        while (i > j) {
            System.out.print(arr[i] + " ");
            System.out.print(arr[j] + " ");
            i--;
            j++;
        }
        // Si el arreglo tiene un número impar de elementos, imprimir el elemento central
        if (i == j) {
            System.out.print(arr[i]);
        }
    }
}
