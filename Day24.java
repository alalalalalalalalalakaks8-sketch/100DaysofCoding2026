import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner Op = new Scanner (System.in);

        System.out.printf("Panjang = ");
        int A = Op.nextInt();

        System.out.printf("Lebar = ");
        int B = Op.nextInt();

        int C = A * B ;

        System.out.println("Luas Persegi = " + C );
    }
}
