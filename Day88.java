import java.util.Scanner;
public class App {
    static void a(int[] b, Scanner in) {
        System.out.print("Ubah indeks ke berapa? ");
        int c = in.nextInt();
        System.out.print("Jadi berapa? ");
        int d = in.nextInt();
        b[c] = d;
    }
    static void b(int[] c) {
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = {10, 20, 30};

        System.out.print("Awal: ");
        b(a);

        a(a, in);

        System.out.print("Hasil: ");
        b(a);
    }
}
