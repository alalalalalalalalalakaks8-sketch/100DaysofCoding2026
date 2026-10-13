import java.util.Scanner;
public class App{
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Masukkan gaji pokok: ");
       double gaji = in.nextDouble();

       if(gaji < 0){
           System.out.println("Gaji tidak valid!");
       } else if(gaji >= 10000000){
           double pajak = gaji * 15 / 100;
           double bersih = gaji - pajak;
           System.out.println("Kategori: Gaji Tinggi");
           System.out.printf("Pajak 15%%: Rp %,.0f\n" , pajak);
           System.out.printf("Gaji Bersih: Rp %,.0f\n" , bersih);
       } else if(gaji >= 5000000){
           double pajak = gaji * 10 / 100;
           double bersih = gaji - pajak;
           System.out.println("Kategori: Gaji Menengah");
           System.out.printf("Pajak 10%%: Rp %,.0f\n" , pajak);
           System.out.printf("Gaji Bersih: Rp %,.0f\n" , bersih);
       } else {
           double pajak = gaji * 5 / 100;
           double bersih = gaji - pajak;
           System.out.println("Kategori: Gaji Rendah");
           System.out.printf("Pajak 5%%: Rp %,.0f\n" , pajak);
           System.out.printf("Gaji Bersih: Rp %,.0f\n" , bersih);
       }
    }
}
