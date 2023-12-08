package org.libraryBook;

import java.util.Date;

class Prestamo {
    Libro libro;
    int cantidad;
    Date fechaPrestamo;

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    Date fechaDevolucion;

    public Prestamo(Libro libro, int cantidad) {
        this.libro = libro;
        this.cantidad = cantidad;
        this.fechaPrestamo = new Date();
        // Calcular la fecha de devolución sumando 14 días a la fecha actual
        this.fechaDevolucion = new Date(this.fechaPrestamo.getTime() + (14 * 24 * 60 * 60 * 1000L));
    }
}