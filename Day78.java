import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== BUAT AKUN ===");
        System.out.print("Buat username: ");
        String u = in.nextLine().trim();

        System.out.print("Buat password: ");
        String p = in.nextLine().trim();

        System.out.println("Akun berhasil dibuat! Silakan login.\n");


        while (true) {
            System.out.println("=== LOGIN ===");
            System.out.print("Username: ");
            String L = in.nextLine().trim();

            System.out.print("Password: ");
            String i = in.nextLine().trim();

            if (L.equals(u) && i.equals(p)) {
                System.out.println("Login berhasil! Selamat datang, " + L);
                break;
            } else {
                System.out.println("Username atau password salah! Coba lagi.\n");
            }
        }
    }
}
