/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bibliotecavirtual;

/**
 *
 * @author marvi
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase Biblioteca
        Biblioteca biblioteca = new Biblioteca();
        try (Scanner sc = new Scanner(System.in)) {
            boolean continuar = true;
            
            while (continuar) {
                // Menú de opciones
                System.out.println("\n--- Biblioteca Virtual ---");
                System.out.println("1. Agregar libro");
                System.out.println("2. Buscar libro por titulo o autor");
                System.out.println("3. Prestar libro");
                System.out.println("4. Devolver libro");
                System.out.println("5. Mostrar libros disponibles");
                System.out.println("6. Salir");
                System.out.print("Elige una opcion: ");
                
                // Leer la opción del usuario
                int opcion = sc.nextInt();
                sc.nextLine();
                
                switch (opcion) {
                    case 1 -> {
                        // Agregar un libro
                        System.out.print("Ingresa el titulo: ");
                        String titulo = sc.nextLine();
                        System.out.print("Ingresa el autor: ");
                        String autor = sc.nextLine();
                        System.out.print("Ingresa el año de publicacion: ");
                        int anio = sc.nextInt();
                        sc.nextLine();  // Consumir el salto de línea
                        System.out.print("Ingresa el genero: ");
                        String genero = sc.nextLine();
                        
                        // Crear el libro y agregarlo a la biblioteca
                        Libros libro = new Libros(titulo, autor, anio, genero);
                        biblioteca.agregarLibro(libro);
                    }
                        
                    case 2 -> {
                        // Buscar un libro por título o autor
                        System.out.print("Ingresa el titulo o autor a buscar: ");
                        String query = sc.nextLine();
                        biblioteca.buscarLibro(query);
                    }
                        
                    case 3 -> {
                        // Prestar un libro
                        System.out.print("Ingresa el titulo del libro a prestar: ");
                        String tituloPrestar = sc.nextLine();
                        biblioteca.prestarLibro(tituloPrestar);
                    }
                        
                    case 4 -> {
                        // Devolver un libro
                        System.out.print("Ingresa el titulo del libro a devolver: ");
                        String tituloDevolver = sc.nextLine();
                        biblioteca.devolverLibro(tituloDevolver);
                    }
                        
                    case 5 -> // Mostrar todos los libros disponibles
                        biblioteca.mostrarLibrosDisponibles();
                        
                    case 6 -> {
                        // Salir del programa
                        continuar = false;
                        System.out.println("Saliendo de la biblioteca...");
                    }
                        
                    default -> System.out.println("Opcion no válida. Intenta de nuevo.");
                }
            }
        }
    }
}