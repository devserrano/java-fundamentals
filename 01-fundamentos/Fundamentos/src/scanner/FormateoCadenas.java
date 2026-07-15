package scanner;

public class FormateoCadenas {
    public static void main(String[] args) {
        //Formateo de cadenas

        var nombre = "Matias";

        var edad = 35;

        var salario = 21000.50585;

        //String.format
        var mensaje = String.format("Nombre : %s, Edad: %d, Salario: %.2f", nombre, edad, salario);
        System.out.println(mensaje);

        //Metodo printf

        System.out.printf("Nombre : %s, Edad : %d, Salario : %f", nombre,edad,salario);

        //Formateo con text block

        mensaje = """
                %nDetalle Persona:
                """;

    }
}
