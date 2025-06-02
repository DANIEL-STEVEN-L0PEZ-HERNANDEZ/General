import java.util.Scanner;

public class CapitalizarCadena {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String cadena = sc.nextLine();

        String resultado = capitalizarPalabras(cadena);

        System.out.println("Cadena modificada: " + resultado);
    }

    // Método para convertir a mayúscula la primera letra y la primera letra después de cada espacio
    public static String capitalizarPalabras(String texto) {
        texto = texto.toLowerCase(); // Primero, convertir todo a minúsculas para uniformidad
        StringBuilder resultado = new StringBuilder();

        boolean capitalizar = true; // Se activa al inicio y después de cada espacio

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (Character.isLetter(c) && capitalizar) {
                resultado.append(Character.toUpperCase(c));
                capitalizar = false;
            } else {
                resultado.append(c);
            }

            if (c == ' ') {
                capitalizar = true;
            }
        }

        return resultado.toString();
    }
}