import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] a = {"Favian", "Kiky", "Nnael", "irrad"};

        System.out.print("Top nama jung jago: ");
        String b = in.nextLine();

        boolean c = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i].equalsIgnoreCase(b)) {
                System.out.println("Ketemu di indeks ke-" + i);
                c = true;
                break;
            }
        }

        if (!c) {
            System.out.println("Nama tidak ada");
        }
    }
}
