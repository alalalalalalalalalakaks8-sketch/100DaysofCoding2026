import java.util.Scanner;
public class App{
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Jenis kelamin : ");
       String b = in.nextLine();
       System.out.print("Umur : ");
       int a = in.nextInt();
       System.out.print("Ipk : ");
       double e = in.nextDouble();

       String q = b.equalsIgnoreCase("L") ? "Laki laki" : "Perempuan";
       System.out.println(q);
       
       System.out.println("Status : " + ( a >= 17? "Boleh keliling dunia" : "Tidak Boleh"));

       String r =(e >= 3.0? "Lulus" : "Tidak lulus");
       System.out.printf("IPK : %.1f - %s\n", e,r);
    }
}
