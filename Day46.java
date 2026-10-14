import java.util.Scanner;
public class App{
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);   
       System.out.println("==Menu==");    
       System.out.println("1.Nasgor");
       System.out.println("2.Seblak");
       System.out.println("3.Mie ayam");
       System.out.print("Pilih Menu: ");
       int a = in.nextInt();


        switch (a) {
            case 1:
            System.out.println("Nasgor");
            System.out.println("Harga : Rp15.000");
                break;
            case 2:
            System.out.println("Seblak");
            System.out.println("Harga : 'Tergantung Lauk'");
                break;
            case 3:
            System.out.println("Mie ayam");
            System.out.println("Harga : 10.000 - 20.000");
                break;
            default:
                System.out.println("!!Jangan cari yang tidak ada!!");
                break;
        }
    }
}
