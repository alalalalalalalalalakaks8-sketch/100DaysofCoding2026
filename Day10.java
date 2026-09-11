public class App{
    public static void main(String[] args) {
        System.out.println("=== BATAS TIPE DATA PRIMITIF JAVA ===");

        // INTEGER
        System.out.println("byte  : " + Byte.MIN_VALUE + " sampai " + Byte.MAX_VALUE);
        System.out.println("short : " + Short.MIN_VALUE + " sampai " + Short.MAX_VALUE);
        System.out.println("int : " + Integer.MIN_VALUE + " sampai " + Integer.MAX_VALUE);
        System.out.println("long  : " + Long.MIN_VALUE + " sampai " + Long.MAX_VALUE);

        // DESIMAL
        System.out.println("float : " + Float.MIN_VALUE + " sampai " + Float.MAX_VALUE);
        System.out.println("double  : " + Double.MIN_VALUE + " sampai " + Double.MAX_VALUE);

        // KARAKTER & BOOLEAN
        System.out.println("char  : " + (int) Character.MIN_VALUE + " sampai " + (int) Character.MAX_VALUE);
        System.out.println("boolean : true atau false");
    }
}
