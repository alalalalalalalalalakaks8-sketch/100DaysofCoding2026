import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            
        System.out.println("\n===========================");
        System.out.println("\t==Menu==");
        System.out.println("\t1.Login");
        System.out.println("\t2.kalkulator");
        System.out.println("\t3.Menu Makanan");
        System.out.println("\t4.Kembali");
        System.out.println("===========================");
        System.out.print("\nSilahkan pilih : ");
        char n = in.next().charAt(0);
        
        switch (n) {
            case '1':
                System.out.println("Menu login");
                System.out.print("Masukkan Username : ");
                String a = in.next();
                System.out.print("Masukkan Password : ");
                int b = in.nextInt();
        
                if (a.equalsIgnoreCase("D0226513")) {
                    if (b == 20072208) {
                        System.out.println("Anda berhasil login");
                        System.out.println("Silahkan Masuk");
                    }else{
                        System.out.println("Password atau sandi anda salah");
                        System.out.println("Silahkan Lupa password");
                    }
                }else{
                    System.out.println("Username salah");
                }
                        System.out.println("==Kembali==");
                        char v = in.next().charAt(0);
                break ;

                case '2':
                    System.out.println("Menu Kalkulator");
                    System.out.print("Masukkan Bilangan 1 : ");
                    int u = in.nextInt();
                    System.out.print("Masukkan Aritmatika : ");
                    char o = in.next().charAt(0); 
                    System.out.print("Masukkan Bilangan 2 : ");
                    int t = in.nextInt();
                    if (o == '+') {
                        System.out.println("Hasil : "+ (u + t));
                    }else if (o == '-') {
                        System.out.println("Hasil : " + (u - t));
                    }else if (o == '*') {
                        System.out.println("Hasil : " + (u * t));
                    }System.out.println("Hasil : " + (u / t));

                        System.out.println("==Kembali==");
                        char s = in.next().charAt(0);
                    break ;

                    case '3':
  
                int hargaMakan = 0;
                int hargaMinum = 0;

                        //System.out.println("\nMenu Makanan");
                        System.out.println("\n==Menu Makanan==");
                        System.out.println("1.Mie Ayam");
                        System.out.println("2.Martabak Telur");
                        System.out.println("3.Nasgor");
                        System.out.println("4.Bakso Beranak");
                        char p = in.next().charAt(0);

                        if (p == '1') {
                            System.out.println("Mie Ayam : Rp 15.000");
                            hargaMakan = 15000;
                        }else if (p == '2') {
                            System.out.println("Martabak Telur : Rp 20.000");
                            hargaMakan = 20000;
                        }else if (p == '3') {
                            System.out.println("Nasgor : Rp 12.000");
                            hargaMakan = 12000;
                        }else if (p == '4') {
                            System.out.println("Bakso Beranak : Rp 15.000");
                            hargaMakan = 15000;
                        }
                            System.out.println("\n==Minum Minum");
                            System.out.println("1.Machta");
                            System.out.println("2.Kopi");
                            System.out.println("3.Es teh");
                            char w = in.next().charAt(0);
                        if (w == '1') {
                            System.out.println("Machta : Rp 10.000");
                            hargaMinum = 10000;
                        }else if (w == '2') {
                            System.out.println("Kopi : Rp 10.000");
                            hargaMinum = 10000;
                        }else if (w == '3') {
                            System.out.println("Es Teh : Rp 5.000");
                            hargaMinum = 5000;
                        }
                        double m = hargaMakan + hargaMinum; 
                        System.out.printf("Total : Rp %.2f ", m);

                        System.out.println("\n==Kembali==");
                        char h = in.next().charAt(0);
                        break ;

                default:
                    System.out.println("Nomor Invalid");
                    return ;
            }
        }
    }
}
