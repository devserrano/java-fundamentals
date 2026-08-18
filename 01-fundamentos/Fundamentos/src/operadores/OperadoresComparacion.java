package operadores;

public class OperadoresComparacion {
    public static void main(String[] args) {
        int a = 3, b = 2;

        //Operadores de igualdad ==
        var resultado = (a == b);
        System.out.println("reresustado = " + resultado);

        //Distinto a !=
        resultado = a != b;
        System.out.println("resultado = " + resultado);

        //Mayor que
        resultado = a > b;
        System.out.println("resultado = " + resultado);

        //Mayor o igual que
        resultado = a>=b;
        System.out.println("resultado = " + resultado);

        //Menor que
        resultado = a < b;
        System.out.println("resultado = " + resultado);


    }
}
