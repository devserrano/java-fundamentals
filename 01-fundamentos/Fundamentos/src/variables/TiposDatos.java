package variables;

public class TiposDatos {
    public static void main(String[] args) {

        //BYTE macimo
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);
        short tipShort = 32000;
        System.out.println("tipShort = " + tipShort);
        int tipoInt = 2145758589;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 929393234538278843l; // L o l para indicar que es un tipo long
        System.out.println("tipoLong = " + tipoLong);

        //Flotante
        float tipoFloat = 3.14F; // F o f para indicar que es un tipo flotante
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1416D; // D o d para indicar que es un tipo double
        System.out.println("tipoDouble = " + tipoDouble);

        //Tipo caracter (valor por default 0)
        char tipoChar = 'A'; //Juego de caracteres unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        //booleano (valor defalut = false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        //tipoObjet o referencia (Valor default = null)     ausencia de unan
        String nombre = "Diego";
        System.out.println("nombre = " + nombre);
    }
}
