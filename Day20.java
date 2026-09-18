import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Nilai Int : ");
        int A = in.nextInt();
        String B = String.valueOf(A);

        System.out.println("Nilai Int : " +A + "\nNilai String : " + '\"' + B + '\"');   
    }
}
