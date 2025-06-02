import java.util.LinkedHashSet;

public class LibrosApp {
    // Clase Libro
    static class Libro {
        private int id;
        private String titulo;
        private String edicion;
        private String autor;

        // Constructor
        public Libro(int id, String titulo, String edicion, String autor) {
            this.id = id;
            this.titulo = titulo;
            this.edicion = edicion;
            this.autor = autor;
        }

        // Método para mostrar datos del libro
        public void mostrar() {
            System.out.println("ID: " + id + ", Título: " + titulo + ", Edición: " + edicion + ", Autor: " + autor);
        }

        // Sobrescribir equals() y hashCode() para evitar duplicados por ID
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            Libro libro = (Libro) obj;
            return id == libro.id; // Comparar por ID
        }

        @Override
        public int hashCode() {
            return Integer.hashCode(id);
        }
    }

    public static void main(String[] args) {
        LinkedHashSet<Libro> biblioteca = new LinkedHashSet<>();

        // Insertar libros
        biblioteca.add(new Libro(1, "Java Básico", "3ra Edición", "Juan Pérez"));
        biblioteca.add(new Libro(2, "Programación Avanzada", "2da Edición", "Ana Gómez"));
        biblioteca.add(new Libro(3, "Estructuras de Datos", "1ra Edición", "Carlos Ruiz"));
        biblioteca.add(new Libro(1, "Java Básico", "3ra Edición", "Juan Pérez")); // Duplicado (por ID)

        // Mostrar libros
        System.out.println("Listado de libros:");
        for (Libro libro : biblioteca) {
            libro.mostrar();
        }
    }
}