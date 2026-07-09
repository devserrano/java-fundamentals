package variables;

import javax.lang.model.SourceVersion;
import java.nio.channels.Pipe;

public class Constantes {
    public static void main(String[] args) {

        //Las constantes en java se acostumbran a poner en mayusaculas y con guiones bajos

        System.out.println("***Constantes en JAVA***");

        final var LLAMADA_DIAS_SEMANA = 7;
        System.out.println(LLAMADA_DIAS_SEMANA);

        final var PI = 3.1416;
        System.out.println("PI = " + PI);
        System.out.println("Math: "+ Math.PI);

        final var MENSAJE_BIENVENIDA = "Benvenido a la Universidad java";
        System.out.println("MENSAJE_BIENVENIDA = " + MENSAJE_BIENVENIDA);







    }
}
