import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        System.out.println("Nilai pertama: " + nilai[0]);
        System.out.println("Nilai kedua: " + nilai[1]);
        System.out.println("Nilai ketiga: " + nilai[2]);

    }
}
