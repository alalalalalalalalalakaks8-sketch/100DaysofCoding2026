import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nama anda: " );
        String Nama = in.nextLine();
        System.out.println("Nama saya adalah\t" + Nama);

        System.out.print("Umur saya: " );
        int umur = in.nextInt();
        System.out.println("Umuru saya" + umur);

        System.out.print("Bintang saya: "   );
        byte bintang = in.nextByte();
        System.out.println("Bintang" + bintang);

        System.out.print("Indonesia merdeka   "   );
        long a = in.nextLong();
        System.out.println("Indonesia merdeka" + a);

        System.out.print("Rank ml   "  );
        char tes = in.next().charAt(0);
        System.out.println("Rank ml" + tes);

        System.out.print("Tahun berapap sekarang    "   );
        float pe = in.nextFloat();
        System.out.println("Tahun berapa sekarang" + pe);

        System.out.println("Angkatan    "   );
        double hai = in.nextDouble();
        System.out.println("Angkatan" + hai);

        System.out.print("Apakah saya pencuri   "   );
        boolean ti = in.nextBoolean();
        System.out.println("Apakah saya pencuri" + ti);

        System.out.print("Tahun lahir   "  );
        short hu = in.nextShort();
        System.out.println("Tahun lahir" + hu);

    }
}
