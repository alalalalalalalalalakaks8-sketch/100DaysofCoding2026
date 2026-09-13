import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Nama  : ");
        String nama = in.nextLine(); 

        System.out.printf("Tempat lahir : ");
        String tempatLahir = in.nextLine();

        System.out.printf("Umur  : ");
        int umur = in.nextInt();

        System.out.printf("Berat badan  : ");
        double BB = in.nextDouble();

        System.out.printf("Tinggi: ");
        double tinggi = in.nextDouble();

        System.out.printf("Gender: ");
        char L = in.next().charAt(0);

        System.out.printf("Semester : ");
        int S = in.nextInt();

        System.out.printf("IPK  : ");
        double IPK = in.nextDouble();

        System.out.printf("Status mahasiswa : ");
        String T = in.next();

        System.out.print("\n== DATA DIRI SAYA==");
        System.out.println("\nNama saya\t : "   +nama);
        System.out.println("Lahir di\t : "   +tempatLahir);
        System.out.println("Umur saya\t : "   +umur +   "Tahun");
        System.out.println("Berat badan\t : "   +BB +   "Kg");
        System.out.println("Tinggi saya\t : " +tinggi + "Cm");
        System.out.println("Gender saya\t : "   +L);
        System.out.println("Semester\t : "   +S);
        System.out.println("IPK saya\t : "   +IPK);
        System.out.println("Status mahasiswa : "  +T);
    }
}
