import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Bilangan : ");
        int a= in.nextInt();
        System.out.print("Bilangan : ");
        int b= in.nextInt();
        System.out.print("Pilih : ");
        char s = in.next().charAt(0);

        if (s == '+') {
            System.out.println(a + b);
        } else if (s == '-') {
            System.out.println(a - b);
        } else if (s == '*') {
            System.out.println(a * b);
        } else if (s == '/') {
            System.out.println(a / b);
         }
    }   
}
