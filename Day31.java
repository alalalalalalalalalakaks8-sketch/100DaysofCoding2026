import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("=== PROGRAM OPERATOR LOGIKA ===");
        System.out.print("Masukkan WIN RATE RRQ 0-100: ");
        int a = in.nextInt();
        
        System.out.print("Masukkan WIN RATE UNTUK PO 0-100: ");
        int b = in.nextInt();

        if (a > 70 && b > 80) {
            System.out.println("Status: DAPAT MPLI");
        } else {
            System.out.println("Status: TIDAK DAPAT MPLI");
        }

        if (a > 90 || b == 100) {
            System.out.println("Hadiah: DAPAT M SERIES");
        } else {
            System.out.println("Hadiah: TIDAK M SERIES");
        }

        boolean isT = false;
        
        if (!isT) {
            System.out.println("PLAY OFF: BISA ");
        } else {
            System.out.println("PLAY OFF: TIDAK");
        }

        System.out.print("\nKIINGDOM APA? : ");
        boolean R = in.nextBoolean();
        
        if (!R) {
            System.out.println("KINGDOM BAIK");
        } else {
            System.out.println("KINGDOM JAHAT");
        }

    }
}
