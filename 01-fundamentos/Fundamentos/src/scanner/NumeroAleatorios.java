package scanner;
import java.util.Random;

public class NumeroAleatorios {
    public static void main(String[] args) {
        //Numeros Aleatorios

        var random = new Random();

        //Generar un numero aleatorio entre 0 y 9

        var numeroAleatorio = random.nextInt(10);
        System.out.println("numeroAleatorio = " + numeroAleatorio);

        //Generar un numero aleatorio entre 0 y 10

        var numeroAleatorio2 = random.nextInt(10) + 1;
        System.out.println("numeroAleatorio2 = " + numeroAleatorio2);

        var alaeatorioFlotante = random.nextFloat();
        System.out.println("alaeatorioFlotante = " + alaeatorioFlotante);

        //Simular el lanzamiento de un dado

        var dadoAleatorio = random.nextInt(6 ) + 1;
        System.out.println("dadoAleatorio = " + dadoAleatorio);


    }
}
