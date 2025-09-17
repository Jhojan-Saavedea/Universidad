import java.util.Arrays;
import java.util.Random;

public class actividad5 {
    public static int busquedaLineal(int[] arr, int valor) {
        int comp = 0;
        for (int i = 0; i < arr.length; i++) {
            comp++;
            if (arr[i] == valor) {
                System.out.println("Lineal -> Comparaciones: " + comp);
                return i;
            }
        }
        System.out.println("Lineal -> Comparaciones: " + comp);
        return -1;
    }

    public static int busquedaBinaria(int[] arr, int valor) {
        int izq = 0, der = arr.length - 1, comp = 0;
        while (izq <= der) {
            int mid = (izq + der) / 2;
            comp++;
            if (arr[mid] == valor) {
                System.out.println("Binaria -> Comparaciones: " + comp);
                return mid;
            } else if (arr[mid] < valor) {
                izq = mid + 1;
            } else {
                der = mid - 1;
            }
        }
        System.out.println("Binaria -> Comparaciones: " + comp);
        return -1;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] nums = new int[20];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(100) + 1;
        }

        System.out.println("Arreglo: " + Arrays.toString(nums));
        int existe = nums[rand.nextInt(nums.length)];
        int noExiste = 101;

        System.out.println("\nCon valor existente (" + existe + "):");
        busquedaLineal(nums, existe);
        Arrays.sort(nums);
        busquedaBinaria(nums, existe);

        System.out.println("\nCon valor NO existente (" + noExiste + "):");
        busquedaLineal(nums, noExiste);
        busquedaBinaria(nums, noExiste);
    }
}
