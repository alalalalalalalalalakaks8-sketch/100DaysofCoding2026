import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan N: ");
        int N = in.nextInt();

        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                System.out.print((i*j) + "\t");
            }
            System.out.println();
        }
    }
}
