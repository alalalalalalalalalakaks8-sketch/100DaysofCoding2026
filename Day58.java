import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan N: ");
        int N = in.nextInt();
        System.out.print("Masukkan M: ");
        int M = in.nextInt();

        System.out.print("Kelipatan " + M + ": ");
        for(int i=1; i<=N; i++){
            if(i % M == 0){
                System.out.print(i + " ");
            }
        }
    }
}
