package retos.retosOperadores;

import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        int valorinicial;
        int valorFinal;
        int numero;


        var scanner = new Scanner(System.in);
        System.out.println("Introduce el valor incial: ");
        valorinicial = scanner.nextInt();

        System.out.println("Introduce el valor final: ");
        valorFinal = scanner.nextInt();

        System.out.println("Introce el numero: ");
        numero = scanner.nextInt();
        if (numero >= valorinicial && numero <= valorFinal) {
            System.out.println("El numero esta dentro del rango");
        } else {
            System.out.println("El numero esta fuera del rango");

        }
    }
}
