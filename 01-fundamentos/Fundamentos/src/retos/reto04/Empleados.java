package retos.reto04;

import javax.swing.text.StyledEditorKit;
import java.util.Scanner;

public class Empleados {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

        System.out.println("Introduce tu edad : ");
        var edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad);

        System.out.println("Introduce tu salario :");
        var salario = Float.parseFloat(consola.nextLine());
        System.out.println("salario = " + salario);

        System.out.println("Es jefe de mantenimiento? :");
        var esJefe = Boolean.parseBoolean(consola.nextLine());
        System.out.println("esJefe = " + esJefe);


    }
}
