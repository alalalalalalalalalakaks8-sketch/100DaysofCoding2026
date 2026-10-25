import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();

        if (a % 1 != 0 && a > 0) {
            System.out.println("Pecahan");
            System.out.println("Positif");
        } else if (a % 1 != 0 && a < 0) {
            System.out.println("Pecahan");
            System.out.println("Negatif");
        } else if (a % 2 == 0 && a > 0) {
            System.out.println("Bulat Genap");
            System.out.println("Positif");
            System.out.println("Natural/Cacah");
        } else if (a % 2 == 0 && a < 0) {
            System.out.println("Bulat Genap");
            System.out.println("Negatif");
            System.out.println("Natural/Cacah");
        } else if (a % 2 != 0 && a > 0) {
            System.out.println("Bulat Ganjil");
            System.out.println("Positif");
            System.out.println("Natural/Cacah");
        } else if (a % 2 != 0 && a < 0) {
            System.out.println("Bulat Ganjil");
            System.out.println("Negatif");
            System.out.println("Natural/Cacah");
        } else {
            System.out.println("Bulat Genap");
            System.out.println("Natural/Cacah");
        }
    }
}
