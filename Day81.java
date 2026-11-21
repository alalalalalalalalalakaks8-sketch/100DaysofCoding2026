import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int b = in.nextInt();
        in.nextLine();

        String[] a = new String[b];

        for (int i = 0; i < b; i++) {
            a[i] = in.nextLine();
        }
        for (int i = 0; i < b; i++) {
            System.out.println(a[i]);
        }
    }
}
