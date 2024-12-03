import java.util.Arrays;

import java.util.Scanner;

public class pruEBA {
    static Scanner sc;
    static persona[] personas;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        personas = new persona[Utils.validaInt("¿Cuantos personas  va a tener nuestro programa?")];
            insertarPersona();
//        System.out.println(Arrays.toString(personas));
        impirmirPersona();
        modificar();
    }

    private static void insertarPersona() {

        for (int i = 0; i < personas.length; i++) {
            Utils.sc.nextLine();
            String dni = Utils.validaString("Introduce el DNI: ");
            String nombre = Utils.validaString("Introduce el nombre: ");
            String apellidos = Utils.validaString("Introduce los apellidos: ");
            int edad = Utils.validaInt("Introduce la edad: ");
            personas[i] = new persona(dni, nombre, apellidos, edad); // Almacena en el array
            System.out.println("Persona " + (i + 1) + " almacenada correctamente.");
            System.out.println("-----------------------------------");

        }

    }
    private static void impirmirPersona() {
        System.out.println("-------------Personas en el programa------------------");
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] != null) {
                System.out.println((i + 1) + ". Nombre: " + personas[i].getNombre() +
                        ", DNI: " + personas[i].getDni() +
                        ", Apellidos: " + personas[i].getApellidos() +
                        ", Edad: " + personas[i].getEdad());
            }
        }

    }
    private static void modificar() {

           int opcion = Utils.validaInt("Introduce el numero de la persona que quieres modificar");
        do {
//           System.out.println("Que quieres modiciar de " + personas[opcion - 1].getDni() + ", " + personas[opcion - 1].getNombre() + ", " + personas[opcion - 1].getApellidos() + ", " + personas[opcion - 1].getEdad() + ", ");

           System.out.println("""
                   1. Modificar Nombre
                   2.Modificar Apellidos
                   3. ModificarDNI
                   4.Modificar Edad
                   5.Eliminar la persona
                   6.inprimir personas
                   """);
           int option2 = Utils.validaInt("cual quieres  modificar");
           switch (option2) {
               case 1:
                   Utils.sc.nextLine();
                   String nuevoNombre = Utils.validaString("Introduce el nuevo nombre: ");
                   personas[opcion - 1].setNombre(nuevoNombre);
                   break;

               case 2:
                   Utils.sc.nextLine();
                   String nuevoApellidos = Utils.validaString("Introduce el nuevo Apllidos: ");
                   personas[opcion - 1].setApellidos(nuevoApellidos);
                   break;

               case 3:
                   Utils.sc.nextLine();
                   String nuevoDni = Utils.validaString("Introduce el nuevo DNI: ");
                   personas[opcion - 1].setDni(nuevoDni);
                   break;

               case 4:
                   Utils.sc.nextLine();
                   int nuevoEdad = Utils.validaInt("Introduce el nuevo edad: ");
                   personas[opcion - 1].setEdad(nuevoEdad);
                   break;
               case 5:
                   eliminarPersona(opcion);
                   break;
               case 6:
                   impirmirPersona();
                   break;

           }
       }while (opcion != 0);
    }
    private static void eliminarPersona(int opcion) {
        // Validar la posición ingresada
        if (opcion < 1 || opcion > personas.length) {
            System.out.println("Posición inválida. No se puede eliminar.");
            return;
        }

        // Desplazar elementos hacia la izquierda
        for (int i = opcion - 1; i < personas.length - 1; i++) {
            personas[i] = personas[i + 1];
        }

        // Establecer el último elemento como null
        personas[personas.length - 1] = null;

        System.out.println("Persona eliminada correctamente.");
    }

}
