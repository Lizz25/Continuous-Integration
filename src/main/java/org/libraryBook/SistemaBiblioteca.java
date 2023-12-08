package org.libraryBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SistemaBiblioteca {
    static List<Libro> catalogo = new ArrayList<>();
    static List<Usuario> usuarios = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inicializarCatalogo();

        // Supongamos que algunos usuarios están registrados
        usuarios.add(new Usuario("Juan"));
        usuarios.add(new Usuario("Ana"));

        // Tu lógica de aplicación aquí, por ejemplo, prestarLibro, devolverLibro, etc.
    }
    private static void inicializarCatalogo() {
        // Libros de muestra en el catálogo
        catalogo.add(new Libro("Libro1", "Autor1", 5));
        catalogo.add(new Libro("Libro2", "Autor2", 3));
        catalogo.add(new Libro("Libro3", "Autor3", 7));
        // Agregar más libros según sea necesario
    }

    private static void mostrarCatalogo() {
        System.out.println("Catálogo:");
        for (Libro libro : catalogo) {
            System.out.println(libro.getTitulo() + " por " + libro.getAutor() + " (Disponible: " + libro.getCantidadDisponible() + ")");
        }
    }
    private static int obtenerSeleccionUsuario() {
        System.out.print("Ingrese su elección: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, ingrese un número.");
            scanner.next(); // Consumir la entrada inválida
        }
        return scanner.nextInt();
    }
}
