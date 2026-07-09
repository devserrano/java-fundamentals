package cadenas;

public class ComparacionCadenas {
    public static void main(String[] args) {

        //Comparar dos cadenas (POOL CADENA )

        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");

        //Comparacin de cadenas (==) comaran la referencia en memoria

        System.out.print ("Cadena 1 es igual a cadena 2 en refrencia? ");
        System.out.println(cadena1 == cadena2);
        System.out.print("Cadena 1 es igual en refrencia a cadena3)? ");
        System.out.println(cadena1 == cadena3);

        //Comparar contenido (Metodo EQUALS)

        System.out.print("cadena 1 es igual en contenido a cadena3? ");
        System.out.println(cadena1.equals(cadena3));



    }
}
