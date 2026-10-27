import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan N: ");
        int N = in.nextInt();

        for(int i=1; i<=N; i++){
            System.out.print(i + " ");
        }
        for(int i=N-1; i>=1; i--){
            System.out.print(i + " ");
        }
    }
}
