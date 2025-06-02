import java.util.Scanner;

public class QuitarEspacios {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String cadena = sc.nextLine();

        String sinEspacios = quitarEspacios(cadena);

        System.out.println("Cadena sin espacios: " + sinEspacios);
    }

    // Método que quita todos los espacios en blanco
    public static String quitarEspacios(String texto) {
        return texto.replaceAll("\\s+", ""); // Quita todos los espacios en blanco (espacios, tabulaciones, saltos de línea)
    }
}