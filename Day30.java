import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Angka pertama : ");
        int a = in.nextInt();

        System.out.print("Angka kedua : ");
        int b = in.nextInt();

        System.out.println(a + " <= " + b + " = " + (a <= b));
        System.out.println(a + " >= " + b + " = " + (a >= b));
    }
}
