package POO;

public class Persona {

    String nombre;
    int edad;


    void mostrarPersona (){

        System.out.println("Nombre : "+nombre);
        System.out.println("Edad : "+edad);

    }

    public static void main(String[] args) {
        System.out.println("Creacion de la clase persona");
            var persona = new Persona();
            persona.nombre = "Layla";
            persona.edad = 19;
            persona.mostrarPersona();
            // Segund objeto
            var personaDos = new Persona();
            personaDos.nombre = "Ian";
            personaDos.edad = 20;
            personaDos.mostrarPersona();
    }
}
