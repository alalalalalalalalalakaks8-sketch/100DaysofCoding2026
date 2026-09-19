import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner Op = new Scanner (System.in);

        System.out.printf("Sisi = ");
        int A = Op.nextInt();

        System.out.printf("Sisi = ");
        int B = Op.nextInt();

        int C = A * B ;

        System.out.println("Luas Persegi = " + C );
    }
}
