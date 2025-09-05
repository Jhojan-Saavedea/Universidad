import java.util.Arrays;
import java.util.Random;

public class Actividad4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        int[] copia1 = Arrays.copyOf(array, array.length);
        int[] copia2 = Arrays.copyOf(array, array.length);
        int[] copia3 = Arrays.copyOf(array, array.length);

        // Burbuja
        long inicio = System.nanoTime();
        burbuja(copia1);
        long fin = System.nanoTime();
        System.out.println("Burbuja: " + (fin - inicio) + " ns");

        // Selección
        inicio = System.nanoTime();
        seleccion(copia2);
        fin = System.nanoTime();
        System.out.println("Selección: " + (fin - inicio) + " ns");

        // Inserción
        inicio = System.nanoTime();
        insercion(copia3);
        fin = System.nanoTime();
        System.out.println("Inserción: " + (fin - inicio) + " ns");
    }

    // Burbuja
    public static void burbuja(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selección
    public static void seleccion(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Inserción
    public static void insercion(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
