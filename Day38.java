import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("===== MENU =====");
        System.out.println("1. Cek Ganjil / Genap");
        System.out.println("2. Cek Positif / Negatif / Nol");
        System.out.println("3. Keluar");
        System.out.print("Pilih menu : ");
        int pilihan = in.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukkan bilangan: ");
            int b = in.nextInt();
            if (b % 2 == 0) {
                System.out.println("GENAP");
            } else {
                System.out.println("GANJIL");
            }

        } else if (pilihan == 2) {
            System.out.print("Masukkan bilangan: ");
            int a = in.nextInt();
            if (a > 0) {
                System.out.println("POSITIF");
            } else if (a < 0) {
                System.out.println("NEGATIF");
            } else {
                System.out.println("NOL");
            }

        } else if (pilihan == 3) {
            System.out.println("Selesaimi,keluar sana");

        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }
}
