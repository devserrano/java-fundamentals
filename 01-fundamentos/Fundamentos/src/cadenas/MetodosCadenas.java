package cadenas;

import java.util.Locale;

public class MetodosCadenas {
    public static void main(String[] args) {

        //Metrodos en Cadenas
        //lenght
        var cadena1 = "Hola Mundo";
        System.out.println(cadena1.length());

        //Remplazar un caracter
        //replace
        var nuevaCadena = cadena1.replace("o","a");
        System.out.println("nuevaCadena = " + nuevaCadena);

        //Convertir a mayusculas
        //toUpperCase
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);

        //Convertir a minusculas
        //toLowerCase
        var minusculas = cadena1.toLowerCase();
        System.out.println("minusculas = " + minusculas);

        //Elimina espacios al inicio y al final, no toca los espacios enmedio de la cadena
        //TRIM
        var cadena2 = "     Leo Reyes ";
        System.out.println("cadena2 = " + cadena2);
        var sinEspacios = cadena2.trim();
        System.out.println("sinEspacios = " + sinEspacios);



    }
}
