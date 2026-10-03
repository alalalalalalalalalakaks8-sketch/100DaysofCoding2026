import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nilai: ");
        int nilai = in.nextInt();

        if (nilai >= 0 && nilai <= 100) {

        if (nilai < 70) { 
                System.out.println("D");
            } else {

        if (nilai <= 80) { 
        System.out.println("C");
            } else {

        if (nilai <= 90) { 
        System.out.println("B");
            } else {
        System.out.println("A");
                   
                    }
                }
            }
        }
    }
}
