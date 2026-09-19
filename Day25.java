import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner Op = new Scanner (System.in);

        System.out.printf("Jari jari = ");
        double A = Op.nextDouble();

        double C = Math.PI * A * A;

        System.out.printf("Luas Persegi = %.2f\n" , C );
    }
}
