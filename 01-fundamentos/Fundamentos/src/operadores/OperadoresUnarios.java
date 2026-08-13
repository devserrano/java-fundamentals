package operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("Operadores unarios");

        int a = 3;
        int resultado;
        int b = -2;
        var c = true;

        //Operador unario

        resultado = +a;
        System.out.println("Resultado +a" + resultado);

        resultado = -a;
        System.out.println("Resultado de -a" + resultado);

        //Operadores unitarios de incre,ento y decreento

        a = 3;
        resultado = ++a;
        System.out.println("Resultado = " + resultado);

        a = 3;
        resultado = a++;
        System.out.println("Resultado = "+ resultado);
        System.out.println("Resuktado =  "+a);

    }
}
