import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] a = {5, 8, 12, 20};
        System.out.print("Mau tambah angka berapa? ");
        int b = in.nextInt();

        int[] c = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        c[a.length] = b;

        System.out.print("Hasil: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
