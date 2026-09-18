import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Nilai kecil : ");
        int A = in.nextInt();
        double B = A;

        System.out.print("Nilai kecil : ");
        int C = in.nextInt();
        float D = C;

        System.out.println("Nilai kecil : " +A + "\nNilai besar : " +B);        
        System.out.println("Nilai kecil : " +C + "\nNilai besar : " +D);        
    }
}
