import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] a = new String[2];

        a[0]=in.nextLine();
        a[1]=in.nextLine();
        System.out.println("Perkenalkan nama saya " + a[0] + " Prodi " + a[1]);
    }
}
