package retos.retosOperadores;

import java.util.Scanner;

public class DescuentoVIP {
    public static void main(String[] args) {
        int productos = 0;
        boolean tieneMembresia;
        boolean descuentoVip;

        var scanner = new Scanner(System.in);

        System.out.println("¿Cuantos productos ha comprado hoy?");
        productos = scanner.nextInt();

        System.out.println("Tiene descuento vip?");
        tieneMembresia = scanner.nextBoolean();

        if(productos >= 10 && tieneMembresia == true){
            descuentoVip = true;
        }else{
            descuentoVip = false;
        }

        System.out.println("Aplica descuento vip? : " + descuentoVip);

    }
}
