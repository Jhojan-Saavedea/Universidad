import java.util.ArrayList;

public class Actividad2 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Yised");
        names.add("David");
        names.add("Shanya");
        names.add("Johan");
        names.add("Valery");

        System.out.println("Impresión con for:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println("Impresión con foreach:");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("Impresión con while:");
        int i = 0;
        while (i < names.size()) {
            System.out.println(names.get(i));
            i++;
        }

        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(4);
        num.add(8);
        num.add(10);
        num.add(12);
        num.add(14);

        int suma = 0;
        for (int numero : num) {
            suma += numero;
        }

        System.out.println("Lista de números: " + num);
        System.out.println("Tamaño de la lista de números: " + num.size());
        System.out.println("Número seleccionado: " + num.get(2));
        System.out.println("Sumatoria con foreach: " + suma);
    }
}
