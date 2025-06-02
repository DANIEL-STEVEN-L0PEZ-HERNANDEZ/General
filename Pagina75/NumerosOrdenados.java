import java.util.Scanner;
import java.util.TreeSet;

public class NumerosOrdenados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> numeros = new TreeSet<>();

        String continuar;

        do {
            System.out.print("Ingrese un número: ");
            int numero = sc.nextInt();
            numeros.add(numero); // Se añade al TreeSet (sin duplicados y ordenado)

            System.out.print("¿Desea ingresar otro número? (s/n): ");
            continuar = sc.next();

        } while (continuar.equalsIgnoreCase("s"));

        // Mostrar los números ordenados
        System.out.println("\nNúmeros ingresados (ordenados de menor a mayor):");
        for (int n : numeros) {
            System.out.println(n);
        }
    }
}