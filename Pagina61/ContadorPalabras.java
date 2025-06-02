import java.util.Scanner;

public class ContadorPalabras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();

        int cantidadPalabras = contarPalabras(frase);

        System.out.println("La frase contiene " + cantidadPalabras + " palabras.");
    }

    // Método para contar palabras
    public static int contarPalabras(String frase) {
        if (frase == null || frase.trim().isEmpty()) {
            return 0;
        }

        String[] palabras = frase.trim().split("\\s+");
        return palabras.length;
    }

}
