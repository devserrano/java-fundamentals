package retos.reto04;

import java.util.Scanner;

public class Cocina {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        System.out.print("Ingresa el nombre: ");
        var nombre = consola.nextLine();


        System.out.print("Ingresa los ingrwedietes: ");
        var ingredientes = consola.nextLine();


        System.out.print("Ingresa tiempo de preparacion: ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());

        System.out.print("Ingresa la dificultad: ");
        var dificultad = consola.nextLine();

        System.out.println("----- Receta de Cocina -----");
        System.out.println("nombre = " + nombre);
        System.out.println("ingredientes = " + ingredientes);
        System.out.println("tiempoPreparacion = " + tiempoPreparacion);
        System.out.println("dificultad = " + dificultad);

    }
}
