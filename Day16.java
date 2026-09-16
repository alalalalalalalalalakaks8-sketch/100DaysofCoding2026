import java.util.Scanner;
public class App {
public static void main(String[] args) {
  Scanner in = new Scanner (System.in);

int angka1 = in.nextInt();
int angka2 = in.nextInt();

int A = angka1 / angka2;
int B = angka1 % angka2;

System.out.println("Hasil : "+ A);
System.out.println("Hasil : "+ B);
  }
}
