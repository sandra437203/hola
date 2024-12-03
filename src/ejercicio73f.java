public class ejercicio73f {
    public static void main(String[] args){
        articulo art1 = new articulo("Lápiz", (int)50, 50);

        System.out.println(art1.imprimir());
        System.out.println("PVP (con IVA): " + art1.getPVP() + " €");
        System.out.println("Intentando vender 30 unidades:");
        art1.vender(30);
        System.out.println("Información después de la venta:");
        art1.imprimir();
        System.out.println("Intentando almacenar 40 unidades:");
        art1.almacenar(40);
        System.out.println("Información después de almacenar:");
        art1.imprimir();
    }


    }
