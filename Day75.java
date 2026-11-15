import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Username: ");
        String u = in.nextLine();

        System.out.print("Password: ");
        String p = in.nextLine();

        if (u.isEmpty() || p.isEmpty()) {
            System.out.println("Tidak boleh kosong!");
        } else if (u.equalsIgnoreCase("admin") && p.equals("12345")) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Login gagal!");
        }
    }
}
