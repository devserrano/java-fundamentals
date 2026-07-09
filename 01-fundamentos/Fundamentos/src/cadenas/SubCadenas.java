package cadenas;

public class SubCadenas {
    public static void main(String[] args) {

        //Tema de Subcadenas
        //Obtener una parte de la cadena original

        var cadena1 = "Hola mundo";
        System.out.println("cadena1 = " + cadena1);

        //subString
        var subCadena1 = cadena1.substring(0,4);
        System.out.println("subCadena1 = " + subCadena1);

        var subCadena2 = cadena1.substring(5, 10);
        System.out.println("subCadena2 = " + subCadena2);



    }
}
