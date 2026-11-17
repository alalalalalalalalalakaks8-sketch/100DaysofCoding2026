import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan komentar: ");
        String komentar = in.nextLine();

        if (komentar.contains("baik")) {
            komentar = komentar.replace("baik", "***");
        }
        if (komentar.contains("Anak hebat")) {
            komentar = komentar.replace("Anak hebat", "***");
        }

        System.out.println("Komentar: " + komentar);
    }
}
