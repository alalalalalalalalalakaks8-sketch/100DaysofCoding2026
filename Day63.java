import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan M: ");
        int M = in.nextInt();
        System.out.print("Masukkan N: ");
        int N = in.nextInt();

        int hasil = 1;
        for(int i=1; i<=N; i++){
            hasil *= M;
        }

        System.out.println(M + " ^ " + N + " = " + hasil);
    }
}
