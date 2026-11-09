import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i == 1) {
                System.out.println("*");
            } else if (i == N) {
                for (int j = 1; j <= N; j++) {
                    System.out.print("*");
                    if (j < N) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            } else {
                System.out.print("*");
                for (int k = 1; k <= 2 * i - 3; k++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }

    }
}
