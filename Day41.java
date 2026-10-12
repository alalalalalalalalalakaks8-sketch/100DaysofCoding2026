import java.util.Scanner;
public class App{
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Masukkan Bilangan : ");
       int a = in.nextInt();

       if( a <= 0 || a >= 50){
         System.out.println("Sensor Error!");
       } else if(a <= 18){
         System.out.println("Dingin");
       } else if(a <= 24){
         System.out.println("Sejuk / Ideal");
       } else if(a <= 30){
         System.out.println("Panas");
       } else {
         System.out.println("Sangat Panas");
       }
    }
}
