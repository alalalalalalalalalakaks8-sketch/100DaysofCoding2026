import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = 0;

        int a = in.nextInt();

        while (a >= 0) {
            t = t + a;
            System.out.print("Negatif Berhenti: ");
            a = in.nextInt();
        }

        System.out.println("Total : " + t);
    }
}
