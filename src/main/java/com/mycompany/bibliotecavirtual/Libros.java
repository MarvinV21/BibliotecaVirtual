/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecavirtual;

/**
 *
 * @author marvi
 */

// Clase Libro
public class Libros {
    private final String titulo;
    private final String autor;
    private final int añoPublicacion;
    private final String genero;
    private boolean disponible;

    // Constructor para inicializar los atributos
    public Libros(String titulo, String autor, int añoPublicacion, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.genero = genero;
        this.disponible = true;  // Al agregar el libro, siempre estará disponible por defecto
    }

    // Métodos para obtener la información del libro
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // Método para prestar el libro
    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + titulo + "' ya esta prestado.");
        }
    }

    // Método para devolver el libro
    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro '" + titulo + "' ha sido devuelto.");
        } else {
            System.out.println("El libro '" + titulo + "' no estaba prestado.");
        }
    }

    // Mostrar la información del libro
    public void mostrarInfo() {
        String estado = disponible ? "Disponible" : "Prestado";
        System.out.println("Titulo: " + titulo + ", Autor: " + autor + ", Año: " + añoPublicacion + ", Genero: " + genero + ", Estado: " + estado);
    }
}