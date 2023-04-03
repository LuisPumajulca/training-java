import java.util.Scanner;

public class tarea16C {
    public static void main(String[] args) {
        int[] arreglo = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Leer los elementos del arreglo desde el usuario
        System.out.println("Ingrese los elementos del arreglo (enteros del 1 al 9):");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = scanner.nextInt();
        }

        // Encontrar el elemento con más ocurrencias
        int[] ocurrencias = new int[9]; // Solo necesitamos de 1 a 9
        for (int i = 0; i < arreglo.length; i++) {
            ocurrencias[arreglo[i]-1]++; // Sumar una ocurrencia al número correspondiente
        }
        int maxOcurrencias = 0;
        int elementoMasRepetido = 0;
        for (int i = 0; i < ocurrencias.length; i++) {
            if (ocurrencias[i] > maxOcurrencias) {
                maxOcurrencias = ocurrencias[i];
                elementoMasRepetido = i + 1;
            }
        }

        // Imprimir los resultados
        System.out.println("La mayor ocurrencia es: " + maxOcurrencias);
        System.out.println("El elemento que más se repite es: " + elementoMasRepetido);
    }
}
