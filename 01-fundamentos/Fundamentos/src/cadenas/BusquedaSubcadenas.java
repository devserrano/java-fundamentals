package cadenas;

public class BusquedaSubcadenas {
    public static void main(String[] args) {

        //Buscar subcadenas
        //Indexof
        //Para la subcadena no encontrada devuelve -1
        var cadena1 = "Hola Mundo";
        var subCadena1 = cadena1.indexOf("Hola");
        System.out.println("La subcadena Hola se encuentra en el indice: " + subCadena1);
        var subCadena2 = cadena1.lastIndexOf("Mundo");
        System.out.println("La subcadena Mundo se encuentra en el indice: " + subCadena2);



    }
}
