import java.util.Scanner;

public class chatGTParreglosDesplazaPosicion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Ingrese la posición en la que desea agregar un nuevo número: ");
        int pos = sc.nextInt();
        System.out.print("Ingrese el nuevo número: ");
        int num = sc.nextInt();
        sc.close();

        if (arr.length - 1 - pos >= 0) System.arraycopy(arr, pos, arr, pos + 1, arr.length - 1 - pos);
        arr[pos] = num;

        System.out.println("Arreglo con el nuevo número agregado:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
