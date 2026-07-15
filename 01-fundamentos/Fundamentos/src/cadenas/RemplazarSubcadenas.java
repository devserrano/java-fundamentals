package cadenas;

public class RemplazarSubcadenas {
    public static void main(String[] args) {

        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        //"Mundo" a "Todos"
        var nuevacCadena = cadena1.replace("Mundo", "a Todos");
        System.out.println("nuevacCadena = " + nuevacCadena);


        //Remplazar la subcadena de Hola por Adios
        var nuevaCadena = cadena1.replace("Hola", "Adios");
        System.out.println("nuevaCadena = " + nuevaCadena);
    }
}
