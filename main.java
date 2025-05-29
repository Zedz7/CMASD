import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do { 
            System.out.println("--- Menu SPBU ---");
            System.out.println("1. Tambah Antrian Kendaraaan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek Jumlah Antrian");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch(pilihan) {
                case 1 -> {
                    System.out.print("Masukkan Plat Nomor           : ");
                    String plat = sc.nextLine();
                    System.out.println("Masukkan Jenis Kendaraan    : ");
                    String jenis = sc.nextLine();
                    System.out.println("Masukkan Merk Kendaraan     : ");
                    String merk  = sc.nextLine();
                }
                case 2 -> {

                }
                case 3 -> {

                }
                case 4 -> {

                }
                case 5 -> {
                    
                }
                case 0 -> System.out.println("Terima kasih!");
                default -> System.out.println("Menu tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 0);
    }
}