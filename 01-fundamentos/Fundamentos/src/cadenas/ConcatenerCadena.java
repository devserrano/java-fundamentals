package cadenas;

public class ConcatenerCadena {

    public static void main(String[] args) {

        var cadena1 = "Hola";
        var cadena2 = "Mundo";

        System.out.println(cadena1 + " " + cadena2);

        //Clase concat
        var nuevaCadena = cadena1.concat(" ").concat("Mundo");
        System.out.println("nuevaCadena = " + nuevaCadena);

        //String Builder
        var constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena1).append(" ").append(cadena2);

        var resultado = constructorCadenas.toString();
        System.out.println("resultado = " + resultado);

        //String Buffer
        var stringBuffer = new StringBuffer();

        //Join
        var nombre = "Diego ";
        resultado = String.join(" ",cadena1,cadena2,nombre);
        System.out.println("stringBuffer = " + resultado);

    }
}
