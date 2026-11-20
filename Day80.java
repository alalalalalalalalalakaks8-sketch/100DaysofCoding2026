import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] a = {"Apel", "Mangga", "Jeruk", "Pisang", "Anggur"};

        System.out.println("Daftar buah:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " = " + a[i]);
        }

        System.out.print("\nMau lihat indeks ke-berapa? ");
        int b = in.nextInt();

        if (b >= 0 && b < a.length) {
            System.out.println("Buah yang kamu pilih: " + a[b]);
        } else {
            System.out.println("Indeks tidak ada! Pilih 0 sampai 4");
        }
    }
}
