import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Nama  : ");
        String nama = input.nextLine(); 

        System.out.printf("Umur  : ");
        int umur = input.nextInt();

        System.out.printf("Tinggi: ");
        double tinggi = input.nextDouble();

        System.out.printf("Gender: ");
        char L = input.next().charAt(0);


        System.out.print("\n== DATA DIRI SAYA==");
        System.out.println("\nNama saya\t : "   +nama);
        System.out.println("Umur saya\t : "   +umur);
        System.out.println("Tinggi saya\t : " +tinggi);
        System.out.println("Gender saya\t : "   +L);
    }
}
