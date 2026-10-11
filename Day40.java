import java.util.Scanner;
public class App{
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("MASUKKAN BILANGAN : ");
       int a = in.nextInt();
       
       if (a > 0 / 2 ) {
       System.out.println("Bilangan Positif - genap");
       }else if (a < 0 / 2 ) {
        System.out.println("Bilangan Negatif - ganjil");
       }else{
        System.out.println("Nol");
       }
       }
    }
