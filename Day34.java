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
        }else if (tugas > 80 && uts > 88) {
            System.out.println("A");
        }else if (tugas > 78 || uts > 82) {
            System.out.println("B");
        }else if (tugas > 72 || uts > 76) {
            System.out.println("C");
        }else if (tugas > 65 && uts > 68) {
            System.out.println("D");
        }else {
            System.out.println("DROP OUT");
         }
    }   
}
