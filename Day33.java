import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Tugas : ");
        int tugas = in.nextInt();
        System.out.print("Uts : ");
        int uts = in.nextInt();

        if (tugas > 85 && uts > 90) {
            System.out.println("A+");
        }else {
            System.out.println("D-");
         }
    }   
}
