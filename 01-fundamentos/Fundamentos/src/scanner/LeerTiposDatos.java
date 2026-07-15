package scanner;

import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class LeerTiposDatos {
        public static void main(String[] args) {

            //Leer distintos tipos de datos
            //Leer tipo int - nextInt

            var consola = new Scanner(System.in);
            System.out.print("Ingresa tu edad: ");
            var edad = consola.nextInt();
            System.out.println("edad = " + edad);

            //Leer tipo double

            System.out.print("Ingresa tu altura :");
            var altura = consola.nextDouble();
            System.out.println("altura = " + altura);
            //Consumimos el caracter de salto de linea
            //Leer un String
            consola.nextLine();

            System.out.println("Ingresa tu nombre: ");
            var nombre = consola.nextLine();
            System.out.println("nombre = " + nombre);

            //Leer int Double con conversion de datos
            System.out.print("Proporciona un valor entero: ");
            var entero = Integer.parseInt(consola.nextLine());
            System.out.println("entero = " + entero);

            //Tipoo flotante con conversion
            System.out.println("Proporciona un valor flotante:");
            var flotante = Float.parseFloat(consola.next());




        }
}
