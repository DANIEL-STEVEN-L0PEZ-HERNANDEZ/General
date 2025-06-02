import java.util.Scanner;

public class PromedioYPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double suma = 0;
        int contador = 0;
        int positivos = 0;
        String continuar;

        do {
            System.out.print("Ingrese un número: ");
            double numero = sc.nextDouble();

            suma += numero;
            contador++;

            if (numero > 0) {
                positivos++;
            }

            System.out.print("¿Desea ingresar otro número? (s/n): ");
            continuar = sc.next();

        } while (continuar.equalsIgnoreCase("s"));

        if (contador > 0) {
            double promedio = suma / contador;
            System.out.println("Promedio de los números: " + promedio);
            System.out.println("Cantidad de números positivos: " + positivos);
        } else {
            System.out.println("No se ingresaron números.");
        }
    }
}