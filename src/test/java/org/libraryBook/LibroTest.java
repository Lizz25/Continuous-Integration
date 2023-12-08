package org.libraryBook;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibroTest {

    @Test
    void getTitulo() {
        Libro libro = new Libro("Libro1","Autor1", 5);
        assertEquals("Libro1", libro.getTitulo());
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