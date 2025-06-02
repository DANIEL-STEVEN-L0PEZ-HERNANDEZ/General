import java.util.LinkedList;

public class LinkedListAlumnos {
    // Clase Alumno (reutilizada del ejercicio anterior)
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

        // Método para mostrar los datos
        public void mostrar() {
            System.out.println("Código: " + codigo + ", Nombre: " + nombre + ", Carnet: " + carnet);
        }
    }

    public static void main(String[] args) {
        LinkedList<Alumno> listaAlumnos = new LinkedList<>();

        // Insertar datos
        listaAlumnos.add(new Alumno(101, "Daniel", "SC2023001"));
        listaAlumnos.add(new Alumno(102, "Rocío", "SC2023002"));
        listaAlumnos.add(new Alumno(103, "Valeria", "SC2023003"));

        // Mostrar datos
        System.out.println("Listado de alumnos (LinkedList):");
        for (Alumno a : listaAlumnos) {
            a.mostrar();
        }
    }   
}