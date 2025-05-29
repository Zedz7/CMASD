import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        AntrianLinkedList antrian = new AntrianLinkedList();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do { 
            System.out.println("\n--- Menu SPBU ---");
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
                    System.out.print("Masukkan Plat Nomor         : ");
                    String plat = sc.nextLine();
                    System.out.print("Masukkan Jenis Kendaraan    : ");
                    String jenis = sc.nextLine();
                    System.out.print("Masukkan Merk Kendaraan     : ");
                    String merk  = sc.nextLine();
                    
                    Kendaraan kendaraan = new Kendaraan(plat, jenis, merk);
                    antrian.enqueue(kendaraan);
                    System.out.println(">> Kendaraan masuk ke dalam antrian.");
                    break;
                }
                case 2 -> {
                    antrian.print();
                    break;
                }
                case 3 -> {
                    System.out.println(">> Jumlah kendaraan dalam antrian: " + antrian.jumlahAntrian());
                    break;
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