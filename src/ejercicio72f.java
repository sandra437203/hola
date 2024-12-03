public class ejercicio72f {
    public static void main(String[] args){
        persona a1 = new persona("12345678l","alba","sanchez", 12);
        persona a2 = new persona("87456123k","iker","lopex",70);


        System.out.println("es mayor de edad " + a1.esMayorEdad());
        System.out.println("es mayor de edad " + a2.esMayorEdad());
        System.out.println("es mayor de edad " + a1.esJUbilado());
        System.out.println("es mayor de edad " + a2.esJUbilado());

        System.out.println("la distancia entre las dos edades son " + a1.diferenciaEdad(a2));
    }

    }
