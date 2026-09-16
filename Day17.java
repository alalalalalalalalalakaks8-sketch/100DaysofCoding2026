import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Gajian = ");
        int nilai = in.nextInt();
        
        System.out.printf("Nilai awal\t: %d\n", nilai);
  
        System.out.print("\nTHR (+=) = ");
        int tambah = in.nextInt();
        nilai += tambah;
        System.out.printf("Setelah += %d\t: %d\n", tambah, nilai);
   
        System.out.print("\nTop up EPEP (-=) = ");
        int kurang = in.nextInt();
        nilai -= kurang; 
        System.out.printf("Setelah -= %d\t: %d\n", kurang, nilai);
        
        System.out.print("\nJual akun (*=) = ");
        int kali = in.nextInt();
        nilai *= kali;
        System.out.printf("Setelah *= %d\t: %d\n", kali, nilai);
        
        System.out.print("\nBeli makan sehari (/=) = ");
        int bagi = in.nextInt();
        nilai /= bagi;
        System.out.printf("Setelah /= %d\t: %d\n", bagi, nilai);
        
        System.out.print("\nTop up EPEP lagi (%=) = ");
        int mod = in.nextInt();
        nilai %= mod;
        System.out.printf("Setelah %%= %d\t: %d\n", mod, nilai);
    }
}
