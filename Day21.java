import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Nilai String 1: ");
        String A = in.next();
         int B = Integer.parseInt(A);

        System.out.print("Nilai String 2: ");
        String C = in.next();
         double D = Double.parseDouble(C);

        System.out.print("Nilai String 3: ");
        String F = in.next();
         Float G = Float.parseFloat(F);

        System.out.println("Nilai String : " +A + "\tNilai Int : " + '\"' + B + '\"');   
        System.out.println("Nilai String : " +C + "\tNilai Double : " + '\"' + D + '\"');   
        System.out.println("Nilai String : " +F + "\tNilai Float : " + '\"' + G + '\"');   
    }
}
