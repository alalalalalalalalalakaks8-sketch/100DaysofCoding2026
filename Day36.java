import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Bilangan : ");
        int tugas = in.nextInt();

        if (tugas % 2 == 0) {
            System.out.println("Genap");
        }else {
            System.out.println("Ganjil");
         }
    }   
}
