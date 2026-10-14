import java.util.Scanner;
public class App{
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       System.out.print("Masukkan bilangan : ");
       int a = in.nextInt();

       System.out.println("Bilangan : " + (a % 2 == 0? "Genap" : "Ganjil"));
    }
}
