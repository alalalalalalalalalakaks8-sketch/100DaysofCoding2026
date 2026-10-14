import java.util.Scanner;
public class App{
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Nilai UTS: ");
       int a = in.nextInt();

       if(a >= 90){
           System.out.println("A");
       } else if(a >= 80 && a <= 90){
           System.out.println("B");
       } else if(a >= 75 && a <= 80){
           System.out.println("C");
       } else {
           System.out.println("D");
       }
    }
}
