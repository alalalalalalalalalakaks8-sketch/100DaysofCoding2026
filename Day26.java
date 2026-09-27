import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Input Angka 1 : ");
        int A = in.nextInt();

        System.out.printf("Input Angka 2 : ");
        int B = in.nextInt();

        int C = A;
        A=B;
        B=C;

        System.out.println("Output : " + A);
        System.out.println("Output : " + B);
    }
}
