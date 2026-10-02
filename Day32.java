import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Nilai: ");
        int nilai = in.nextInt();
        System.out.print("Absen: ");
        int absen = in.nextInt();

        if (nilai < 70) {
            System.out.println("MERAH - Remedial");
        } else {
            System.out.println("Tidak Merah - Aman");
        }

        if (nilai > 90 && absen > 80) {
            System.out.println("GRADE A - KUNING");
        } else if (nilai > 70 && absen > 80) {
            System.out.println("GRADE B - HIJAU LULUS");
        } else if (nilai > 70 || absen > 80) {
            System.out.println("GRADE C - LULUS BERSYARAT");
        } else {
            System.out.println("GRADE D - TIDAK LULUS MERAH");
        }

        System.out.print("tugas: ");
        int tugas = in.nextInt();
        
        if ((nilai > 85 && absen > 85) || tugas > 10) {
            System.out.println("DAPAT BEASISWA");
        } else {
            System.out.println("BELUM DAPAT BEASISWA");
        }
    }
}
