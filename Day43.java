import java.util.Scanner;
public class App{
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Masukkan angka: ");
       int a = in.nextInt();

       if(a % 3 == 0 && a % 5 == 0){
           System.out.println("Kelipatan ==A Dan B==");
       } else if(a % 3 == 0){
           System.out.println("Kelipatan ==A== ");
       } else if(a % 5 == 0){
           System.out.println("Kelipatan ==B== ");
       } else {
           System.out.println("!!==EROR==!!");
       }
    }
}
