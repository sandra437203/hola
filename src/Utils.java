

import java.util.Scanner;

public class Utils {
    static Scanner sc = new Scanner(System.in);

    public static int validaInt(String input) {
        System.out.print(input);
        while (!sc.hasNextInt()) {
            System.out.println("Introduce un entero válido");
            sc.next();
        }
        return sc.nextInt();
    }

    public static double validaDouble(String input) {
        System.out.print(input);
        while (!sc.hasNextDouble()) {
            System.out.println("Introduce un entero válido");
            sc.next();
        }
        return sc.nextDouble();
    }

    public static String validaString(String input) {
        System.out.print(input);
        while (!sc.hasNextLine()) {
            System.out.println("Introduce un entero válido");
            sc.next();
        }
        return sc.nextLine();
    }
}