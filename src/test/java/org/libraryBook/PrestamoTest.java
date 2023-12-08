package org.libraryBook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrestamoTest {

    @Test
    void testGetterAndSetter() {

        Libro libro = new Libro("Libro de Prueba", "Autor de Prueba", 10);
        Prestamo prestamo = new Prestamo(libro, 3);


        assertEquals(libro, prestamo.getLibro());
        assertEquals(3, prestamo.getCantidad());
        assertNotNull(prestamo.getFechaPrestamo());
        assertNotNull(prestamo.getFechaDevolucion());

        Libro nuevoLibro = new Libro("Nuevo Libro", "Nuevo Autor", 5);
        prestamo.setLibro(nuevoLibro);
        prestamo.setCantidad(5);

        assertEquals(nuevoLibro, prestamo.getLibro());
        assertEquals(5, prestamo.getCantidad());
    }
}