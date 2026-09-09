public class App {
    public static void main(String[] args) {
        
        // 1. DEKLARASI
       int Rank;
          String status;
       String Nama;
        
 System.out.println("\nnilai awal");
        // 2. INISIALISASI
      Rank = 15;
        status = "all role";
      Nama = "Muh rizky rahmat darwis";
        
        System.out.println("Skor awal: " + Rank);
         System.out.println("Status awal: " + status);
           System.out.println("Status awal: " + Nama);

 System.out.println("\nnilai update");
       // 3. UPDATE
      Rank = 15+35;
        status = "jungler";
      Nama = "Muh rizky darwis";

        System.out.println("Skor akhir: " + Rank);
         System.out.println("Status akhir: " + status+35);
           System.out.println("Status akhir: " + Nama);
    }
}
