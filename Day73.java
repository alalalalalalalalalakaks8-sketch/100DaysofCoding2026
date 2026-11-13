import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p;

        do {
            System.out.println("1. Hai");
            System.out.println("2. Keluar");
            System.out.print("Pilih: ");
            p = in.nextInt();

            if (p == 1) {
                System.out.println("Hai");
            } else if (p == 2) {
                System.out.println("Sampai jumpa!");
            } else {
                System.out.println("Pilihan salah!");
            }

            System.out.println();
        } while (p != 2);
    }
}
