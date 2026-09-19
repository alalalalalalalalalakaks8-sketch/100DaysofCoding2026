import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner Op = new Scanner (System.in);

        System.out.printf("Nilai awal A = ");
        int A = Op.nextInt();

        System.out.printf("Nilai awal B = ");
        int B = Op.nextInt();

        int C = A;
        A = B ;
        B = C ;

        System.out.println("Nilai update A = " + A );
        System.out.println("Nilai update B = " + B );
    }
}
