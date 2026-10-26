import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1.MPL");
        System.out.println("2.MSeries");
        System.out.println("3.Play Off");
        System.out.println("4.Kembali");
        System.out.println("5.keluar");
        System.out.print("RRQ AKAN DAPAT : ");
        while (true) {

        int a = in.nextInt();
       
            
            switch (a) {
                case 1:
                    System.out.println("Mimpi");
                    break;
                case 2:
                    System.out.println("Mustahil");
                    break;
                case 3:
                    System.out.println("Bisa saja");
                    break;
                case 4:
                    System.out.println("Kembali");
                    continue ;
                case 5:
                    System.out.println("Keluar");
                    return ;
                default:
                    System.out.println("Nomor Invalid");
                    continue;
            }
        }
    }
}
