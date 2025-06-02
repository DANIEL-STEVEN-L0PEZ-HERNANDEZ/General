import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        if (esPalindromo(palabra)) {
            System.out.println("La palabra ES palíndroma.");
        } else {
            System.out.println("La palabra NO es palíndroma.");
        }
    }

    // Método que verifica si la palabra es palíndroma
    public static boolean esPalindromo(String texto) {
        texto = texto.toLowerCase().replaceAll("\\s+", ""); // sin mayúsculas ni espacios
        String invertida = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);
        }

        return texto.equals(invertida);
    }
}