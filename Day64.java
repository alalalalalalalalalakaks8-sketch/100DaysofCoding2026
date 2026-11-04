import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int N = in.nextInt();

        long faktorial = 1;
        for(int i=1; i<=N; i++){
            faktorial *= i;
        }

        System.out.println(N + "! = " + faktorial);
    }
}
