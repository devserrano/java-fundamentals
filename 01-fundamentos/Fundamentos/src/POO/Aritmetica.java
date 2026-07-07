package POO;

public class Aritmetica {

    int operando1;
    int operando2;


    void sumar(){
        var resultado = operando1 + operando2;
        System.out.println("Suma = "+resultado);

    }

    void restar(){
        var resultado = operando1 - operando2;
        System.out.println("Resta = " +resultado);
    }


    public static void main(String[] args) {
        System.out.println("Operaciones");

        var aritmetica1 = new Aritmetica();
        aritmetica1.operando1 = 10;
        aritmetica1.operando2 = 19;
        aritmetica1.sumar();


        var aritmetica2 = new Aritmetica();
        aritmetica2.operando1 = 12;
        aritmetica2.operando2 = 16;
        System.out.println();
        aritmetica2.sumar();
        aritmetica2.restar();

    }
}
