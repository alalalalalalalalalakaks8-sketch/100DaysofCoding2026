import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        int a = in.nextInt();

        for(int i = 1; i <= b; i++){
            for(int j = 1; j <= a; j++){
                if((i + j) % 2 == 0){
                    System.out.print("# ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
}
