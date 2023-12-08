package org.libraryBook;

import java.util.ArrayList;
import java.util.List;

class Usuario {
    String nombre;
    List<Libro> librosPrestados = new ArrayList<>();

    public Usuario(String nombre) {
        this.nombre = nombre;
    }
}