import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // for tanpa isi = loop terus
        for (;;) {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Login");
            System.out.println("2. Kalkulator");
            System.out.println("3. Menu Makanan");
            System.out.println("4. Keluar");
            System.out.print("Pilih : ");
            int pilih = in.nextInt();

            if (pilih == 1) {
                System.out.print("Username : ");
                String user = in.next();
                System.out.print("Password : ");
                int pass = in.nextInt();
                if (user.equalsIgnoreCase("D0226513") && pass == 20072208) {
                    System.out.println("Berhasil login");
                } else {
                    System.out.println("Username / Password salah");
                }

            } else if (pilih == 2) {
                System.out.print("Bil 1 : ");
                int a = in.nextInt();
                System.out.print("Bil 2 : ");
                int b = in.nextInt();
                System.out.print("Operator (+ - * /) : ");
                String op = in.next();
                if (op.equals("+")) System.out.println("Hasil : " + (a+b));
                else if (op.equals("-")) System.out.println("Hasil : " + (a-b));
                else if (op.equals("*")) System.out.println("Hasil : " + (a*b));
                else System.out.println("Hasil : " + (a/b));

            } else if (pilih == 3) {
                int hargaMakan = 0, hargaMinum = 0;
                System.out.print("Pilih makan (1-4) : ");
                int m = in.nextInt();
                int[] daftarMakan = {0, 15000, 20000, 12000, 15000};
                if (m >= 1 && m <= 4) hargaMakan = daftarMakan[m];

                System.out.print("Pilih minum (1-3) : ");
                int mn = in.nextInt();
                int[] daftarMinum = {0, 10000, 10000, 5000};
                if (mn >= 1 && mn <= 3) hargaMinum = daftarMinum[mn];

                System.out.println("Total : Rp " + (hargaMakan + hargaMinum));

            } else if (pilih == 4) {
                System.out.println("Out - Selesai");
                break;

            } else {
                System.out.println("Nomor Invalid");
            }
        }
    }
}
