package operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {

        System.out.println("Operador AND");

        var a = false;
        var b = false;

        //AND && Unicamente regresa true si ambos son true

        var resultado = a && b ;
        System.out.println("Resutado = " +resultado);

        //OR || Retorna tru cuando alguno es verdadero

        resultado = a || b;
        System.out.println("resultado = " + resultado);


    }
}
