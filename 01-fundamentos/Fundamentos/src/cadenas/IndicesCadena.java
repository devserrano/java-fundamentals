package cadenas;

public class IndicesCadena {
    public static void main(String[] args) {

        System.out.println("***Manejo de indices en una cadena***");

        var cadena1 = "Hola";


        //Recuperar el primer caracter

        var primerCaracter = cadena1.charAt(0);
        System.out.println("primerCaracter = " + primerCaracter);

        //Recuperar el ultimo caracter en la posicion 9

        var ultimoCaracter = cadena1.charAt(3);
        System.out.println("ultimoCaracter = " + ultimoCaracter);
    }
}
