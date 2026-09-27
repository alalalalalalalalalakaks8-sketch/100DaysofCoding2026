import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int angka = in.nextInt(); // langsung int

        System.out.println("\nAngka awal : " + angka);
        
        System.out.println("angka++\t       : " + angka++);
        System.out.println("Nilai sekarang : " + angka);

        System.out.println("++angka\t       : " + ++angka);
        System.out.println("Nilai sekarang : " + angka);

        System.out.println("angka--\t       : " + angka--);
        System.out.println("Nilai sekarang : " + angka);

        System.out.println("--angka\t       : " + --angka);
        System.out.println("Nilai akhir    : " + angka);
    }
}
