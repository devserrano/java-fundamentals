package operadores;

import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Operadores aritmeticcos");

        int a = 5, b = 1, resultado;

        resultado = a + b;
        System.out.println("Resultado de la suma: " + resultado);

        //Resta
        int resta = a - b;
        System.out.println("Resultado de la resta es:" + resultado);

        //multiplicacion
        int mutiplicacion = a * b;
        System.out.println("resultado de multiplicacion es: " + resultado);

        //Divicion

        int division = a/b;
        System.out.println("resultado de la divison es: "+resultado);

        //Modulo

        int modulo = a%b;
        System.out.println("resuktado de modulo es: "+ resultado);



    }
}
