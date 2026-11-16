import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap: ");
        String a = in.nextLine();

        a = a.trim();

        int i = a.indexOf(" ");
        String d = a.substring(0, i);

        String b = a.replace(d, "Yanto");

        System.out.println("Nama bersih: " + a);
        System.out.println("Nama depan: " + d);
        System.out.println("Nama baru: " + b);

    }
}
