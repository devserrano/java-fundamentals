package variables;

import java.security.KeyStore;

public class ReglasNombresVariables {
    public static void main(String[] args) {
        String nombreCompleto = "Diego Alberto";
        System.out.println("nombreCompleto = " + nombreCompleto);

        String NombreCompleto = "Pedro Alvarez"; // No aplica buenas practicas
        System.out.println("NombreCompleto = " + NombreCompleto);

        String nombre_cliente = "Cliente 1 "; // Mala practica
        System.out.println("nombre_cliente = " + nombre_cliente);

        String $nombre = "Juan Perez";
        System.out.println("$nombre = " + $nombre);

        int totPzs = 10; //Correcto, no aplica buenas paracticas ( no abreviar )
        System.out.println("totPzs = " + totPzs);

        int totalPiezas = 15; // Correcto
        System.out.println("totalPiezas = " + totalPiezas);

        boolean esCasado = true; // Ser especificos
        System.out.println("esCasado = " + esCasado);
    }

}
