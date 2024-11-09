/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecavirtual;

/**
 *
 * @author marvi
 */

import java.util.ArrayList;

public class Biblioteca {
    // Lista de libros en la biblioteca
    private final ArrayList<Libros> libros;

    // Constructor para inicializar la lista de libros
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // Método para agregar un libro a la biblioteca
    public void agregarLibro(Libros libro) {
        libros.add(libro);
        System.out.println("El libro '" + libro.getTitulo() + "' ha sido agregado a la biblioteca.");
    }

    // Método para buscar libros por título o autor
    public void buscarLibro(String query) {
        for (Libros libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(query) || libro.getAutor().equalsIgnoreCase(query)) {
                libro.mostrarInfo();
            }
        }
    }

    // Método para prestar un libro
    public void prestarLibro(String titulo) {
        for (Libros libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.prestar();
                return;
            }
        }
        System.out.println("El libro con el titulo '" + titulo + "' no fue encontrado.");
    }

    // Método para devolver un libro
    public void devolverLibro(String titulo) {
        for (Libros libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.devolver();
                return;
            }
        }
        System.out.println("El libro con el titulo '" + titulo + "' no fue encontrado.");
    }

    // Método para mostrar la información de todos los libros disponibles
    public void mostrarLibrosDisponibles() {
        for (Libros libro : libros) {
            if (libro.isDisponible()) {
                libro.mostrarInfo();
            }
        }
    }
}