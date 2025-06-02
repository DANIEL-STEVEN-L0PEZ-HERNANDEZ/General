import java.util.ArrayList;

public class AlumnoApp {
    // Clase Alumno con encapsulamiento
    static class Alumno {
        private int codigo;
        private String nombre;
        private String carnet;

        // Constructor
        public Alumno(int codigo, String nombre, String carnet) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.carnet = carnet;
        }

        // Getters
        public int getCodigo() {
            return codigo;
        }

        public String getNombre() {
            return nombre;
        }

        public String getCarnet() {
            return carnet;
        }

        // Método para mostrar datos
        public void mostrar() {
            System.out.println("Código: " + codigo + ", Nombre: " + nombre + ", Carnet: " + carnet);
        }
    }

    public static void main(String[] args) {
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        // Insertar valores
        listaAlumnos.add(new Alumno(1, "Daniel", "SC2023001"));
        listaAlumnos.add(new Alumno(2, "Rocío", "SC2023002"));
        listaAlumnos.add(new Alumno(3, "Carlos", "SC2023003"));

        // Mostrar los alumnos
        System.out.println("Listado de alumnos:");
        for (Alumno a : listaAlumnos) {
            a.mostrar();
        }
    }
}