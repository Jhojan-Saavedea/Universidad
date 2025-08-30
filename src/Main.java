import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        // 1. Sumar
        int s = 0;
        for (int x : nums) {
            s += x;
        }
        System.out.println("La suma de los elementos es: " + s);

        // 2. Contar pares
        int c = 0;
        for (int x : nums) {
            if (x % 2 == 0) {
                c++;
            }
        }
        System.out.println("Cantidad de números pares: " + c);

        // 3. Buscar un número (ejemplo: buscar 30)
        int b = 30;
        boolean esta = false;
        for (int x : nums) {
            if (x == b) {
                esta = true;
                break;
            }
        }
        System.out.println("¿Está el número " + b + " en la lista?: " + esta);
    }
}
