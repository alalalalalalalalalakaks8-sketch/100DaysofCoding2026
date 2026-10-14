import java.util.Scanner;
public class App{
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Kamu diajak joging teman kamu kapan kamu bisa?");
       System.out.print("Pilih hari: ");
       String a = in.nextLine();


        switch (a) {
            case "Senin":
            System.out.println("KAMPUS-KERJA");
                break;
            case "Minggu":
            System.out.println("Gaskan");
                break;
            default:
                System.out.println("Tidur");
                break;
        }
    }
}
