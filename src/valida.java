import java.util.Scanner;
public class valida {
   static Scanner sc = new Scanner(System.in);

   public int validaInt(String input ){
       System.out.println(input);
       while (!sc.hasNextInt()){
           System.err.println("No es un  nujmero");
           sc.next();
       }
       int resullt = sc.nextInt();
       sc.nextInt();
       return resullt;
   }
}
