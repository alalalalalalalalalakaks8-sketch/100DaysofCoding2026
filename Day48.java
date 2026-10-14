import java.util.Scanner;
public class App{
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       System.out.print("Angka pertama: ");
       double a = in.nextDouble();

       System.out.print("Pilih(+, -, *, /): ");
       char q = in.next().charAt(0);

       System.out.print("Angka kedua: ");
       double b = in.nextDouble();

       switch(q){
           case '+':
               System.out.println("Hasil: " + (a + b));
               break;
           case '-':
               System.out.println("Hasil: " + (a - b));
               break;
           case '*':
               System.out.println("Hasil: " + (a * b));
               break;
           case '/':
               System.out.println("Hasil: " + (a / b));
               break;
           default:
               System.out.println("!!EROR!!");
               break;
       }
    }
}
