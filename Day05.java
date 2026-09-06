public class main {
    public static void main(String[] args) {
        
        //float harus menggunakan huruf f
        float tinggibadan = 185.0f;
        
        //double tidak menggunakan apa" sama sekali
        double beratbadan = 65.0;
        
        //% itu digunakan untuk tanda format pada text yang mau dimunculkan
        //.0 untuk menentukan jumlah angka pada pada belakang koma 
        //f digunakan untuk format khusus type coding desimal seperti float atau double
        System.out.printf("Tinggi badan saya :%.0f cm\n",tinggibadan);
        System.out.printf("berat badan saya :%.0f kg", beratbadan);
    }
}
