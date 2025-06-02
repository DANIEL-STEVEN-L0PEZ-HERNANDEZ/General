import java.util.Scanner;

public class ContarVocalA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();

        int cantidad = contarLetraA(frase);

        System.out.println("La letra 'A' aparece " + cantidad + " veces.");
    }

    // Método que cuenta la cantidad de veces que aparece la letra A o a
    public static int contarLetraA(String texto) {
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c == 'A' || c == 'a') {
                contador++;
            }
        }

        return contador;
    }
}