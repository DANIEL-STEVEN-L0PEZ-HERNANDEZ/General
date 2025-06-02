import java.util.Scanner;

public class EliminarUltimaPalabra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();

        String nuevaFrase = eliminarUltimaPalabra(frase);

        System.out.println("Frase sin la última palabra: " + nuevaFrase);
    }

    // Método para eliminar la última palabra de la frase
    public static String eliminarUltimaPalabra(String frase) {
        frase = frase.trim(); // Quita espacios al inicio y final

        if (frase.isEmpty()) {
            return frase;
        }

        int ultimaPosicion = frase.lastIndexOf(' ');

        if (ultimaPosicion == -1) {
            // Solo hay una palabra
            return "";
        } else {
            return frase.substring(0, ultimaPosicion);
        }
    }
}
