import java.util.Scanner;  
public class App {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

     System.out.printf("Nama :   ");
        String Nama = in.next();

        System.out.printf("Tinggi : ");
        double Tinggi = in.nextDouble();

        System.out.printf("Berat bada : ");
        int BB = in.nextInt();

        System.out.println("Status mahasiswa :  ");
        Boolean Statusmahasiswa = in.nextBoolean();

        System.out.println("Nim :   ");
        int NIM = in.nextInt();

        System.out.println("Nama saya           :   "   + Nama);
        System.out.println("Tinggi saya       :   "   + Tinggi + "  cm");
        System.out.println("Berat saya        :   "   + BB + "  kg");
        System.out.println("Status mahasiswa   :   "   + Statusmahasiswa);
        System.out.println("Nim :   " + "D0" + NIM);
}
}
