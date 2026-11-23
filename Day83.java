import java.util.Scanner;
public class App {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Isi kolom : ");
    int b = in.nextInt();
    int [] a = new int[b];
    int j = 0;
    for(int i = 0; i < b; i++){
        System.out.print("Jumlah angka : ");
        a[i]=in.nextInt();
        j += a[i];
    }
    System.out.println("Hasil : "+j);
}
}
