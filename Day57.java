import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan N: ");
        int N = in.nextInt();

        System.out.print("Ganjil: ");
        for(int i=1; i<=N; i++){
            if(i % 2 == 1) System.out.print(i + " ");
        }

        System.out.print("\nGenap: ");
        for(int i=1; i<=N; i++){
            if(i % 2 == 0) System.out.print(i + " ");
        }
    }
}
