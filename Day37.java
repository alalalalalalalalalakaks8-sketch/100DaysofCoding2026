import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Bilangan : ");
        int tugas = in.nextInt();

        if (tugas > 0) {
            System.out.println("Positif");
        }else if (tugas < 0) {
            System.out.println("Negatif");
        }else {
            System.out.println("NOL");
         }
    }   
}
