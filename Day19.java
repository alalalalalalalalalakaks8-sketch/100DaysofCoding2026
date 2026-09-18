import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Nilai Double : ");
        double A = in.nextDouble();
        int B = (int) A;

        System.out.print("Nilai FLoat : ");
        float C = in.nextFloat();
        int D = (int) C;

        System.out.println("Nilai Double : " +A + "\nNilai Int : " +B);        
        System.out.println("Nilai Float : " +C + "\nNilai Int : " +D);        
    }
}
