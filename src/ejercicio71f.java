public class ejercicio71f {
    public static void main(String[] args){
        punto a1 = new punto(7,-5);
        punto a2 = new punto(-2, -1);
        a1.setXY(7, -5);
        a1.desplaza(2,5);
        int distancia = a1.distancia(a2);
        System.out.println("Distancia entre p1 y p2: " + distancia);
    }

}
