import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        int[] a = new int[b];

        for (int i = 0; i < b; i++) {
            a[i] = in.nextInt();
        }

        int j = a[0];
        for (int i = 0; i < b; i++) {
            if (a[i] < j) {
                j = a[i];
            }
        }

        System.out.println(j);
    }
}
