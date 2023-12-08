package org.libraryBook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LibroTest {

    @Test
    void getTitulo() {
        Libro libro = new Libro("Libro1","Autor1", 5);
        Assertions.assertEquals("Libro1", libro.getTitulo());
    }

    @org.junit.jupiter.api.Test
    void setTitulo() {
    }

    @org.junit.jupiter.api.Test
    void getAutor() {
    }

    @org.junit.jupiter.api.Test
    void setAutor() {
    }

    @org.junit.jupiter.api.Test
    void getCantidadDisponible() {
    }

    @org.junit.jupiter.api.Test
    void setCantidadDisponible() {
    }
}