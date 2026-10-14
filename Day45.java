import java.util.Scanner;
public class App{
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("WR RRQ: ");
       int a = in.nextInt();

        switch (a) {
            case 90:
            System.out.println("Play Off");
                break;
            case 50:
            System.out.println("Mintol Tim Lolos Play Off");
                break;
            default:
                System.out.println("GAGAL Play Off");
                break;
        }
    }
}
