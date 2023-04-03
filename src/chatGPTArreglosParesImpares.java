import java.util.Scanner;

public class chatGPTArreglosParesImpares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] pares = new int[10];
        int[] impares = new int[10];

        int p = 0;
        int i = 0;
        for (int j = 0; j < 20; j++) {
            System.out.print("Ingrese un número: ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                pares[p] = num;
                p++;
            } else {
                impares[i] = num;
                i++;
            }
        }
        sc.close();

        System.out.println("Arreglo de números pares:");
        for (int k = 0; k < pares.length; k++) {
            System.out.print(pares[k] + " ");
        }
        System.out.println();

        System.out.println("Arreglo de números impares:");
        for (int k = 0; k < impares.length; k++) {
            System.out.print(impares[k] + " ");
        }
    }

}
